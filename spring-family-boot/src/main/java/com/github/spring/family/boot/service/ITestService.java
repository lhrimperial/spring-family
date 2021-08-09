package com.github.spring.family.boot.service;

import com.github.spring.family.boot.mapper.entity.BaseEntity;
import com.github.spring.family.boot.mapper.entity.TestEntity;

/**
 * @author hairen.long
 * @date 2021/8/5
 */
public interface ITestService {

    TestEntity getById(BaseEntity baseEntity);
}
