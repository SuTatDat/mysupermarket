package com.mysupermarket.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties("service")
@Getter
@Setter
public class ServiceProperties {
    private String message;
}
