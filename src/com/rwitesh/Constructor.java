package com.rwitesh;

//Constructor has same name of class
//It doesn't return anything
//Constructor is called only once at the time of object creation but
//method can be called anytime
class Container{

    public Container(){
        System.out.println("This is the default constructor");
    }
    public Container(int a)
    {
        System.out.println("Parameterized Constructor - int");
    }
    public Container(double b)
    {
        System.out.println("Parameterized Constructor - double");
    }
    public Container(int p, int q)
    {
        System.out.println("Parameterized Constructor - int, int");
    }
}
public class Constructor {
    public static void main(String[] args) {
        Container obj = new Container();
        Container obj1 = new Container(5);
        Container obj2 = new Container(5.5);
        Container obj3 = new Container(4,5);

    }
}
