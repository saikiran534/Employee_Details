package com.company;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import com.company.models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static int count=0;

    public static void main(String[] args) {
	// write your code here

// Salary Details

        EmployeeSalary salary1 = new EmployeeSalary("10000","Daily");
        EmployeeSalary salary2 = new EmployeeSalary("15000","Monthly");
        EmployeeSalary salary3 = new EmployeeSalary("20000","Monthly");
        EmployeeSalary salary4 = new EmployeeSalary("30000","Monthly");
        EmployeeSalary salary5 = new EmployeeSalary("40000","Monthly");
        EmployeeSalary salary6 = new EmployeeSalary("50000","Daily");
        EmployeeSalary salary7 = new EmployeeSalary("60000","Daily");
        EmployeeSalary salary8 = new EmployeeSalary("70000","Yearly");
        EmployeeSalary salary9 = new EmployeeSalary("80000","Yearly");
//Holiday Details
        Holidays date1 = new Holidays( "1-1-2021", true);
        Holidays date2 = new Holidays( "2-1-2021", true);
        Holidays date3 = new Holidays( "3-1-2021", true);
        Holidays date4 = new Holidays( "4-1-2021", true);
        Holidays date5 = new Holidays( "5-1-2021", true);
        Holidays date6 = new Holidays( "6-1-2021", true);
        Holidays date7 = new Holidays( "7-1-2021", true);
        Holidays date8 = new Holidays( "8-1-2021", true);
        Holidays date9 = new Holidays( "9-1-2021", true);
        Holidays date10 = new Holidays( "10-1-2021", true);
        Holidays date11 = new Holidays( "11-1-2021", true);
        Holidays date12 = new Holidays( "12-1-2021", true);
        Holidays date13 = new Holidays( "13-1-2021", true);
        Holidays date14 = new Holidays( "14-1-2021", true);
        Holidays date15 = new Holidays( "15-1-2021", true);
        Holidays date16 = new Holidays( "16-1-2021", true);
        Holidays date17 = new Holidays( "17-1-2021", true);
        Holidays date18 = new Holidays( "18-1-2021", true);
        Holidays date19 = new Holidays( "19-1-2021", true);
        Holidays date20 = new Holidays( "20-1-2021", true);
        Holidays date21 = new Holidays( "21-1-2021", true);
        Holidays date22 = new Holidays( "22-1-2021", true);
        Holidays date23 = new Holidays( "23-1-2021", true);
        Holidays date24 = new Holidays( "24-1-2021", true);
        Holidays date25 = new Holidays( "25-1-2021", true);
        Holidays date26 = new Holidays( "26-1-2021", true);
        Holidays date27 = new Holidays( "27-1-2021", true);
        Holidays date28 = new Holidays( "28-1-2021", true);
        Holidays date29 = new Holidays( "29-1-2021", true);
        Holidays date30 = new Holidays( "30-1-2021", true);
        Holidays date31 = new Holidays( "31-1-2021", true);


    //Holiday Details Date format
        DateTimeFormatter formatter_1 = DateTimeFormatter.ofPattern("d/MM/yyyy");
        String str_date_1 = "24/09/2019";
        String str_date_2 = "27/09/2019";
        LocalDate local_date_1 = LocalDate.parse(str_date_1, formatter_1);
        LocalDate local_date_2 = LocalDate.parse(str_date_2,formatter_1);
//
//        long daysBetween = ChronoUnit.DAYS.between(local_date_1,local_date_2);
//System.out.println("no of day = " + daysBetween);

//        LocalDate d1 = LocalDate.of(2019,12,10);
//        LocalDate d2 = LocalDate.of(2019,12,20);
//        Duration duration = Duration.between(d1,d2);
        Period period = Period.between(local_date_1,local_date_2);
        System.out.println(period.getDays() );



        List<Holidays> h1 = Arrays.asList(date2,date5,date17);
        List<Holidays> h2 = Arrays.asList(date9,date19,date17,date25);
        List<Holidays> h3 = Arrays.asList(date2,date17,date17);
        List<Holidays> h4 = Arrays.asList(date8,date22,date31);
        List<Holidays> h5 = Arrays.asList(date12,date15,date17);
        List<Holidays> h6 = Arrays.asList(date1,date2,date3);
        List<Holidays> h7 = Arrays.asList(date20,date21,date22);
        List<Holidays> h8 = Arrays.asList(date15,date30,date31);
        List<Holidays> h9 = Arrays.asList(date2,date5,date17);





//Employee Attendance Details

        EmployeeAttendance attendance1= new EmployeeAttendance(h1,"");
        EmployeeAttendance attendance2= new EmployeeAttendance(h2,"");
        EmployeeAttendance attendance3= new EmployeeAttendance(h3,"");
        EmployeeAttendance attendance4= new EmployeeAttendance(h4,"");
        EmployeeAttendance attendance5= new EmployeeAttendance(h5,"");
        EmployeeAttendance attendance6= new EmployeeAttendance(h6,"");
        EmployeeAttendance attendance7= new EmployeeAttendance(h7,"");
        EmployeeAttendance attendance8= new EmployeeAttendance(h8,"");
        EmployeeAttendance attendance9= new EmployeeAttendance(h9,"Personal");


//Employee Address Details

        EmployeeAddress address1 = new EmployeeAddress( "Vaishnav Clousure", " ", "8333060236", "Hyderabad", "India");
        EmployeeAddress address2 = new EmployeeAddress( "Appartment ", " ", "1230456078", "Chennai", "India");
        EmployeeAddress address3 = new EmployeeAddress("Hostel", " ", "9876543210", "Hyderabad", "India");
        EmployeeAddress address4 = new EmployeeAddress( "Paying Guest", " ", "1237896540", "California", "Usa");
        EmployeeAddress address5 = new EmployeeAddress("From Home ", " ", "15975346820", "Delhi", "India");
        EmployeeAddress address6 = new EmployeeAddress("Room", " ", "7891564320", "Hyderabad", "India");
        EmployeeAddress address7 = new EmployeeAddress("Non Local", " ", "35709512684", "Delhi", "India");
        EmployeeAddress address8 = new EmployeeAddress("Maharastra", " ", "3129876453", "Washington Dc ", "USA");
        EmployeeAddress address9 = new EmployeeAddress("Andrapradesh", " ", "3126459780", "Hyderabad", "India");
//


//Employee Details

        List<Employee> Employees = new ArrayList<>();
        {
            Employee E1 = new Employee("E1","Saikiran","v.saikiran534@gmail.com",address1,attendance1,salary1);
            Employee E2 = new Employee("E2","Rakesh","rakesh@gmail.com",address2,attendance2,salary2);
            Employee E3 = new Employee("E3","Naresh","Naresh@gmail.com",address3,attendance3,salary3);
            Employee E4 = new Employee("E4","Sam","Sam@gmail.com",address4,attendance4,salary4);
            Employee E5 = new Employee("E5","Anjali","Anjali@gmail.com",address5,attendance5,salary5);
            Employee E6 = new Employee("E6","Mohan","Mohan@gmail.com",address6,attendance6,salary6);
            Employee E7 = new Employee("E7","Sathya","Sathya@gmail.com",address7,attendance7,salary7);
            Employee E8 = new Employee("E8","Mahesh","Mahesh@gmail.com",address8,attendance8,salary8);
            Employee E9 = new Employee("E9","Karnakar","karnakar@gmail.com",address9,attendance9,salary9);
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
        System.out.println("*** Task 1 ***");
        System.out.println("List of Employees based in INDIA ");
        System.out.println("");
        Employees.stream().filter(x->
            x.getAddress().getCountry().equals("India")).forEach(y->System.out.println("Employee Name : "+y.getEmployeeName()+"; Country : "+y.getAddress().getCountry()));


        System.out.println("");
        System.out.println("*** Task 2 ***");
        System.out.println("List of Employees who are in Chennai or Hyderabad");
        System.out.println("");
        Employees.stream().filter(x->
                x.getAddress().getCity().equals("Hyderabad")||x.getAddress().getCity().equals("Chennai")).
                forEach(y->System.out.println("Employee name : "+y.getEmployeeName()+"; City : "+y.getAddress().getCity()));


        System.out.println("");
        System.out.println("*** Task 3 ***");
        System.out.println("List of Employees who are in Chennai and India");
        System.out.println("");

        Employees.stream().filter(x->
                        x.getAddress().getCountry().equals("India")&&x.getAddress().getCity().equals("Chennai")).
                forEach(y->System.out.println("Employee name : "+y.getEmployeeName()+"; City : "+y.getAddress().getCity()+
                        "; Country : "+y.getAddress().getCity()));


        System.out.println("");
        System.out.println("*** Task 4 ***");
        System.out.println("List of employee_id, name, email, Salary, payable details");
        System.out.println("");

        Employees.stream().forEach(y->System.out.println(" Employee ID : "+y.getEmployeId()+
                "; Employee name : "+y.getEmployeeName()+"; Employee Email : "+y.getEmployeeEmail()+
                "; Salary"+y.getSalary()+"; Payable Details : "+
                y.getSalary().getPayable()));



        System.out.println("");
        System.out.println("*** Task 5 ***");
        System.out.println("List of employee_id, name, email, Salary, payable details whose salary is paid daily");
        System.out.println("");
        Employees.stream().filter(x->x.getSalary().getPayable().equals("Daily")).forEach(y->System.out.println("Emploiee Id : "+y.getEmployeId()
        +"; Name : "+y.getEmployeeName()+"; Email : "+y.getEmployeeEmail()+"; Salary : "+y.getSalary().getSalary()+
                "; payable details whose salary is paid daily : "+y.getSalary().getPayable()));



        System.out.println("");
        System.out.println("*** Task 6 ***");
        System.out.println("List of employee_id, name, email, Salary, payable details whose salary is paid daily");
        System.out.println("");
        Employees.stream().forEach(x->{
            System.out.println("\nID : "+x.getEmployeId()+"; \nName : "+ x.getEmployeeName()+"; \nPhone_No : "+x.getAddress().getPhoneNo()+"; \nSalary : "+
                    x.getSalary().getSalary()+"\nNo of days off for the month of Jan 2021 : " +x.getAttendance().getHoliday()+"\nNo of Days : "+
                    x.getAttendance().getHoliday().size());



        });
    }
}
