package com.qingfeng.service;

import com.qingfeng.common.ServerResponse;
import com.qingfeng.vo.CartVo;

/**
 * @author 清风
 * @date 2020/2/20 10:12
 */
public interface ICartService {
    ServerResponse<CartVo> add(Integer userId, Integer productId, Integer count);
    ServerResponse<CartVo> update(Integer userId,Integer productId,Integer count);
    ServerResponse<CartVo> deleteProduct(Integer userId,String productIds);

    ServerResponse<CartVo> list (Integer userId);
    ServerResponse<CartVo> selectOrUnSelect (Integer userId,Integer productId,Integer checked);
    ServerResponse<Integer> getCartProductCount(Integer userId);

}
