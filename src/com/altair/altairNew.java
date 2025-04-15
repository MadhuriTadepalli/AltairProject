package com.altair;
public class altairNew {
    public static void multiplyNoArgsNoReturn() {
        int a = 5;
        int b = 10;
        int c = a * b;
        System.out.println("Multiplication of a and b is: " + c);
    }

    public static void multiplyWithArgsNoReturn(int a, int b) {
        int c = a * b;
        System.out.println("Multiplication of a and b is: " + c);
    }
    public static int multiplyWithArgsReturn(int a, int b) {
        return a * b;
    }
    public static int multiplyNoArgsReturn() {
        int a = 6;
        int b = 7;
        return a * b;
    }

    public static void main(String[] args) {
        // Calling Method 1
        multiplyNoArgsNoReturn();

        // Calling Method 2
        multiplyWithArgsNoReturn(8, 9);

        // Calling Method 3
        int c = multiplyWithArgsReturn(3, 4);
        System.out.println("Multiplication of a and b is: " + c);

        // Calling Method 4
        int d = multiplyNoArgsReturn();
        System.out.println("ultiplication of a and b is: " + d);
    }
}