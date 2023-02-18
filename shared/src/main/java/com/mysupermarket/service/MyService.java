package com.mysupermarket.service;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@EnableConfigurationProperties(ServiceProperties.class)
public class MyService {
    private final ServiceProperties serviceProperties;
    public String message () {
       return this.serviceProperties.getMessage();
    }
}
