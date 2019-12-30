package com.demo01ssm.controller;

/*
 *@Date: 15:17 2019/12/30
 *@Description:
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("index")
    public String getIndex(){
        return "index";
    }
}
