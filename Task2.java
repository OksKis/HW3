package com.gmail.ksukiseleva;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Input apartment number: ");
        n = sc.nextInt();
        if (n > 0 && n <= 9 * 4 * 4) {
            int entrance = (n - 1) / 36 + 1;
            int floor = (n - 1) % 36 / 4 + 1;
            System.out.println("The apartment №" + n + " on " + entrance + " entrance and on "
                    + floor + " floor." );
        } else {System.out.println("Wrong apartment number!!! Pleade try again!");}

    }
}


