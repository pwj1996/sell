package com.zcx.sell.dto;

import lombok.Getter;

/**
 * @author zoucaoxin
 * @date 2019/6/24 - 11:39
 * @description 购物车
 */
@Getter
public class CartDTO {

    /**
     * 商品id
     */
    private String productId;

    /**
     * 商品数量
     */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
