package com.example.springcloudconfigclient.controller;

import com.example.springcloudconfigclient.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping(value="/content")
    public String getConfigContent(){
        return testService.getConfig();
    }
}
