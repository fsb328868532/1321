package com.example.demo222.util;

import java.math.BigDecimal;

public class WeightConverter {
    public static BigDecimal kiloToJin(BigDecimal kilo) {
        return kilo.multiply(new BigDecimal("2"));
    }
}