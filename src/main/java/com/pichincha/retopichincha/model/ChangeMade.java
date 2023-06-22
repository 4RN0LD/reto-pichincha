package com.pichincha.retopichincha.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table
public class ChangeMade extends BaseEntity{
    @Id
    private Long id;

    private ExchangeRate exchangeRate;
    private String sourceAmmount;
    private String targetAmmount;
}
