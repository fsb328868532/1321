package com.example.demo222.entity;

import com.example.demo222.service.PricingStrategy;
import com.example.demo222.util.PriceStrategyEnum;

import java.math.BigDecimal;


public abstract class Fruit {
    /**
     * 水果名称
     */
    protected String name;

    /**
     * 水果称重类型
     */
    protected PriceStrategyEnum type;
    /**
     * 水果价格
     */
    protected BigDecimal price;

    public Fruit(String name, BigDecimal price,PriceStrategyEnum type) {
        this.name = name;
        this.type=type;
        this.price = price;
    }

    protected Fruit() {
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