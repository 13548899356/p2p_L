package com.zking.ssm.services.impl;

import com.zking.ssm.mapper.BiddingMapper;
import com.zking.ssm.model.Bidding;
import com.zking.ssm.services.IBiddingService;
import com.zking.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BiddingServiceImpl implements IBiddingService {

    @Autowired
    private BiddingMapper biddingMapper;

    @Override
    public List<Bidding> BiddingList(Bidding bidding, PageBean pageBean) {
        return biddingMapper.BiddingList(bidding);
    }

    @Override
    public int Update(Bidding bidding) {
        return biddingMapper.Update(bidding);
    }

    @Override
    public int Updatecg(Bidding bidding) {
        return biddingMapper.Updatecg(bidding);
    }
}
