package com.zcx.sell.pojo;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @author zoucaoxin
 * @date 2019/6/13
 * @description 商品信息
 */
@Entity
@Data
public class ProductInfo {

    @Id
    private String productId;

    /**
     * 名字
     */
    private String productName;

    /**
     * 单价
     */
    private BigDecimal productPrice;

    /**
     * 库存
     */
    private Integer productStock;

    /**
     * 商品描述
     */
    private String productDescription;

    /**
     *商品图标
     */
    private String productIcon;

    /**
     * 状态，0-正常，1-下架
     */
    private Integer productStatus;

    /**
     * 类目编号
     */
    private Integer categoryType;

}
