package com.company.models;

public class Payable {
    private String Daily;
    private String Monthly;
    private String Yearly ;

    public Payable(String daily, String monthly, String yearly) {
        Daily = daily;
        Monthly = monthly;
        Yearly = yearly;
    }

    public String getDaily() {
        return Daily;
    }

    public void setDaily(String daily) {
        Daily = daily;
    }

    public String getMonthly() {
        return Monthly;
    }

    public void setMonthly(String monthly) {
        Monthly = monthly;
    }

    public String getYearly() {
        return Yearly;
    }

    public void setYearly(String yearly) {
        Yearly = yearly;
    }
}
