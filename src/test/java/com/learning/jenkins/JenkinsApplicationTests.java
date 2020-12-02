package com.learning.jenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsApplicationTests {

	@Test
	public  void shouldGetTheUsername(){
		Assertions.assertEquals("Vikram", System.getenv("Username"));
		System.out.println(System.getenv());
	}

}
