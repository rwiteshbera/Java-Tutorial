package com.rwitesh;

public class Arrays {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 5;
        nums[1] = 15;
        nums[2] = 25;
        nums[3] = 35;
        nums[4] = 45;

        System.out.println(nums[3]);

        int[] arr = {1,2,3,4,5};
        for(int i=0; i< arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //Adding new line
        System.out.println();

        int[][] d = {
                {1,2,3,4,5},
                {10,11,12,13,14},
                {21,22,23,24,25}
        };

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<5; j++)
            {
                System.out.print(d[i][j]+ " ");
            }
            System.out.println();
        }

        //Enhanced For Loop
        int[] x = {5,6,7,8,9,10};
        for(int k : x)
        {
            System.out.print(k + " ");
        }

    }
}
