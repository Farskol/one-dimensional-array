package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
	// последовательность чисел до определённое колличество раз N по фенкции y = x/2+3
        int N = console.nextInt();
        int iteretion = 0;
        double Z = console.nextDouble();
        double x [] = new double[N];
        double y [] = new double[N];
        for (int i = 0; i < N; i++){
            x [i] = i+1 ;
        }
        for (int i = 0; i < N; i++){
            y[i] = x[i]/2 + 3;
        }
        for (int i = 0; i < N; i++){
            if (Z < y[i]) {
                y[i] = Z;
                iteretion++;
            }
            System.out.print(y[i] + ", ");
        }
        System.out.println("number of Z = " + iteretion);
    }
}
