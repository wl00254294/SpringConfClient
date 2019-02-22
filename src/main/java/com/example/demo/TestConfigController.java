package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestConfigController {
	@Value("${from}")
    private String from;
	@Value("${from2}")
    private String from2;
   
	@RequestMapping("/from")
    public String from() {
        return from;
    }
	@RequestMapping("/from2")
    public String from2() {
        return from2;
    }
}
