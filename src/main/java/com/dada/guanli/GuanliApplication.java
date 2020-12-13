package com.dada.guanli;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.dada.guanli"})
@MapperScan("com.dada.guanli.dao")
public class GuanliApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuanliApplication.class, args);
	}

}
