package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        int f=0;
        int sum = 0;
        int i3 = 2;
        double massiveOfNumbers [] = new double[N];
        int numbers [] = new int[N];
        numbers[0] = 2;
        for (int i = 0; i < N; i++){
            massiveOfNumbers [i] = Math.random()*20-10;
            System.out.print(massiveOfNumbers [i] + ", ");
        }
        System.out.println("");
        for( int i = 2; i < N; i++) {
            for (int i2 = 2;i2 < i; i2++){
                if (i%i2 == 0) {
                    break;
                }
                i3++;
                f++;
            }
            if (i3 == i){
                numbers[f] = i;
            i3 = 0;
            f = 0;
            }
            System.out.println(numbers[f]);
        }
        for (int i=0; i < f; i++){
            sum += massiveOfNumbers[numbers[i]];
        }
        System.out.println("Summa is: "+ sum);
    }
}
