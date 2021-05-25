package com.rwitesh;

public class FirstCode {
    public static void main(String[] args) {
        //Simple Hello World
        System.out.println("Hello World");

        //Variables
        int i = 10;
        long l = 500000000;
        double d = 5.5;
        float f = 5.5f;
        char c = 'A';
        System.out.println(i + " " + l + " " + d + " " + f + " " + c);
        System.out.println("ASCII code of A : " + (int) c);

        //If-Else Statements - Checking whether a number is odd or even
        int x = 7;
        if (x % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        //Switch case statements
        int y = 4;
        switch (y) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;

            default:
                System.out.println("Not in between 1 and 5");
                break;
        }
    }
}
