package com.rwitesh;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
//        String name = new String("Rwitesh");
//        String name = "Rwitesh";

//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        System.out.println(name);

          String name = "Rwitesh";
          System.out.println(name); // Print the string

          System.out.println(name.length()); // Return length of a string

          System.out.println(name.toLowerCase()); // Return lowercase characters of string

          System.out.println(name.toUpperCase()); // Return uppercase characters of string

        String nonTrimmedString = "            Google   ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim()); // Remove the leading and trailing spaces

        System.out.println(name.substring(2)); // Return characters from index 2 to end

        System.out.println(name.substring(2,5)); // Return characters from index 2 to (5-1)

        System.out.println(name.replace('R','X')); // Replace w with x

        System.out.println(name.replace("Rwi","XYZ"));

        System.out.println(name.startsWith("Rwi")); // Return true if it starts with the given characters
        System.out.println(name.endsWith("SHD")); // Return true if it ends with the given characters otherwise it will return false

        System.out.println(name.charAt(4)); // Return character at index 4

        System.out.println(name.indexOf('h')); // Return the index of the character 'h'

        String a = "Rwitesh Bera";
        System.out.println(a.indexOf("wit")); // Return the index of the first character of the given characters.

        System.out.println(a.lastIndexOf('r')); // Return the last index of 'r'

        System.out.println(a.lastIndexOf('x')); // Return the last index of 'x', otherwise it will return -1

        System.out.println(a.equals("Rwitesh Bera")); // Return true if the string is equal to the string given in bracket.

        System.out.println(a.equals("Rwitesh")); // Return true if the string is equal to the string given in bracket otherwise false.

        String b = "Microsoft";
        System.out.println(b.equals("Microsoft"));
        System.out.println(b.equalsIgnoreCase("miCROsofT")); // It will ignone the case and return true if the string is same with the given characters.

        //To print double quote, we have to use back slash
        System.out.println("Hi, I am \"Double Quote\"");
    }
}
