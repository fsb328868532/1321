package com.example.demo222.service;

import com.example.demo222.entity.Fruit;
import com.example.demo222.util.PriceStrategyEnum;

import java.math.BigDecimal;
import java.util.List;

public interface PricingStrategy {
    /**
     * 价格计算
     * @param fruit 水果
     * @param num 购买数量
     * @return
     */
    BigDecimal calculatePrice(Fruit fruit,BigDecimal num);


}