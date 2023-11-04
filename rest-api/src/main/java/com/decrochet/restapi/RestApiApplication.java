package com.decrochet.restapi;

import com.decrochet.restapi.config.DatasourceConfig;
import com.decrochet.restapi.config.FlyWayConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RestApiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(RestApiApplication.class, args);

		DatasourceConfig datasourceConfig = context.getBean(DatasourceConfig.class);
		FlyWayConfig flyWayConfig = context.getBean(FlyWayConfig.class);
	}
}
