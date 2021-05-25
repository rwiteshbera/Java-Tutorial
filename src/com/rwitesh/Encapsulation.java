package com.rwitesh;

/*Technically in encapsulation, the variables or data of a class is hidden from any other class and can be accessed only through any member function of its own class in which it is declared.

   As in encapsulation, the data in a class is hidden from other classes using the data hiding concept which is achieved by making the members or methods of a class private, and the class is exposed to the end-user or the world without providing any details behind implementation using the abstraction concept, so it is also known as a combination of data-hiding and abstraction.

Encapsulation can be achieved by Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables*/

class firstClass{
   private int num1;
   private int num2;

    public void setData(int x, int y)
    {
        num1 = x;
        num2 = y;
    }

    public void getData()
    {
        System.out.println("num1  = " + num1);
        System.out.println("num2  = " + num2);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        firstClass obj = new firstClass();
        obj.setData(15,55);
        obj.getData();
    }
}
