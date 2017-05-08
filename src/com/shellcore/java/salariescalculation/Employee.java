package com.shellcore.java.salariescalculation;

/**
 * Created by Cesar. 08/05/2017.
 */
public class Employee implements Taxes {
    private double baseSalary = 40000;
    private int years;

    public Employee(int years) {
        this.years = years;
    }

    public double getBonus() {
        return years*1000;
    }

    @Override
    public double getGrossSalary() {
        return baseSalary + getBonus();
    }

    @Override
    public double getNetSalary() {
        double grossSalary = getGrossSalary();
        return grossSalary - (grossSalary * Taxes.getTaxRate(grossSalary));
    }
}
