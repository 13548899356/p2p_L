package com.zking.ssm.mapper;

import com.zking.ssm.model.Bidding;

import java.util.List;

public interface BiddingMapper {
    int deleteByPrimaryKey(String id);

    int insert(Bidding record);

    int insertSelective(Bidding record);

    Bidding selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Bidding record);

    int updateByPrimaryKey(Bidding record);

    //查询
    List<Bidding> BiddingList(Bidding bidding);

    //审核失败
    int Update(Bidding bidding);

    //审核成功
    int Updatecg(Bidding bidding);
}