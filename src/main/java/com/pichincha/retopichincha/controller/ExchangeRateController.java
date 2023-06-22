package com.pichincha.retopichincha.controller;

import com.pichincha.retopichincha.dto.CurrencyConversion;
import com.pichincha.retopichincha.model.ChangeMade;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/exchange-rates")
public class ExchangeRateController {

    @PostMapping("/conversion")
    public Mono<ChangeMade> conversion(@RequestBody CurrencyConversion currencyConversion){
        return Mono.empty();
    }
}
