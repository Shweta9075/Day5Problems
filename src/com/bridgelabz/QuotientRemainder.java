package com.bridgelabz;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        int quotient = 0;
        int remainder = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        quotient = num1/num2;
        remainder = num1%num2;
        System.out.println("Quotient when " + num1 + "/" + num2+ " is : " + quotient);
        System.out.println("Remainder when " + num1 + "%" + num2+ " is : " + remainder);
    }
}
