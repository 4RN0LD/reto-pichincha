package com.pichincha.retopichincha.repository;

import com.pichincha.retopichincha.model.ExchangeRate;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Mono;

public interface ExchangeRateRepository extends R2dbcRepository<ExchangeRate, Long> {
    Mono<ExchangeRate> findBySourceCurrencyAndTargetCurrency(String sourceCurrency, String targetCurrency);
}
