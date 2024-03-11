package org.example.calculator.controller;

import org.example.calculator.service.VacationCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VacationController {

    private final VacationCalculatorService calculatorService;

    @Autowired
    public VacationController(VacationCalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/calculate")
    public double calculateVacation(@RequestParam double salary, @RequestParam int days) {
        return calculatorService.calculateVacationCompensation(salary, days);
    }
}
