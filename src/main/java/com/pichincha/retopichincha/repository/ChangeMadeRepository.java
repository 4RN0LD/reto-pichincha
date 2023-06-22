package com.pichincha.retopichincha.repository;

import com.pichincha.retopichincha.model.ChangeMade;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface ChangeMadeRepository extends R2dbcRepository<ChangeMade, Long> {
}
