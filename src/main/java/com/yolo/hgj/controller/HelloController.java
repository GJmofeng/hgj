package com.yolo.hgj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hgj")
    public String index() {
        System.out.println("hello");
        return "202209512217黄国建";
    }
}
