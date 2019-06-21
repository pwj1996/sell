package com.zcx.sell.service;

import com.zcx.sell.pojo.ProductCategory;

import java.util.List;

/**
 * @author zoucaoxin
 * @date 2019/6/19 - 17:07
 * @description 类目
 */
public interface CategoryService {

    /**
     * 后台查询一条记录
     * @param categoryId
     * @return
     */
    ProductCategory findOne(Integer categoryId);

    /**
     * 后台查询所有记录
     * @return
     */
    List<ProductCategory> findAll();

    /**
     * 买家端通过 type 查询 类目
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    /**
     * 新增商品类目
     * @param productCategory
     * @return
     */
    ProductCategory save(ProductCategory productCategory);
}
