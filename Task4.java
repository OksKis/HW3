package com.gmail.ksukiseleva;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        double a;
        System.out.println("Input a: ");
        a = sc.nextDouble();

        double b;
        System.out.println("Input b: ");
        b = sc.nextDouble();

        double c;
        System.out.println("Input c: ");
        c = sc.nextDouble();

        if((a + b > c) && (b + c > a) && (a + c > b)) {
            System.out.println("The triangle is real");
        } else {System.out.println("The triangle is unreal");}
    }
}


