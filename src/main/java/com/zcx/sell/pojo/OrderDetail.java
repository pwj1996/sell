package com.zcx.sell.pojo;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @author zoucaoxin
 * @date 2019/6/13
 * @description 订单详情
 */
@Entity
@Data
public class OrderDetail {

    /**
     * 订单详情id
     */
    @Id
    private String detailId;

    /**
     * 订单id
     */
    private String orderId;

    /**
     * 商品id
     */
    private String productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品单价
     */
    private BigDecimal productPrice;

    /**
     * 商品数量
     */
    private int productQuantity;

    /**
     * 商品图标
     */
    private String productIcon;
}
