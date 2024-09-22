package com.yolo.hgj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private String id = "2022";
    private String name = "黄国建";

    @GetMapping("/student")
    public String getStudentInfo() {
        return "学号：" + id + "，姓名：" + name;
    }
}
