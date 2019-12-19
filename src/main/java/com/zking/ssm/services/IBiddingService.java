package com.zking.ssm.services;

import com.zking.ssm.model.Bidding;
import com.zking.ssm.util.PageBean;

import java.util.List;

public interface IBiddingService {
    //查询
    List<Bidding> BiddingList(Bidding bidding, PageBean pageBean);

    //审核失败
    int Update(Bidding bidding);

    //审核成功
    int Updatecg(Bidding bidding);

}


