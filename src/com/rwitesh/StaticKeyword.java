package com.rwitesh;

class staticDemo
{
    int id;
    int salary;
    static String name;

    public void show(){
        System.out.println(name + " : " + id + " : " + salary);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        staticDemo rwitesh = new staticDemo();
        staticDemo kunal = new staticDemo();

        rwitesh.name = "RWITESH";
        rwitesh.id = 1324;
        rwitesh.salary = 50000;

    //    kunal.name = "KUNAl";
        kunal.id = 5635;
        kunal.salary = 10000;

        rwitesh.show();
        kunal.show();


    }
}
