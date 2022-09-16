package com.bridgelabz;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x-coordinates value: ");
        int x = sc.nextInt();
        System.out.println("Enter y-coordinates value: ");
        int y = sc.nextInt();
        // compute distance to (0, 0)
        double dist = Math.sqrt(x*x + y*y);

        // output distance
        System.out.println("Distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
    }
    }

