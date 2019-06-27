package com.zcx.sell.exception;

import com.zcx.sell.enums.ResultEnum;

/**
 * @author zoucaoxin
 * @date 2019/6/24 - 10:38
 * @description
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String defaultMessage) {
        super(defaultMessage);
        this.code = code;
    }
}
