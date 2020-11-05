package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int N = getInt();

        int numbers[] = new int[N];
        for (int i = 0; i < N; i++ ){
            numbers[i] = getInt();
        }
        int minNumbers =numbers[0];
        int j = 0;
        for (int i=0; i <N; i++){
            if (minNumbers>numbers[i]) {
                minNumbers = numbers[i];
            }
        }
        System.out.println("Min number is: "+minNumbers);
        int newNumbers []= new int [N];
        for (int i = 0; i < N; i++){
            if (minNumbers != numbers[i]){
                newNumbers[j] = numbers[i];
                System.out.print(newNumbers[j] + ", ");
                j++;
            }
        }
    }

    public static int getInt(){
        int i = 0;
        boolean flag = true;
        while (flag){
            Scanner console1 = new Scanner(System.in);
            if(console1.hasNextInt()) {
                i = console1.nextInt();
                flag = false;
            }
            else {
                System.out.println("Error");
            }
        }
        return i;
    }
}
