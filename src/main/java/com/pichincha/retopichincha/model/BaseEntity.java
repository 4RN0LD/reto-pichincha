package com.pichincha.retopichincha.model;

import lombok.Getter;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.security.core.userdetails.User;

import java.time.LocalDateTime;

@Getter
public abstract class BaseEntity {

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private User createdBy;

}
