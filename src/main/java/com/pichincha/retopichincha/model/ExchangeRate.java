package com.pichincha.retopichincha.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table
public class ExchangeRate extends BaseEntity {
    @Id
    private Long id;

    private String sourceCurrency;
    private String targetCurrency;
    private double exchangeRate;
}
