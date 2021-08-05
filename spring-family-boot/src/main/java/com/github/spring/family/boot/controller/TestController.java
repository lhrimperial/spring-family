package com.github.spring.family.boot.controller;

import com.github.spring.family.boot.mapper.entity.TestEntity;
import com.github.spring.family.boot.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hairen.long
 * @date 2021/8/5
 */
@RestController
public class TestController {

    @Autowired ITestService testService;

    @RequestMapping("/boot/test/{id}")
    TestEntity getById(@PathVariable Long id) {
        return testService.getById(id);
    }
}
