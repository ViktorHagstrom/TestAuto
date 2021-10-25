package com.company;

public class Main {

    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        System.out.println("A = " +a + "\nB = " + b);
        
        int tmp = a;
        a=b;
        b=tmp;

        System.out.println("A = " +a + "\nB = " + b);


    }
}
