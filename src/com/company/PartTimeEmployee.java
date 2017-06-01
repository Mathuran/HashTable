package com.company;

/**
 * Created by mathu on 2017-04-04.
 */
public class PartTimeEmployee extends EmployeeInfo {
    private double wage;
    private  double weeklyHours;
    private int weeksPerYear;

    public PartTimeEmployee(int eNum, String fName,String lName,boolean gender,int location,double rate,double wage, double weeklyHours, int weeksPerYear){
        super(eNum, fName,lName,gender,location,rate);
        this.wage= wage;
        this.weeklyHours = weeklyHours;
        this.weeksPerYear = weeksPerYear;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getWeeklyHours() {
        return weeklyHours;
    }

    public void setWeeklyHours(double weeklyHours) {
        this.weeklyHours = weeklyHours;
    }

    public int getWeeksPerYear() {
        return weeksPerYear;
    }

    public void setWeeksPerYear(int weeksPerYear) {
        this.weeksPerYear = weeksPerYear;
    }
}
