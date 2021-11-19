package com.company.models;

public class Employee {
    private String EmployeId;
    private String EmployeeName;
    private String EmployeeEmail;
    private EmployeeAddress address;
    private EmployeeAttendance attendance;
    private EmployeeSalary salary;

    public Employee(String employeId, String employeeName, String employeeEmail, EmployeeAddress address, EmployeeAttendance attendance, EmployeeSalary salary) {
        EmployeId = employeId;
        EmployeeName = employeeName;
        EmployeeEmail = employeeEmail;
        this.address = address;
        this.attendance = attendance;
        this.salary = salary;
    }

    public String getEmployeId() {
        return EmployeId;
    }

    public void setEmployeId(String employeId) {
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

    public EmployeeAddress getAddress() {
        return address;
    }

    public void setAddress(EmployeeAddress address) {
        this.address = address;
    }

    public EmployeeAttendance getAttendance() {
        return attendance;
    }

    public void setAttendance(EmployeeAttendance attendance) {
        this.attendance = attendance;
    }

    public EmployeeSalary getSalary() {
        return salary;
    }

    public void setSalary(EmployeeSalary salary) {
        this.salary = salary;
    }
}
