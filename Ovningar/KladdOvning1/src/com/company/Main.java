package com.company;

public class Main {

    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        Invert test = new Invert();


        //Invert.invert(a,b);



        a=Invert.invert(a,b);

        System.out.println(a);
        System.out.println(b);
    }
}
