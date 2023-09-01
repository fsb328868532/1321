package com.example.demo222.entity;

import com.example.demo222.util.PriceStrategyEnum;

import java.math.BigDecimal;


public class Apple extends Fruit {
    /**
     * 水果名称
     */
    private String name;

    /**
     * 水果称重类型
     */
    private PriceStrategyEnum type;
    /**
     * 水果价格
     */
    private BigDecimal price;

    public Apple(String name, BigDecimal price, PriceStrategyEnum type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PriceStrategyEnum getType() {
        return type;
    }

    public void setType(PriceStrategyEnum type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}