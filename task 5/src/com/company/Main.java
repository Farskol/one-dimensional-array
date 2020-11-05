package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        double massiveOfNumbers [] = new double[N];
        for (int i = 0; i < N; i++){
            massiveOfNumbers [i] = Math.random()*20-10;
            System.out.print(massiveOfNumbers [i] + ", ");
        }
        System.out.println("");
        for(int i = 0; i < N; i++){
            if (massiveOfNumbers [i] > i){
                System.out.print(massiveOfNumbers[i] + ", ");
            }
        }
    }
}
