/*
 * @Description: HelloController
 * @Date: 2021/4/16
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello Srping";
    }

    @GetMapping("/world")
    public String world(){
        return "Hello Srping world";
    }

    @GetMapping("/jacoco")
    public String jacoco(){
        return "Hello jacoco";
    }

}
