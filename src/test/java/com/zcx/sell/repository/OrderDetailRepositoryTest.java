package com.zcx.sell.repository;

import com.zcx.sell.pojo.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author zoucaoxin
 * @date 2019/6/21 - 17:02
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("123546");
        orderDetail.setOrderId("624786");
        orderDetail.setProductIcon("http://xxxxx.jpg");
        orderDetail.setProductId("55555");
        orderDetail.setProductName("青椒肉丝");
        orderDetail.setProductPrice(new BigDecimal(5.9));
        orderDetail.setProductQuantity(15);

        OrderDetail save = repository.save(orderDetail);
        Assert.assertNotNull(save);
    }

    @Test
    public void findByOrderId() throws Exception {
        List<OrderDetail> orderDetailList = repository.findByOrderId("66666");
        Assert.assertNotEquals(0, orderDetailList.size());
    }

}