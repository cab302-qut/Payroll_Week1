package org.payroll.hr;


public abstract class Employee implements Payable {

    private String name;
    private final int EMPLOYEE_ID;
    private Address address;
    private double payRate;
    private static int nextID = 1000;
    public static double STARTING_PAY_RATE = 7.75;

    public Employee(String name) {
        this.name = name;
        EMPLOYEE_ID = getNextID();
        payRate = STARTING_PAY_RATE;
    }

    public Employee(String name, double payRate) {
        this.name = name;
        this.payRate = payRate;
        EMPLOYEE_ID = getNextID();
        this.payRate = STARTING_PAY_RATE;
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

    public static int getNextID() {
        int id = nextID;
        nextID++;
        return id;
    }

    public void displayAddress() {
        address.getAddress();
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void changePayRate(double rate) {
        this.payRate=rate;
    }

    public void changeName(String newName) {
        this.name = newName;
    }

    public void displayAddress() {
        address.getAddress();
    }

    @Override
    public String toString(){
        return this.name;
    }

}
