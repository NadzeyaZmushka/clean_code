package com.epam.jmp.task2;

public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return salary;
    }

    @Override
    public double calculateBonus() {
        return 0.10 * calculatePay(); // 10% of pay as bonus
    }
}
