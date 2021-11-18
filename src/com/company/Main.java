package com.company;

import com.company.models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

// Salary Details

        Employee_Salary salary1 = new Employee_Salary("E1","10000","Daily ");
        Employee_Salary salary2 = new Employee_Salary("E2","15000","Monthly");
        Employee_Salary salary3 = new Employee_Salary("E3","20000","Monthly");
        Employee_Salary salary4 = new Employee_Salary("E4","30000","Monthly");
        Employee_Salary salary5 = new Employee_Salary("E5","40000","Monthly");
        Employee_Salary salary6 = new Employee_Salary("E6","50000","Daily");
        Employee_Salary salary7 = new Employee_Salary("E7","60000","Daily");
        Employee_Salary salary8 = new Employee_Salary("E8","70000","Yearly");
        Employee_Salary salary9 = new Employee_Salary("E9","80000","Yearly");
//Holiday Details
        Holidays h1 = new Holidays(31,0);
        Holidays h2 = new Holidays(22,9);
        Holidays h3 = new Holidays(30,1);
        Holidays h4 = new Holidays(25,6);
        Holidays h5 = new Holidays(31,0);
        Holidays h6 = new Holidays(20,11);
        Holidays h7 = new Holidays(29,2);
        Holidays h8 = new Holidays(25,6);
        Holidays h9 = new Holidays(23,8);

//Employee Attendance Details

        Employee_Attendance attendance1= new Employee_Attendance(salary1,h1,"");
        Employee_Attendance attendance2= new Employee_Attendance(salary2,h2,"");
        Employee_Attendance attendance3= new Employee_Attendance(salary3,h3,"");
        Employee_Attendance attendance4= new Employee_Attendance(salary4,h4,"");
        Employee_Attendance attendance5= new Employee_Attendance(salary5,h5,"");
        Employee_Attendance attendance6= new Employee_Attendance(salary6,h6,"");
        Employee_Attendance attendance7= new Employee_Attendance(salary7,h7,"");
        Employee_Attendance attendance8= new Employee_Attendance(salary8,h8,"");
        Employee_Attendance attendance9= new Employee_Attendance(salary9,h9,"Personal");


//Employee Address Details

        EmployeeAddress address1 = new EmployeeAddress(attendance1, "Vaishnav Clousure", " ", "8333060236", "Hyderabad", "India");
        EmployeeAddress address2 = new EmployeeAddress(attendance2, "Appartment ", " ", "1230456078", "Chennai", "India");
        EmployeeAddress address3 = new EmployeeAddress(attendance3, "Hostel", " ", "8333060236", "Hyderabad", "India");
        EmployeeAddress address4 = new EmployeeAddress(attendance4, "Paying Guest", " ", "8333060236", "California", "Usa");
        EmployeeAddress address5 = new EmployeeAddress(attendance5, "From Home ", " ", "8333060236", "Delhi", "India");
        EmployeeAddress address6 = new EmployeeAddress(attendance6, "Room", " ", "8333060236", "Hyderabad", "India");
        EmployeeAddress address7 = new EmployeeAddress(attendance7, "Non Local", " ", "8333060236", "Delhi", "India");
        EmployeeAddress address8 = new EmployeeAddress(attendance8, "Maharastra", " ", "8333060236", "Washington Dc ", "USA");
        EmployeeAddress address9 = new EmployeeAddress(attendance9, "Andrapradesh", " ", "8333060236", "Hyderabad", "India");
//


//Employee Details

        List<Employee> Employees = new ArrayList<>();
        {
            Employee E1 = new Employee(address1,"Saikiran","v.saikiran534@gmail.com");
            Employee E2 = new Employee(address2,"Rakesh","rakesh@gmail.com");
            Employee E3 = new Employee(address3,"Naresh","Naresh@gmail.com");
            Employee E4 = new Employee(address4,"Sam","Sam@gmail.com");
            Employee E5 = new Employee(address5,"Anjali","Anjali@gmail.com");
            Employee E6 = new Employee(address6,"Mohan","Mohan@gmail.com");
            Employee E7 = new Employee(address7,"Sathya","Sathya@gmail.com");
            Employee E8 = new Employee(address8,"Mahesh","Mahesh@gmail.com");
            Employee E9 = new Employee(address9,"Karnakar","karnakar@gmail.com");
            Employees.add(E1);
            Employees.add(E2);
            Employees.add(E3);
            Employees.add(E4);
            Employees.add(E5);
            Employees.add(E6);
            Employees.add(E7);
            Employees.add(E8);
            Employees.add(E9);
        }


        System.out.println("");
        System.out.println("Task 1");
        System.out.println("List of Employees based in INDIA ");
        System.out.println("");
        Employees.stream().filter(x->
            x.getEmployeId().getCountry().equals("India")).forEach(y->System.out.println("Employee Name : "+y.getEmployeeName()+"; Country : "+y.getEmployeId().getCountry()));


        System.out.println("");
        System.out.println("Task 2");
        System.out.println("List of Employees who are in Chennai or Hyderabad");
        System.out.println("");
        Employees.stream().filter(x->
                x.getEmployeId().getCity().equals("Hyderabad")||x.getEmployeId().getCity().equals("Chennai")).
                forEach(y->System.out.println("Employee name : "+y.getEmployeeName()+"; City : "+y.getEmployeId().getCity()));


        System.out.println("");
        System.out.println("Task 3");
        System.out.println("List of Employees who are in Chennai and India");
        System.out.println("");

        Employees.stream().filter(x->
                        x.getEmployeId().getCountry().equals("India")&&x.getEmployeId().getCity().equals("Chennai")).
                forEach(y->System.out.println("Employee name : "+y.getEmployeeName()+"; City : "+y.getEmployeId().getCity()+
                        "; Country : "+y.getEmployeId().getCountry()));


        System.out.println("");
        System.out.println("Task 4");
        System.out.println("List of employee_id, name, email, Salary, payable details");
        System.out.println("");

        Employees.stream().forEach(y->System.out.println(" Employee ID : "+y.getEmployeId().getE_Id().getES_ID().getEmployee_Id()+
                "; Employee name : "+y.getEmployeeName()+"; Employee Email : "+y.getEmployeeEmail()+
                "; Salary"+y.getEmployeId().getE_Id().getES_ID().getSalary()+"; Payable Details : "+
                y.getEmployeId().getE_Id().getES_ID().getPayable()));

        System.out.println("");
        System.out.println("Task 5");
        System.out.println("List of employee_id, name, email, Salary, payable details whose salary is paid daily");
        System.out.println("");
        Employees.stream().forEach(y ->System.out.println("EmployeeID : "+y.getEmployeId().getE_Id().getES_ID().getEmployee_Id()+
                "; Name : "+y.getEmployeeName() +"; Phone Number : "+y.getEmployeId().getPhoneNo()+
                "; Salary : "+y.getEmployeId().getE_Id().getES_ID().getSalary()+ "; no of days off for the month of Jan 2021 : "
                +y.getEmployeId().getE_Id().getHoliday().getNon_workingDays()));


    }
}
