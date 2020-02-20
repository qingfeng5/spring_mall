package com.qingfeng.service;

import com.github.pagehelper.PageInfo;
import com.qingfeng.common.ServerResponse;
import com.qingfeng.pojo.Shipping;

/**
 * @author 清风
 * @date 2020/2/20 10:15
 */
public interface IShippingService {
    ServerResponse add(Integer userId, Shipping shipping);
    ServerResponse<String> del(Integer userId,Integer shippingId);
    ServerResponse update(Integer userId, Shipping shipping);
    ServerResponse<Shipping> select(Integer userId, Integer shippingId);
    ServerResponse<PageInfo> list(Integer userId, int pageNum, int pageSize);
}
