package com.vmk.JenkinsIntegration.JekinsIntegrationExample;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JekinsIntegrationExampleApplicationTests {
	private static Logger logger = LoggerFactory.getLogger(JekinsIntegrationExampleApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info(" Test :: Aplication has started");
		assertEquals(true,true);
	}

}
