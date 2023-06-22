package com.pichincha.retopichincha.dto;
import lombok.Data;

@Data
public class CurrencyConversion {
    private String sourceCurrency;
    private String targetCurrency;
    private double ammount;
}
