package org.example.calculator.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

class VacationControllerTest {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testCalculateVacation() {
        String baseUrl = "http://localhost:" + port + "/calculate";
        String requestUrl = baseUrl + "?salary=50000&vacationDays=20";
        VacationResponse response = restTemplate.getForObject(requestUrl, VacationResponse.class);
        assertEquals(10000.0, response.getTotalVacationPayment());
    }
}