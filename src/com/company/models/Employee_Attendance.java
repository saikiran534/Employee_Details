package com.company.models;

public class Employee_Attendance {
    private Employee_Salary ES_ID;

    private Holidays Holiday;
    private String HolidayReason;

    public Employee_Attendance(Employee_Salary ES_ID, Holidays holiday, String holidayReason) {
        this.ES_ID = ES_ID;
        Holiday = holiday;
        HolidayReason = holidayReason;
    }

    public Employee_Salary getES_ID() {
        return ES_ID;
    }

    public void setES_ID(Employee_Salary ES_ID) {
        this.ES_ID = ES_ID;
    }

    public Holidays getHoliday() {
        return Holiday;
    }

    public void setHoliday(Holidays holiday) {
        Holiday = holiday;
    }

    public String getHolidayReason() {
        return HolidayReason;
    }

    public void setHolidayReason(String holidayReason) {
        HolidayReason = holidayReason;
    }
}
