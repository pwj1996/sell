package com.zcx.sell.service.impl;

import com.zcx.sell.enums.ProductStatusEnum;
import com.zcx.sell.pojo.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author zoucaoxin
 * @date 2019/6/21 - 10:16
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest

public class ProductInfoServiceImplTest {

    @Autowired
    private ProductInfoServiceImpl productInfoService;

    @Test
    public void findOne() throws Exception {
        ProductInfo productInfo = productInfoService.findOne("123456");
        Assert.assertNotNull(productInfo);
    }

    @Test
    public void findUpAll() throws Exception {
        List<ProductInfo> upAll = productInfoService.findUpAll();
        Assert.assertNotEquals(0, upAll.size());
    }

    @Test
    public void findAll() throws Exception {
        PageRequest request = new PageRequest(0, 2);
        Page<ProductInfo> all = productInfoService.findAll(request);
//        System.out.println(all.getTotalElements());
        Assert.assertNotEquals(0, all.getTotalElements());
    }

    @Test
    public void save() throws Exception {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123456789");
        productInfo.setProductName("炸土豆");
        productInfo.setProductPrice(new BigDecimal(6.6));
        productInfo.setProductStock(9);
        productInfo.setProductDescription("hin好吃！");
        productInfo.setProductIcon("http://xxxxx.jpg");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType(2);

        ProductInfo save = productInfoService.save(productInfo);
        Assert.assertNotNull(save);
    }

}