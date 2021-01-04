package com.business.feign.service;

import com.business.feign.service.fallback.FeignServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "provider",fallback = FeignServiceHystric.class)
public interface FeignService {

    @RequestMapping("/hi")
    String hi(@RequestParam(value = "name")String name);
}
