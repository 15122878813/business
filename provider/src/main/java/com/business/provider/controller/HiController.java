package com.business.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @RequestMapping("/hi")
    public String hi(@RequestParam(defaultValue = "minbo",value = "name") String result){
        return result;
    }
}
