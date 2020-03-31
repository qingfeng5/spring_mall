package com.qingfeng.service;

import com.github.pagehelper.PageInfo;
import com.qingfeng.common.ServerResponse;
import com.qingfeng.vo.OrderVo;

import java.util.Map;

/**
 * @author 清风
 * @date 2020/2/20 10:15
 */
public interface IOrderService {
    //支付功能
    ServerResponse pay(Long orderNo, Integer userId, String path);
    //回调函数
    ServerResponse aliCallback(Map<String,String> params);
    //前台返回的订单状态
    ServerResponse queryOrderPayStatus(Integer userId,Long orderNo);
    ServerResponse createOrder(Integer userId,Integer shippingId);
    ServerResponse<String> cancel(Integer userId,Long orderNo);
    ServerResponse getOrderCartProduct(Integer userId);
    ServerResponse<OrderVo> getOrderDetail(Integer userId, Long orderNo);
    ServerResponse<PageInfo> getOrderList(Integer userId, int pageNum, int pageSize);



    //backend
    ServerResponse<PageInfo> manageList(int pageNum,int pageSize);
    ServerResponse<OrderVo> manageDetail(Long orderNo);
    ServerResponse<PageInfo> manageSearch(Long orderNo,int pageNum,int pageSize);
    ServerResponse<String> manageSendGoods(Long orderNo);

}
