package com.company.models;

public class Employee_Salary {
    private String Employee_Id;
    private String Salary;
    private String Payable;

    public Employee_Salary(String employee_Id, String salary, String payable) {
        Employee_Id = employee_Id;
        Salary = salary;
        Payable = payable;
    }

    public String getEmployee_Id() {
        return Employee_Id;
    }

    public void setEmployee_Id(String employee_Id) {
        Employee_Id = employee_Id;
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
