package org.example.calculator.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VacationRequestTest {

    @Test
    public void testConstructorWithParameters() {
        // Arrange
        double expectedSalary = 1000.0;
        int expectedDays = 20;
        VacationRequest request = new VacationRequest(expectedSalary, expectedDays);
        assertEquals(expectedSalary, request.getSalary(), 0);
        assertEquals(expectedDays, request.getDays());
    }
    @Test
    public void testGettersAndSetters() {
        VacationRequest request = new VacationRequest();
        double expectedSalary = 1000.0;
        int expectedDays = 20;
        request.setSalary(expectedSalary);
        request.setDays(expectedDays);
        double actualSalary = request.getSalary();
        int actualDays = request.getDays();


        assertEquals(expectedSalary, actualSalary, 0);
        assertEquals(expectedDays, actualDays);
    }
}