package com.epam.jmp.task2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommissionedEmployeeTest {

    @Test
    public void testCalculatePay() {
        CommissionedEmployee employee = new CommissionedEmployee("Bob", 0.1, 1000);
        assertEquals(100, employee.calculatePay(), "The calculated pay should be sales * commissionRate");
    }

    @Test
    public void testCalculateBonus() {
        CommissionedEmployee employee = new CommissionedEmployee("Bob", 0.1, 1000);
        assertEquals(1, employee.calculateBonus(), "The calculated bonus should be 1% of pay");
    }
}