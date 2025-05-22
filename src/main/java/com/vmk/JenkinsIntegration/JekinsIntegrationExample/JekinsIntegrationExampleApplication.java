package com.vmk.JenkinsIntegration.JekinsIntegrationExample;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JekinsIntegrationExampleApplication {

	private static Logger logger = LoggerFactory.getLogger(JekinsIntegrationExampleApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Main Application initialized ....");
	}
	public static void main(String[] args) {

		SpringApplication.run(JekinsIntegrationExampleApplication.class, args);
		logger.info("Main Application started  ....");
	}

}
