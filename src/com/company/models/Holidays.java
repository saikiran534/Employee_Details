package com.company.models;

public class Holidays {

    private int workingDays;
    private int non_workingDays;

    public Holidays(int workingDays, int non_workingDays) {
        this.workingDays = workingDays;
        this.non_workingDays = non_workingDays;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

    public int getNon_workingDays() {
        return non_workingDays;
    }

    public void setNon_workingDays(int non_workingDays) {
        this.non_workingDays = non_workingDays;
    }
}
