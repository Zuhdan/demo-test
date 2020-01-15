package com.tdd.example.demo;

import com.tdd.example.demo.controller.WindowsController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private WindowsController windowsController;

	@Test
	void contextLoads() throws Exception{
		System.out.println(">>>>>>>>>>>>>>>>>> Test is running");
		assertThat(windowsController).isNotNull();
	}

}
