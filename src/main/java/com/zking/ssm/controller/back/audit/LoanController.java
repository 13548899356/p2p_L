package com.zking.ssm.controller.back.audit;

import com.zking.ssm.model.Dictionary;
import com.zking.ssm.model.Loan;
import com.zking.ssm.model.Product;
import com.zking.ssm.model.sysUser;
import com.zking.ssm.services.IDictionaryService;
import com.zking.ssm.services.ILoanService;
import com.zking.ssm.services.IProductService;
import com.zking.ssm.services.ISysUserService;
import com.zking.ssm.util.PageBean;
import com.zking.ssm.util.uuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zking.ssm.util.jsonData;

import java.util.List;

@Controller
@RequestMapping("/loan")
public class LoanController {

    @Autowired
    private ILoanService loanService;

    @Autowired
    private IProductService productService;

    @Autowired
    private ISysUserService sysUserService;

    @Autowired
    private IDictionaryService dictionaryService;


    private Loan loan;
    private Product product;
    private sysUser sysUser;
    private Dictionary dictionary;

    @ModelAttribute
    public void init(){
        System.out.println("init");
        loan=new Loan();
        product=new Product();
        sysUser=new sysUser();
        dictionary =new Dictionary();
    }

    @RequestMapping("/List")
    @ResponseBody
    public Object List(Loan loan,PageBean pageBean){
        List<Loan> loans = loanService.ListLoan(loan,pageBean);
        System.out.println(pageBean.getTotal());
        for (Loan loan1:loans) {
            sysUser.setUid(loan1.getUid());
            product.setId(loan1.getPid());
            loan1.setSysUser(sysUserService.getListUser(sysUser,pageBean).get(0));
            loan1.setProduct(productService.getListProduct(product,pageBean).get(0));
        }
        return jsonData.toJsonPager("",true,loans.size(),loans);
    }

    @RequestMapping("/TypeList")
    @ResponseBody
    public Object TypeList(Dictionary dictionary){
        List<Dictionary> dictionaries = dictionaryService.hdList(dictionary);
        return  jsonData.toJsonObject(true,dictionaries);
    }


    //添加贷款认证
    @RequestMapping("/addLoan")
    @ResponseBody
    public Object addLoan(Loan loan){
        loan.setId(uuidUtil.getUUID());
        int n = loanService.insert(loan);
        if(n>0){
            return jsonData.toJsonMessage("贷款项目审核提交成功",true);
        }else{
            return jsonData.toJsonMessage("",false);
        }

    }

//查询该用户所认证的项目
    @RequestMapping("/lookLoanByUser")
    @ResponseBody
    public Object lookLoanByUser(Loan loan){
        List<Loan> loans = loanService.ListLoan(loan, null);
        if(loans.size()!=0){
            return jsonData.toJsonObject(true,loans);
        }else{
            return jsonData.toJsonMessage("",false);
        }
    }

    //审核失败
    @RequestMapping("/Update")
    @ResponseBody
    public Object Update(Loan loan){
        int update = loanService.Update(loan);
        return jsonData.toJsonObject(true,update);
    }

    //审核成功
    @RequestMapping("/updatecg")
    @ResponseBody
    public Object updatecg(Loan loan){
        int update = loanService.Updatecg(loan);
        return jsonData.toJsonObject(true,update);
    }
}

