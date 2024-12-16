package com.epam.jmp.task2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HourlyEmployeeTest {

    @Test
    public void testCalculatePay() {
        HourlyEmployee employee = new HourlyEmployee("John", 20, 40); // 20 rate and 40 hours
        assertEquals(800, employee.calculatePay(), "The calculated pay should be hourly rate * hours");
    }

    @Test
    public void testCalculateBonus() {
        HourlyEmployee employee = new HourlyEmployee("John", 20, 40); // 20 rate and 40 hours
        assertEquals(40, employee.calculateBonus(), "The calculated bonus should be 5% of pay");
    }
}