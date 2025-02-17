package org.payroll.hr;


public abstract class Employee implements Payable {

    private String name;
    private int emplId;
    private Address address;
    private double payRate;
    private static int nextID = 1000;
    public static double STARTING_PAY_RATE = 7.75;

    public Employee(String name) {
        this.name = name;
        emplId = getNextID();
        payRate = STARTING_PAY_RATE;
    }

    public Employee(String name, double payRate) {
        this.name = name;
        this.payRate = payRate;
        emplId = getNextID();
    }

    public String getName() {
        return this.name;
    }

    public int getEmployeeID() {
        return this.emplId;
    }

    public double getPayRate() {
        return this.payRate;
    }

    public int getNextID() {
        return nextID++;
    }


}
