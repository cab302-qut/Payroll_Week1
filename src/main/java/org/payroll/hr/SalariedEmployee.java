package org.payroll.hr;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SalariedEmployee extends Employee {

    private double salary;

    public SalariedEmployee(String name) {
        super(name);
    }

    public SalariedEmployee(String name, double salary) {
        super(name);
        this.salary = salary;

    }

    @Override
    public double calculatePay() {
        return this.salary - (this.salary * .3);
    }

    @Override
    public String generatePayStub() {
        Address address = new Address("5 Emerald Close", "Kinston", "Kington", "00000");
        Company company = new Company("ABC Company", address);

        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = format.format(date);

        String outStr;
        outStr = "\t\t\t" + company.getName() +
                "\n\t" + "Name: " + getName() + "  - Employee Id: " + getEmployeeID() +
                "\n\t" + "Pay Date \t " + strDate +
                "\n\t" + "Gross Salary $" + salary +
                "\n\t" + "Net Salary $" + calculatePay() + "\n\n";

        return outStr;
    }
}

