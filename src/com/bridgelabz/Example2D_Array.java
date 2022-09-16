package com.bridgelabz;

import java.util.Scanner;

public class Example2D_Array {
    public static void main(String[] args) {
        // M for rows and n for columns
        int m, n;
        // take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of row : ");
         m = sc.nextInt();
        System.out.println("Enter total number of columns : ");
        n = sc.nextInt();
        //2-D array
        int[][] arr = new int[m][n];
        //Outer loop for row
        for(int i=0; i<m; i++){
            //Inner loop for column
            for(int j=0; j<n; j++){
                System.out.println("Row " + (i+1) +" Column "+(j+1) + " : ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Two Dimensional Array is : ");
        //Loop for to prints rows and column in matrix from
        for (int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
