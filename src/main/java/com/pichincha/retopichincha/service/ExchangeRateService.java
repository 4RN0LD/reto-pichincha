package com.pichincha.retopichincha.service;

import com.pichincha.retopichincha.model.ExchangeRate;
import com.pichincha.retopichincha.repository.ExchangeRateRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class ExchangeRateService {

    private ExchangeRateRepository exchangeRateRepository;

    public Mono<ExchangeRate> save(ExchangeRate exchangeRate) {
        exchangeRate.setId(null);
        return exchangeRateRepository.save(exchangeRate);
    }

    public Mono<ExchangeRate> update(ExchangeRate exchangeRate) {
        return exchangeRateRepository.save(exchangeRate);
    }

    public Mono<ExchangeRate> findByCurrencies(String sourceCurrency, String targetCurrency) {
        return exchangeRateRepository.findBySourceCurrencyAndTargetCurrency(sourceCurrency, targetCurrency);
    }

    public Mono<ExchangeRate> findById(Long id) {
        return exchangeRateRepository.findById(id);
    }

}
