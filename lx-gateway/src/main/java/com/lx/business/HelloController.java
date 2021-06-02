package com.lx.business;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

}
