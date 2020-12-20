package com.business.ribbon.controller;

import com.business.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description ribbon 可以作为微服务项目中的负载均衡器，loadBalance注解启用时，会自动开启默认的负载均衡设置
 * @date 2020-12-20
 * @ahthor zhangqiang
 */
@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @RequestMapping(method = RequestMethod.GET,value = "/hi")
    public String hi(String name){
        return this.ribbonService.hiService(name);
    }
}
