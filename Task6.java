package com.gmail.ksukiseleva;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

      int ax = 0;
      int ay = 0;
      int bx = 4;
      int by = 4;
      int cx = 6;
      int cy = 1;

        int x;
        System.out.println("Input coordinate x: ");
        x = sc.nextInt();

        int y;
        System.out.println("Input coordinate y: ");
        y = sc.nextInt();
        int a = (x - ax) * (by - ay) - (bx - ax) * (y - ay);
        int b = (x - bx) * (cy - by) - (cx - bx) * (y - by);
        int c = (x - cx) * (ay - cy) - (ax - cx) * (y - cy);

        if ((a <= 0 && b <= 0 && c <= 0) ||(a >= 0 && b >= 0 && c>= 0)) {
            System.out.println("The point is in the triangle");
        } else {System.out.println("The point isn't in the triangle");}
    }
}


