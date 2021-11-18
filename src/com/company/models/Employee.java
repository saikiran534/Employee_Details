package com.company.models;

public class Employee {
    private EmployeeAddress EmployeId;
    private String EmployeeName;
    private String EmployeeEmail;

    public Employee(EmployeeAddress employeId, String employeeName, String employeeEmail) {
        EmployeId = employeId;
        EmployeeName = employeeName;
        EmployeeEmail = employeeEmail;
    }

    public EmployeeAddress getEmployeId() {
        return EmployeId;
    }

    public void setEmployeId(EmployeeAddress employeId) {
        EmployeId = employeId;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return EmployeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        EmployeeEmail = employeeEmail;
    }
}
