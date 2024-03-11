package org.example.calculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VacationCalculatorServiceTest {

    @Test
    public void testCalculateVacationCompensation() {
        VacationCalculatorService calculatorService = new VacationCalculatorService();
        double salary = 1000.0;
        int days = 20;
        double expectedCompensation = salary * days / 365.0;
        double actualCompensation = calculatorService.calculateVacationCompensation(salary, days);
        assertEquals(expectedCompensation, actualCompensation, 0.001);
    }

}