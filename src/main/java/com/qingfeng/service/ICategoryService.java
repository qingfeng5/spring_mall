package com.qingfeng.service;

import com.qingfeng.common.ServerResponse;
import com.qingfeng.pojo.Category;

import java.util.List;

/**
 * @author 清风
 * @date 2020/2/19 10:47
 */
public interface ICategoryService {
    //添加分类
    ServerResponse addCategory(String categoryName, Integer parentId);
    //更新分类
    ServerResponse updateCategoryName(Integer categoryId,String categoryName);
    //获取孩子的分类信息
    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);
    /**递归查询子节点的信息**/
    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);
}
