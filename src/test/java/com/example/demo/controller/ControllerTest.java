package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ActiveProfiles("test")
@ContextConfiguration
@AutoConfigureMockMvc
class ControllerTest {
    @Autowired 
    private MockMvc mvc;


    @Test
    void testHello() throws Exception {
        this.mvc.perform(get("/test")).andExpect(status().isOk());
    }

    @Test
    void testHello1() throws Exception {
        this.mvc.perform(get("/test1")).andExpect(status().isOk());
    }
    
}
