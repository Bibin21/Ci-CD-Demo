package com.example.Jenkins.controller;

import com.example.Jenkins.service.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BaseController {
    @Autowired
    private StringService stringService;

    @GetMapping("{name}")
    public String getMessage(@PathVariable String name){
        return "Hello "+name;
    }
    @GetMapping("length/{name}")
    public String getLength(@PathVariable String name){
        return "Length of String is : "+stringService.findLength(name);
    }
    @GetMapping("ascii-sum/{name}")
    public String getASCIISum(@PathVariable String name){
        return "ASCII Sum of String is : "+stringService.findASCIISum(name);
    }
}
