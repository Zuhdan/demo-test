package com.tdd.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class WindowsControllerMockMvcTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        System.out.println(">>>>>>>>>>>>>>>>>> Test with call Server using MockMvc is running");
        this.mockMvc.perform(get("/help")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Ok This is Our Help for You! :)")));
    }

    @Test
    public void doDrools() throws Exception {
        System.out.println(">>>>>>>>>>>>>>>>>> Test with call Server using MockMvc is running and method Do Drools");
        this.mockMvc.perform(get("/drools")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Sold")));
    }
}
