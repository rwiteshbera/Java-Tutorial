package com.rwitesh;

class Addition{
    int num1;
    int num2;
    int res;

    public void perform()
    {
        res = num1+num2;
    }
}
public class ClassAndObject {
    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.num1 = 15;
        obj.num2 = 85;

        obj.perform();

        System.out.println(obj.res);
    }
}
