package com.qingfeng.service;

import com.github.pagehelper.PageInfo;
import com.qingfeng.common.ServerResponse;
import com.qingfeng.pojo.Product;
import com.qingfeng.vo.ProductDetailVo;

/**
 * @author 清风
 * @date 2020/2/19 15:59
 */
public interface IProductService {
    //更新新增产品
    ServerResponse saveOrUpdateProduct(Product product);

    //产品上下架，更新产品销售的状态
    ServerResponse<String> setSaleStatus(Integer productId,Integer status);

    /**管理后台商品李彪动态分页功能**/
    ServerResponse<ProductDetailVo> manageProductDetail(Integer productId);

    /**后台商品搜索功能**/
    ServerResponse<PageInfo> getProductList(int pageNum, int pageSize);

    /**前端搜索产品动态分页**/
    ServerResponse<PageInfo> searchProduct(String productName,Integer productId,int pageNum,int pageSize);

    ServerResponse<ProductDetailVo> getProductDetail(Integer productId);

    ServerResponse<PageInfo> getProductByKeywordCategory(String keyword,Integer categoryId,int pageNum,int pageSize,String orderBy);

}
