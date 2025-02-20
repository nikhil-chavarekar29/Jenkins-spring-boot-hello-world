package com.nikhil.Jenkins_spring_boot_hello_world.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(WelcomeController.class)  // Only loads the controller layer
public class WelcomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetWelcomeMsg() throws Exception {
        mockMvc.perform(get("/api/v1/jenkins/msg"))
            .andExpect(status().isOk())  // Expect HTTP 200
            .andExpect(content().string("Welcome Nikhil!"));  // Expect response body
    }
}
