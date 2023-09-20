package com.demoapplication.demoforlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * DemoforlearningApplication
 */
// @SpringBootApplication
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DemoforlearningApplication {
public static void main(String[] args) {
	SpringApplication.run(DemoforlearningApplication.class, args);
}
	
}