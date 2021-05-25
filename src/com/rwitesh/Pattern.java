package com.rwitesh;

public class Pattern {
    public static void main(String[] args) {
//Pattern 1
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        //Pattern 2
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (65 + j) + " ");
            }
            System.out.println();
        }

        System.out.println();

        //Pattern 3
        int row = 4;
        for (int i = 1; i <= row; i++) {
            System.out.print("$ ");
        }
        System.out.println();
        for (int i = 1; i <= row - 2; i++) {
            System.out.print("$ ");
            for (int j = 1; j <= row; j++) {
                System.out.print(" ");
            }
            System.out.println("$ ");
        }
        for (int i = 1; i <= row; i++) {
            System.out.print("$ ");
        }


    }
}
