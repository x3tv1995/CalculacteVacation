package org.example.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class VacationCalculatorService {

    public double calculateVacationCompensation(double salary, int days) {
        return salary * days / 365.0;
    }
}
