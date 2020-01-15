package com.tdd.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class WindowsControllerTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void test() throws Exception {
        System.out.println(">>>>>>>>>>>>>>>>>> Test with call Server is running");
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/help", String.class))
				.contains("Ok This is Our Help for You! :)");
    }

}