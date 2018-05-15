package com.songguoliang.springboot.controller;

import com.songguoliang.springboot.model.FastjsonTest;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author sgl
 * @Date 2018-05-08 13:55
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/fastjson")
    public FastjsonTest getFastJson() {
        FastjsonTest fastjsonTest = new FastjsonTest();
        fastjsonTest.setId(1);
        fastjsonTest.setString("fastjson test");
        fastjsonTest.setIgnore("ignore field");
        return fastjsonTest;
    }

    @RequiresPermissions("users1:show")
    @GetMapping("/users111")
    public String test1(){
        return "users";
    }

    @RequiresPermissions("users1:sh")
    @GetMapping("/users211")
    public String test2(){
        return "users";
    }

}
