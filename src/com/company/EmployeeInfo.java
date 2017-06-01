package com.company;

/**
 * Created by mathu on 2017-03-27.
 * A database of millions of peoples precious person information.
 */

public class EmployeeInfo {
    protected int IDnum;             //stores the student school number id
    protected String firstName;           //stores the first name of student
    protected String lastName;            //stores the last name of student
    protected boolean sex;
    protected int workLocation;
    protected double deductionRate;

        protected EmployeeInfo(int IDnum,String firstName, String lastName, boolean gender,int location,double rate){
            super();
            this.IDnum = IDnum;
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = gender;
            this.workLocation = location;
            this.deductionRate = rate;
        }



        protected int getIDnum() {
            return IDnum;
        }

        protected void printItem(){                                    //prints the first and last name of the student
        System.out.println(IDnum+" "+firstName+" "+lastName);
    }

}
