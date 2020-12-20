package com.business.feign.controller;

import com.business.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    @RequestMapping("/hi")
    public String hi(String name){
        String value = feignService.hi(name);
        return value;
    }
}
