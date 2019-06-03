package com.zcx.sell;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zoucaoxin
 * @date 2019/6/4
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
//@Data
public class LoggerTest {


    @Test
    public void test1() {
        String name = "test";
        String pwd = "123456";
        log.debug("debug...");
//        log.info("name: " + name + ", password: " + pwd);
        log.info("name: {}, password: {}", name, pwd);
        log.error("error...");
        log.warn("warn...");
    }
}
