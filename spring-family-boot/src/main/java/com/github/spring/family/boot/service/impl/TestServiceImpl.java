package com.github.spring.family.boot.service.impl;

import com.github.spring.family.boot.mapper.TestMapper;
import com.github.spring.family.boot.mapper.entity.TestEntity;
import com.github.spring.family.boot.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hairen.long
 * @date 2021/8/5
 */
@Service
public class TestServiceImpl implements ITestService {

    @Autowired
    TestMapper testMapper;

    @Override
    public TestEntity getById(Long id) {
        return testMapper.getById(id);
    }
}
