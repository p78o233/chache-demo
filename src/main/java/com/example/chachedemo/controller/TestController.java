package com.example.chachedemo.controller;

import com.example.chachedemo.entity.po.Test;
import com.example.chachedemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/test")
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping(value = "/getTestById/{id}")
    public Test getTestById(@PathVariable("id")int id){
        return testService.getTestById(id);
    }

    @PostMapping(value = "/updateTest")
    public Test updateTest(@RequestBody Test test){
         return testService.updateTest(test);
    }

    @PostMapping(value = "/deleteTest/{id}")
    private void deleteTest(@PathVariable("id")int id){
        testService.deleteTest(id);
    }
}
