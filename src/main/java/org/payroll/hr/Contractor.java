package org.payroll.hr;

public class Contractor implements Payable{

    private String name;
    private int hoursWorked;
    private double partsCost;

    public Contractor(String name, int hoursWorked, double partsCost){
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.partsCost = partsCost;
    }

    @Override
    public double calculatePay() {
        return this.hoursWorked * this.partsCost;
    }

    @Override
    public String generatePayStub() { // invoice
        return null;
    }
}