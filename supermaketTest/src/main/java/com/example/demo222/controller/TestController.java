package com.example.demo222.controller;


import com.example.demo222.entity.FruitReq;
import com.example.demo222.service.PricingStrategy;
import com.example.demo222.util.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController extends BaseController {

    @Autowired
    private PricingStrategy pricingStrategy;

    @PostMapping("/questionOne")
    public AjaxResult questionOne(@RequestBody List<FruitReq> fruitList) {
        if (CollectionUtils.isEmpty(fruitList)) {
            return AjaxResult.error("数据不能为空");
        }
        BigDecimal payAmt = new BigDecimal(0);
        fruitList.forEach(fruit -> {
            BigDecimal fruitPrice = pricingStrategy.calculatePrice(fruit.getFruit(), fruit.getNum());
            payAmt.add(fruitPrice);
        });
        return AjaxResult.success(payAmt);
    }
}
