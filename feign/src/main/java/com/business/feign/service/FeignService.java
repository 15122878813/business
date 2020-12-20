package com.business.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("provider")
public interface FeignService {

    @RequestMapping("/hi")
    String hi(String name);
}
