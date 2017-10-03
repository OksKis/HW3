package com.gmail.ksukiseleva;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int number;
        System.out.println("Input number: ");
        number = sc.nextInt();
        if(number > 99999 && number < 1000000) {

          int a = number / 100000;
          int b = number % 100000 / 10000;
          int c = number % 10000 / 1000;
          int d = number % 1000 / 100;
          int e = number % 100 / 10;
          int f = number % 10;

          if (a == f && b == e && c ==d) {
            System.out.println("The number is a palindrome");
          } else {System.out.println("The number isn't a palindrome");}

        } else {System.out.println("Number is incorrect!");}

    }
}


