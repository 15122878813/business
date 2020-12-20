package com.business.ribbon.controller;

import com.business.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @RequestMapping(method = RequestMethod.GET,value = "/hi")
    public String hi(String name){
        return this.ribbonService.hiService(name);
    }
}
