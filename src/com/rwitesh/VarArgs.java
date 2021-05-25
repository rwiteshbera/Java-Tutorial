package com.rwitesh;

class Calculation{
    public int summation(int ... n)
    {
        int sum = 0;
        for(int k : n)
        {
            sum+=k;
        }
        return sum;
    }
}
public class VarArgs {
    public static void main(String[] args) {
        Calculation obj = new Calculation();
        System.out.println(obj.summation(2,4,8,31));
    }
}
