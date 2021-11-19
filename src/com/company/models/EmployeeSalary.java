package com.company.models;

public class EmployeeSalary {

    private String Salary;
    private String Payable;

    public EmployeeSalary(String salary, String payable) {
        Salary = salary;
        Payable = payable;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }

    public String getPayable() {
        return Payable;
    }

    public void setPayable(String payable) {
        Payable = payable;
    }
}
