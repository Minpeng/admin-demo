package com.admin.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pengm on 2018/6/11.
 */
@RestController
public class DemoController {
    @RequestMapping("/adminDemo")
    public String indexDemo(){
        return "hello admin-demo";
    }
}