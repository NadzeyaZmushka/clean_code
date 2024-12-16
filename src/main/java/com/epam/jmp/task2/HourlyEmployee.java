package com.epam.jmp.task2;

public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hours;

    public HourlyEmployee(String name, double hourlyRate, int hours) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hours;
    }

    @Override
    public double calculateBonus() {
        return 0.05 * calculatePay(); // 5% of pay as bonus
    }
}
