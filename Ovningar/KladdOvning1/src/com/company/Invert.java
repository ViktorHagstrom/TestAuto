package com.company;

public class Invert {

    public int a;
    public int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public static int invert(int a, int b){

        print(a,b);

        int tmp=a;
        a=b;
        b=tmp;

        //print(a,b);
        return a&b;
    }

    public static void print(int a, int b){
        System.out.println("A = " +a + "\nB = " +b);
    }
}
