package com.example.demo222.service.impl;

import com.example.demo222.entity.Apple;
import com.example.demo222.entity.Fruit;
import com.example.demo222.entity.Strawberry;
import com.example.demo222.service.PricingStrategy;
import com.example.demo222.util.PriceStrategyEnum;
import com.example.demo222.util.WeightConverter;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;


/**
 * 水果价格计算
 */
@Service
public class RegularPricingStrategy implements PricingStrategy {


    @Override
    public BigDecimal calculatePrice(Fruit fruit, BigDecimal num) {
        if (num.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("购买的水果数量必须为大于等于 0 的整数");
        }
        if (fruit instanceof Apple) {
            Apple apple = (Apple) fruit;
            return getFruitPrice(apple, num);
        } else if (fruit instanceof Strawberry) {
            Strawberry strawberry = (Strawberry) fruit;
            return getFruitPrice(strawberry, num);
        }
        return null;
    }



    private BigDecimal getFruitPrice(Fruit fruit, BigDecimal num) {
        BigDecimal price = new BigDecimal(0);
        switch (fruit.getType()) {
            case cattyPrice:
                //斤 = 单价*斤数
                price = fruit.getPrice().multiply(num);
                break;
            case kilogramPrice:
                //公斤=斤*2*单价
                price = WeightConverter.kiloToJin(fruit.getPrice()).multiply(num);
                break;
        }
        return price;
    }

}
