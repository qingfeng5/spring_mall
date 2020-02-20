package com.qingfeng.dao;

import com.qingfeng.pojo.Category;

import java.util.List;

public interface CategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);

//    根据categoryid获取孩子的分类信息
    List<Category> selectCategoryChildrenByParentId(Integer parentId);
}