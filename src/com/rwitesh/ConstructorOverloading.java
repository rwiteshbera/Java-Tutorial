package com.rwitesh;

class casio{
    int a,b,c;
    int sum;
    String s;

    public casio(int num1, int num2)
    {
        a = num1;
        b =num2;
        sum = a+b;
        System.out.println(sum);
    }
    public casio(int num1, int num2, int num3)
    {
        a = num1;
        b = num2;
        c = num3;
        sum = a+b+c;
        System.out.println(sum);
    }

    public casio(int num1, int num2, String op)
    {
        a = num1;
        b =num2;
        sum = a+b;
        s = op;
        System.out.println("String included : " + s);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        casio obj = new casio(6,8);
        casio obj1 = new casio(6,8,4);
        casio obj2 = new casio(6,8,"Add");

    }
}
