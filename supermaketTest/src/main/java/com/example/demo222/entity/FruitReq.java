package com.example.demo222.entity;

import com.example.demo222.util.PriceStrategyEnum;

import java.math.BigDecimal;


public class FruitReq {

    /**
     * 水果类型
     */
    private Fruit fruit;

    /**
     * 购买数量
     */
    private BigDecimal num;


    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public BigDecimal getNum() {
        return num;
    }

    public void setNum(BigDecimal num) {
        this.num = num;
    }
}