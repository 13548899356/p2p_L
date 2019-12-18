package com.zking.ssm.controller.back.power;

import com.zking.ssm.model.CorporateDeposit;
import com.zking.ssm.model.Loan;
import com.zking.ssm.services.ICorporateDepostitService;
import com.zking.ssm.util.jsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Corporate")
public class CorporateDepostitCotroller {

    @Autowired
    private ICorporateDepostitService depostitService;


    @RequestMapping("/Update")
    @ResponseBody
    public Object Update(CorporateDeposit corporateDeposit){
        int update = depostitService.Update(corporateDeposit);
        return jsonData.toJsonObject(true,update);
    }


}
