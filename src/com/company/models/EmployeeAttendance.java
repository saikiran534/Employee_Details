package com.company.models;

import java.util.List;

public class EmployeeAttendance {


    private List Holiday;
    private String HolidayReason;

    public EmployeeAttendance(List holiday, String holidayReason) {
        Holiday = holiday;
        HolidayReason = holidayReason;
    }

    public List getHoliday() {
        return Holiday;
    }

    public void setHoliday(List holiday) {
        Holiday = holiday;
    }

    public String getHolidayReason() {
        return HolidayReason;
    }

    public void setHolidayReason(String holidayReason) {
        HolidayReason = holidayReason;
    }
}
