package com.shellcore.java.salariescalculation;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Cesar. 08/05/2017.
 */
public class ExerciseTest {

    @Test
    public final void testInterface() {
        Employee e = new Employee(0);
        assertTrue("Test implementation of interface Taxes", e instanceof Taxes);
    }

    @Test
    public final void testInheritance() {
        assertTrue("Test inheritance", Employee.class.isAssignableFrom(Manager.class));
    }

    @Test
    public final void testEmployeeGrossSalary() {
        Employee peter = new Employee(2);
        assertTrue("Testing employee gross salary", peter.getGrossSalary() == 42000);
    }

    @Test
    public final void testEmployeeNetSalary() {
        Employee peter = new Employee(2);
        assertTrue("Testing employee net salary", peter.getNetSalary() == 37800);
    }

    @Test
    public final void testManagerNetSalary() {
        Employee judith = new Manager(3);
        assertTrue("Testing manager net salary", judith.getNetSalary() == 45050);
    }
}
