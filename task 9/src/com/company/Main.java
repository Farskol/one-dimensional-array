package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int amountOfNumbers = getInt();
        int numbers [] = new int[amountOfNumbers];
        int amount [] = new int[amountOfNumbers];
        int numbersOfBig []= new int [amountOfNumbers];
        int k = 0;
        int h =0;
        for (int i = 0; i < amountOfNumbers; i++){
            numbers [i] = getInt();
        }
        for (int i = 0; i < amountOfNumbers; i++){
            for (int j = 0; j < amountOfNumbers; j++){
               if (numbers [i] == numbers [j]){
                   k++;
               }
               amount[i] = k;
               k=0;
            }
        }
        amount [k] = numbers [0];
        for (int i = 0; i < amountOfNumbers-1;i++){
            if (amount[i]<amount[i+1]){
                numbersOfBig[k] = numbers[i+1];
            }
            else {
                if (amount[i] == amount [i+1]) {
                    k++;
                    numbersOfBig[k]= numbers [i+1];
                }
            }
        }
        for (int i =0; i < k; i++){
            if (numbersOfBig [i] > numbersOfBig [i+1]) {
                amount[0] = numbersOfBig [i+1];
            }
        }
        System.out.println(amount [0]);
    }

    public static int getInt() {
        int i=0;
        boolean flag = true;
        while(flag){
            Scanner console1 = new Scanner(System.in);
            if (console1.hasNextInt()){
                i = console1.nextInt();
                flag = false;
            }
            else {
                System.out.println("Error!");
            }
        }
        return i;
    }
}
