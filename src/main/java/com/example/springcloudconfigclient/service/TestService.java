package com.example.springcloudconfigclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class TestService {

    @Value("${config.name}")
    private String name;

    @Value("${config.msg}")
    private String msg;

    public String getConfig() {
        return name + " : " + msg;
    }
}
