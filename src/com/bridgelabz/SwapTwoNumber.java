package com.bridgelabz;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a = ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b = ");
        int b = sc.nextInt();
        int c;
        System.out.println("After swapping : ");
        c = a;
        a = b;
        b = c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
