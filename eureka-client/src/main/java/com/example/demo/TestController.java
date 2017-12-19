package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * company :天成科技
 * Created by zxg on 2017/12/19
 */
@RestController
public class TestController {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return name+" t est";
    }
}
