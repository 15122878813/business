package com.business.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

    @Autowired(required = false)
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public String hiService(String name){
        String forObject = restTemplate.getForObject("http://provider/hi?name=" + name, String.class);
        return forObject;
    }

    //熔断方法
    public String fallback(String name){
        return "fallback is name = " + name;
    }
}
