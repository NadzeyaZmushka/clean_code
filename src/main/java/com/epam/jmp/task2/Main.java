package com.epam.jmp.task2;

public class Main {

    public static void main(String[] args) {
        Employee employee = new HourlyEmployee("John", 30, 8);
        System.out.println(employee.calculatePay());
        System.out.println(employee.calculateBonus());

        employee = new CommissionedEmployee("Bob", 100, 20);
        System.out.println(employee.calculatePay());
        System.out.println(employee.calculateBonus());

        employee = new SalariedEmployee("Alice", 1000);
        System.out.println(employee.calculatePay());
        System.out.println(employee.calculateBonus());
    }
}
