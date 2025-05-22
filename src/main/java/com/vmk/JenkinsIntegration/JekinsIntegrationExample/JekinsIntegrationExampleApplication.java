package com.vmk.JenkinsIntegration.JekinsIntegrationExample;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JekinsIntegrationExampleApplication {

	Logger logger = LoggerFactory.getLogger(JekinsIntegrationExampleApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application initialized ....");
	}
	public static void main(String[] args) {

		SpringApplication.run(JekinsIntegrationExampleApplication.class, args);
		logger.info("Application started ....");
	}

}
