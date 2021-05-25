package com.rwitesh;

public class Loop {
    public static void main(String[] args) {
        //For Loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
        }
        System.out.println();


        //While Loop
        int j = 0;
        while (j <= 5) {
            System.out.println("World");
            j++;
        }
        System.out.println();


        //Do While Loop - It prints statements at least once whether condition
        //true or false
        int k = 0;
        do {
            System.out.println("Universe");
            k++;
        } while (k < 5);
        System.out.println();


    }
}
