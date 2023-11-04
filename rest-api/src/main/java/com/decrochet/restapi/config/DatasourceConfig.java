package com.decrochet.restapi.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
@RequiredArgsConstructor
public class DatasourceConfig {

    private final Environment environment;

    @Bean
    public DataSource datasource() {
         return DataSourceBuilder.create()
                .driverClassName(environment.getRequiredProperty("spring.datasource.driver-class-name"))
                .url(environment.getRequiredProperty("spring.datasource.url"))
                .username(environment.getRequiredProperty("spring.datasource.username"))
                .password(environment.getRequiredProperty("spring.datasource.password"))
                .build();
    }
}

