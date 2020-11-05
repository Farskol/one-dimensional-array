package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        int numbersOfPositive = 0;
        int numbersOfNegative = 0;
        int numbersOfZero = 0;
	    double massiveOfNumbers [] = new double[N];
	    for (int i = 0; i < N; i++){
	        massiveOfNumbers [i] = Math.random()*20-10;
	        // четыре нуля для того чтобы проверить работоспасобность программы
	        massiveOfNumbers [4] = 0;
            massiveOfNumbers [5] = 0;
            massiveOfNumbers [3] = 0;
            massiveOfNumbers [12] = 0;
        }
        for (int i = 0; i < N; i++){
            if (massiveOfNumbers [i] > 0){
                numbersOfPositive++;
            }
            else {
                if (massiveOfNumbers [i] < 0) {
                    numbersOfNegative++;
                }
                else {
                    numbersOfZero++;
                }
            }
        }
        System.out.print("Numbers of negative: " + numbersOfNegative + " Numbers of positive: " + numbersOfPositive + " Numbers of zero: " + numbersOfZero);
    }
}
