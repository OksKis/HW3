package com.gmail.ksukiseleva;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int number;
        System.out.println("Input ticket number: ");
        number = sc.nextInt();
        if(number > 999 && number < 10000) {

          int a = number / 1000;
          int b = number % 1000 / 100;
          int c = number % 100 / 10;
          int d = number % 10;
          int e;
          int f;

          if (a + b > 9) {
            e = (a + b) / 10 + (a + b) % 10;
          } else {
            e = a + b;
          }

          if (c + d > 9){
            f = (c + d) / 10 + (c + d) % 10;
          } else {
            f = c + d;
          }

          if (e == f) {System.out.println(number + " is lucky ticket");
          } else {System.out.println(number + " isn't lucky ticket");}


        } else {System.out.println("Number is incorrect!");}

    }
}


