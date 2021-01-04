package com.business.feign.service.fallback;

import com.business.feign.service.FeignService;
import org.springframework.stereotype.Component;

@Component
public class FeignServiceHystric implements FeignService {
    @Override
    public String hi(String name) {
        return "feign is fallback :" + name;
    }
}
