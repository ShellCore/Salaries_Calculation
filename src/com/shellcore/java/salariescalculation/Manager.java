package com.shellcore.java.salariescalculation;

/**
 * Created by Cesar. 08/05/2017.
 */
public class Manager extends Employee {

    public Manager(int years) {
        super(years);
    }

    @Override
    public double getBonus() {
        return super.getBonus() + 10000;
    }
}
