package com.rwitesh.CollectionFramework;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animal = new Stack<>();
        animal.push("Tiger");
        animal.push("Dog");
        animal.push("Lion");
        animal.push("Elephant");
        animal.push("Horse");

        System.out.println("Stack: " + animal);

        System.out.println(animal.peek()); // Look at the top object of the stack

        animal.pop(); // Remove the top object of the stack

        System.out.println(animal.peek());
    }
}
