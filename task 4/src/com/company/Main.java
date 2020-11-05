package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        int f = 0;
        int d = 0;
        double a;
        double massiveOfNumbers [] = new double[N];
        for (int i = 0; i < N; i++){
            massiveOfNumbers [i] = Math.random()*20-10;
            System.out.print(massiveOfNumbers [i] + ", ");
        }
        System.out.println("");
        for (int i = 1; i < N; i++){
            if (massiveOfNumbers [f] > massiveOfNumbers [i]){
                f = i;
            }
            if (massiveOfNumbers [d] < massiveOfNumbers [i]) {
                d = i;
            }
        }
        a = massiveOfNumbers [d];
        massiveOfNumbers [d] = massiveOfNumbers [f];
        massiveOfNumbers [f] = a;
        for (int i = 0; i < N; i++){
            System.out.print(massiveOfNumbers [i] + ", ");
        }
    }
}
