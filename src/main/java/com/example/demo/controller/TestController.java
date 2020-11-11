package com.example.demo.controller;

import com.example.demo.dao.TorderDAO;
import com.example.demo.domain.TOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class TestController {
    @Autowired
    TorderDAO torderDAO;

    @RequestMapping("insertOrder")
    public String test1() {


        for (int i = 0; i < 5; i++) {
            TOrder order = new TOrder();
            order.setOrderNo("A000" + i);
            order.setCreateName("订单 " + i);
            order.setUserId(Long.parseLong(i + ""));
            order.setPrice(new BigDecimal("" + i));
            torderDAO.insert(order);
        }
        return "success";
    }
}
