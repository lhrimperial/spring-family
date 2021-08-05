package com.github.spring.family.boot.mapper;

import com.github.spring.family.boot.mapper.entity.TestEntity;

/**
 * @author hairen.long
 * @date 2021/8/5
 */
public interface TestMapper {

    TestEntity getById(long id);
}
