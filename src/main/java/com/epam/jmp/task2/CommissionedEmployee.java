package com.epam.jmp.task2;

public class CommissionedEmployee extends Employee {
    private double commissionRate;
    private double sales;

    public CommissionedEmployee(String name, double commissionRate, double sales) {
        super(name);
        this.commissionRate = commissionRate;
        this.sales = sales;
    }

    @Override
    public double calculatePay() {
        return commissionRate * sales;
    }

    @Override
    public double calculateBonus() {
        return 0.01 * calculatePay(); // 1% of pay as bonus
    }
}
