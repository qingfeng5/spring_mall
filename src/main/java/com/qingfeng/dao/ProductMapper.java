package com.qingfeng.dao;

import com.qingfeng.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    /**管理后台商品李彪动态分页功能**/
    List<Product> selectList();

    /**后台商品搜索功能**/
    List<Product> selectByNameAndProductId(@Param("productName")String productName, @Param("productId") Integer productId);

    /**前端搜索排序功能**/
    List<Product> selectByNameAndCategoryIds(@Param("productName")String productName,@Param("categoryIdList")List<Integer> categoryIdList);

}