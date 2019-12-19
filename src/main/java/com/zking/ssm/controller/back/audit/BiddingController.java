package com.zking.ssm.controller.back.audit;

import com.zking.ssm.model.*;
import com.zking.ssm.services.IBiddingService;
import com.zking.ssm.services.IBorrowmoneyService;
import com.zking.ssm.services.ISysUserService;
import com.zking.ssm.util.PageBean;
import com.zking.ssm.util.jsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/bidding")
public class BiddingController {

    @Autowired
    private IBiddingService biddingService;

    @Autowired
    private IBorrowmoneyService borrowmoneyService;

    @Autowired
    private ISysUserService sysUserService;

    private sysUser sysUser;
    private Borrowmoney borrowmoney;


    @ModelAttribute
    public void init(){
        System.out.println("init");
        borrowmoney=new Borrowmoney();
        sysUser=new sysUser();

    }

    //三表联查
    @RequestMapping("/List")
    @ResponseBody
    public Object List(Bidding bidding, PageBean pageBean){
        List<Bidding> biddings = biddingService.BiddingList(bidding, pageBean);
        List<Bidding> list=new ArrayList<>();
        for (Bidding biddi: biddings) {
            borrowmoney.setUid(biddi.getUid());
            sysUser.setUid(biddi.getUid());
            biddi.setBorrowmoney(borrowmoneyService.BorrowmoneyList(borrowmoney,pageBean).get(0));
            biddi.setSysUser(sysUserService.getListUser(sysUser,pageBean).get(0));
            list.add(biddi);
        }
        return jsonData.toJsonPager("",true,biddings.size(),list);
    }


    //审核失败
    @RequestMapping("/Update")
    @ResponseBody
    public Object Update(Bidding bidding){
        int update = biddingService.Update(bidding);
        return jsonData.toJsonObject(true,update);
    }


    //审核成功
    @RequestMapping("/updatecg")
    @ResponseBody
    public Object updatecg(Bidding bidding){
        int update = biddingService.Updatecg(bidding);
        return jsonData.toJsonObject(true,update);
    }


}
