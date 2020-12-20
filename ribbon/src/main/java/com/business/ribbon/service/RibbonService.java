package com.business.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

    @Autowired(required = false)
    private RestTemplate restTemplate;

    public String hiService(String name){
        String forObject = restTemplate.getForObject("http://provider/hi?name=" + name, String.class);
        return forObject;
    }
}
