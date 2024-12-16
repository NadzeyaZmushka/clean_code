package com.epam.jmp.task2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalariedEmployeeTest {

    @Test
    public void testCalculatePay() {
        SalariedEmployee employee = new SalariedEmployee("Alice", 1000); // $1000 salary
        assertEquals(1000, employee.calculatePay(), "The calculated pay should be equal to the salary");
    }

    @Test
    public void testCalculateBonus() {
        SalariedEmployee employee = new SalariedEmployee("Alice", 1000); // $1000 salary
        assertEquals(100, employee.calculateBonus(), "The calculated bonus should be 10% of pay");
    }
}