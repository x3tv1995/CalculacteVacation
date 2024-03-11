package org.example.calculator.model;

public class VacationRequest {
    private double salary;
    private int days;


    public VacationRequest(double salary, int days) {
        this.salary = salary;
        this.days = days;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    public VacationRequest() {
    }


    public void setDays(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }
}
