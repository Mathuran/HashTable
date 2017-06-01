package com.company;

/**
 * Created by mathu on 2017-04-04.
 */
public class FullTimeEmployee extends EmployeeInfo {
    private double yearlySalary;

    public FullTimeEmployee(int eNum, String fName,String lName,boolean gender,int location,double rate,double yearlySalary){
        super (eNum, fName,lName,gender,location,rate);
        this.yearlySalary = yearlySalary;
    }





    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }
}
