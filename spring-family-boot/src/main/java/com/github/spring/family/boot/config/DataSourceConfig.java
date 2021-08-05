package com.github.spring.family.boot.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Configurable;

/**
 * @author hairen.long
 * @date 2021/8/5
 */
@Configurable
@MapperScan("com.github.spring.family.boot.mapper")
public class DataSourceConfig {
}
