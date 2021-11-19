package com.company.models;

public class Holidays {
    private String Date;
    private Boolean Leave;

    public Holidays(String date, Boolean leave) {
        Date = date;
        Leave = leave;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public Boolean getLeave() {
        return Leave;
    }

    public void setLeave(Boolean leave) {
        Leave = leave;
    }

    @Override
    public String toString() {
        return Date  ;
    }
}
