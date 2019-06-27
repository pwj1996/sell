package com.zcx.sell.utils;

import java.util.Random;

/**
 * @author zoucaoxin
 * @date 2019/6/24 - 10:50
 * @description
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式：时间 + 随机数
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer num = random.nextInt(9000000) + 100000;
        return System.currentTimeMillis() + String.valueOf(num);
    }
}
