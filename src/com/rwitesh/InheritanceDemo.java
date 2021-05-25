package com.rwitesh;
//Java supports Multi-Level Inheritance but doesn't support Multiple Inheritance
class Calculator{ // Parent Class or Super Class
    public int sum(int x, int y)
    {
        return x+y;
    }
}

class Calc extends Calculator // Sub Class or Child Class
{
    public int sub(int x, int y)
    {
        return x-y;
    }
}

class AdvClass extends Calc
{
    public int multiply(int x, int y)
    {
        return x*y;
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        AdvClass c1 = new AdvClass();
        int result1 = c1.sum(34,63);
        int result2 = c1.sum(121,63);
        int result3 = c1.sum(64,82);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
