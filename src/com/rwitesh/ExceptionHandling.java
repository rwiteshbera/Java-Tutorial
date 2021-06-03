package com.rwitesh;

import java.util.InputMismatchException;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int[] arr = null;
            arr[3]=100;
            int a = 6;
            int b = 5;
            int ans = a/b;
            System.out.println("Output: " + ans);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Error");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Out Of Bounds");
        }
        catch (InputMismatchException e)
        {
            System.out.println("Input Mismatched");
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong.");
        }
        finally {
            System.out.println();
            System.out.println("Executed.");
        }
    }
}
