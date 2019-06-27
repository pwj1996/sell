package com.zcx.sell.enums;

import lombok.Getter;

/**
 * @author zoucaoxin
 * @date 2019/6/21 - 16:30
 * @description
 */
@Getter
public enum PayStatusEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;

    private Integer code;

    private String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
