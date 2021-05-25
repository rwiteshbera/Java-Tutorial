package com.rwitesh;

class Casio{
    public void add(int i, int j)
    {
        System.out.println(i + " + " + j + " = " + (i+j));
    }

    public void add(double i, double j)
    {
        double sum = i+j;
        System.out.println(i + " + " + j + " = " + String.format("%.2f",sum));
    }

    public void add(int i, int j, int k)
    {
        System.out.println(i + " + " + j + " + " + k + " = " + (i+j+k));
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Casio obj = new Casio();
        obj.add(3, 4);

        obj.add(5.6, 8.2);

        obj.add(3, 4,8);
    }
}