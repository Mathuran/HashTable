package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int numFullEmp = 10;
        int numPartEmp = 10;
        Random random = new Random();
        HashTables Hash = new HashTables(numFullEmp);

        for (int x = 0; x < numFullEmp; x++) {
            PartTimeEmployee employee = new PartTimeEmployee(((int)(Math.random()*10000)),"abc"+((int)(Math.random()*1000)),
                    ((int)(Math.random()*1000))+"efg",random.nextBoolean(),((int)(Math.random()*1000)),(Math.random()*1000),
                    (Math.random()*1000),(Math.random()*1000),(int)(Math.random()*1000));
            Hash.addEmployee(employee);
        }

        for (int x = 0; x < numPartEmp; x++) {
            FullTimeEmployee employee = new FullTimeEmployee(((int)(Math.random()*10000)),"abc"+((int)(Math.random()*1000)),
                    ((int)(Math.random()*1000))+"efg",random.nextBoolean(),((int)(Math.random()*1000)),(Math.random()*1000)
                    ,(Math.random()*1000));
            Hash.addEmployee(employee);
        }

        Hash.displayContents();


    }
}
