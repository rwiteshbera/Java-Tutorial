package com.rwitesh;

class Outer {
    public void show() {

    }

    class Inner {
        public void display(){
            System.out.println("I am in inner class");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
       Outer obj = new Outer();

        Outer.Inner obj1 = obj.new Inner();
        obj1.display();
    }
}
