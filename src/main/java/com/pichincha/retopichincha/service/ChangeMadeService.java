package com.pichincha.retopichincha.service;

import com.pichincha.retopichincha.model.ChangeMade;
import com.pichincha.retopichincha.repository.ChangeMadeRepository;
import com.pichincha.retopichincha.repository.ExchangeRateRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class ChangeMadeService {
    private ChangeMadeRepository changeMadeRepository;
    private ExchangeRateRepository exchangeRateRepository;

    public Mono<ChangeMade> conversion(){
        return Mono.empty();
    }

}
