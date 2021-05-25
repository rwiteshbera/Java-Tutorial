package com.rwitesh;

class A{
    public void display()
    {
        System.out.println("In A");
    }
}

class B extends A{
    @Override
    public void display()
    {
      //  super.display(); <--- It will call the first display function
        System.out.println("In B");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
