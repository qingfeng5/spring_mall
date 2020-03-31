package com.qingfeng.dao;

import com.qingfeng.pojo.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    //支付订单功能
    Order selectByUserIdAndOrderNo(@Param("userId")Integer userId, @Param("orderNo")Long orderNo);

    //查询订单存在功能
    Order selectByOrderNo(Long orderNo);

    List<Order> selectByUserId(Integer userId);


    List<Order> selectAllOrder();
}
