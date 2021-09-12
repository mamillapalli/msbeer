package com.learning.msbeer.web.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.learning.msbeer.web.model.BeerDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest
class BeerControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void getBeers() throws Exception {

        mockMvc.perform(get("/api/v1/beers")).andExpect(status().isOk());
    }

    @Test
    void addBeer() throws Exception {

        BeerDTO beerDTO = BeerDTO.builder().build();
        String beerDTOJson = objectMapper.writeValueAsString(beerDTO);
        mockMvc.perform(post("/api/v1/beers").contentType(MediaType.APPLICATION_JSON).content(beerDTOJson)).andExpect(status().isCreated());
    }

    @Test
    void modifyBeer() throws Exception {
        BeerDTO beerDTO = BeerDTO.builder().build();

        String beerDTOJson = objectMapper.writeValueAsString(beerDTO);
        mockMvc.perform(put("/api/v1/beers/" + UUID.randomUUID()).contentType(MediaType.APPLICATION_JSON).content(beerDTOJson)).andExpect(status().isNoContent());
    }
}