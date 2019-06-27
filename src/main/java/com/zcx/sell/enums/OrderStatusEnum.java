package com.zcx.sell.enums;

import lombok.Getter;

/**
 * @author zoucaoxin
 * @date 2019/6/21 - 16:26
 * @description
 */
@Getter
public enum OrderStatusEnum {

    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消");

    private Integer code;

    private String msg;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
