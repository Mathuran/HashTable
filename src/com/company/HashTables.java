package com.company;

import java.util.ArrayList;

/**
 * Created by mathu on 2017-03-27.
 */
public class HashTables {

    private ArrayList<EmployeeInfo> [] buckets;
    int numEmployee = 0;


    public HashTables(int arrayLength) {
        buckets = new ArrayList[arrayLength];

        for(int x = 0; x < arrayLength;x++){
            buckets[x] = new ArrayList();
        }
    }

    public int calcBucket(int keyValue) {
        // Returns the bucket number as the integer keyValue modulo the number of buckets for the hash table.
        return(keyValue % buckets.length);
    }

    public boolean addEmployee(EmployeeInfo theEmployee) {
       numEmployee ++;
        return buckets[calcBucket(theEmployee.getIDnum())].add(theEmployee);
    }

    public int searchEmployee(EmployeeInfo theEmployee) {
        return buckets[calcBucket(theEmployee.getIDnum())].indexOf(theEmployee);
    }

    public EmployeeInfo removeEmployee(EmployeeInfo theEmployee) {
        if(buckets[calcBucket(theEmployee.getIDnum())].remove(theEmployee)){
            return theEmployee;
        }else{
            return null;
        }
    }

    public void displayContents() {
        // Print the employee numbers for the employees stored in each bucket's ArrayList,
        // starting with bucket 0, then bucket 1, and so on.
        for (int x = 0;x< numEmployee;x++){
            System.out.println("Bucket" + " " + x + ".");
            for (int y = 0; y < buckets[x].size() ;y++){
                buckets[x].get(y).printItem();
            }
        }
    }
}
