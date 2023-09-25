package com.demoapplication.demoforlearning;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * DemoforlearningApplication
 */
@SpringBootApplication
@ComponentScan("com.demoapplication.demoforlearning")
// @SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DemoforlearningApplication {
	public static void main(String[] args) {
	SpringApplication.run(DemoforlearningApplication.class, args);
}
	
}