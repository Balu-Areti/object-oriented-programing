package com.java.arrays;

public class Main {
    static void main() {
        // --- 1. INTEGER ARRAY ---
        int[] ids;        // Declaration: Telling Java we want an array of integers
        ids = new int[5]; // Instantiation: Allocating memory for 5 integers

        // Initialization: Assigning values to specific indexes (starts from 0)
        ids[0] = 101;
        ids[1] = 102;
        ids[2] = 103;
        ids[3] = 104;
        ids[4] = 105;

        System.out.println("Total Length of ids Array :" + ids.length); // 5

        //traditional for loop for print elements using index
        for (int index = 0; index < ids.length; index++){
            System.out.println(ids[index]); // 101 102 103 ...
        }

        // Enhanced FOR loop (For-Each loop) - Cleaner way to iterate
        // Read as: "For each 'id' inside the 'ids' array"
        for(int id : ids){
            //System.out.println("Here i used for each loop");
            System.out.println(id);
        }

        // Modifying array elements: Adding 10000 to each ID
        for (int i = 0; i < ids.length; i++){
            ids[i] += 10000; // This actually updates the array in memory
            System.out.println(ids[i]);
        }

        // --- 2. FLOAT ARRAY ---
        // Declaration, Instantiation, and Initialization in a single line
        float[] prices = {100.5f, 200.5f, 300.5f, 400.5F, 500.5F};

        for (float price : prices){
            System.out.println(price);
        }

        // --- 3. CHAR ARRAY ---
        char[] genders = {'M', 'F','M','F','M'};

        for (char gender : genders){
            System.out.println(gender);
        }
    }
}
