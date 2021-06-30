package com.rwitesh.CollectionFramework;

import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(5);
        arr.add(10);
        arr.add(25);

        System.out.println(arr);

        arr.add(30); // This will add 30 at the end
        System.out.println(arr);

        arr.set(1,1000); // It will change the element at index 2
        System.out.println(arr);

        System.out.println(arr.contains(422)); // Check whether 422 is present or not

        arr.add(2,99); // This will add 99 at index 2
        System.out.println(arr);

        System.out.println(arr.get(3)); // Get element at index 3

        arr.remove(2); // Remove element at index 2
        System.out.println(arr);

        arr.clear(); // It will remove all the elements
        System.out.println(arr);
    }
}
