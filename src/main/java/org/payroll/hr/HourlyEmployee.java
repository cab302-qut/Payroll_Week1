package org.payroll.hr;

public class HourlyEmployee extends Employee {

    private int hoursWorked;

    public HourlyEmployee(String name) {
        super(name);
    }

    public HourlyEmployee(String name, int hoursWorked) {
        super(name);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return 0;
    }

    @Override
    public String generatePayStub() {
        return "";
    }
}
