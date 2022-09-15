package com.bridgelabz;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        int temp, i=2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int num = sc.nextInt();
        temp = num;
        System.out.println("Prime factor of number : ");
        while (temp > 1){
            if(temp % i == 0){
                System.out.print(i+",");
                temp = temp/i;
            }else
                i++;
        }

    }
}
