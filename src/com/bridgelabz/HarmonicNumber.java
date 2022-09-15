package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        double res = 0.0;
        System.out.println("The Harmonic series is : ");
        while(num != 0){
            res = res + (double) 1/num;
            num--;
            System.out.print(res + ", ");
        }
        System.out.println("Nth harmonic value is : " + res);

    }
}
