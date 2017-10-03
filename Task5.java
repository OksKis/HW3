package com.gmail.ksukiseleva;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        double r;
        r = 4.0;

        double x;
        System.out.println("Input coordinate x: ");
        x = sc.nextDouble();

        double y;
        System.out.println("Input coordinate y: ");
        y = sc.nextDouble();

        if ((Math.pow(x,2) + Math.pow(y,2)) <= r) {
            System.out.println("The point is in the circle");
        } else {System.out.println("The point isn't in the circle");}
    }
}


