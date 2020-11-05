package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = getInt();
        int numbers [] = new int [n];
        for (int i = 0; i < n; i++){
            numbers [i] = getInt();
        }
        for (int i = 1; i < n/2; i++ ) {
            numbers [i] = numbers [i+i];
        }
       for (int i = n/2; i < n; i++) {
            numbers [i] = 0;
        }
        for (int i = 0; i < n; i++){
            System.out.print(numbers[i]+" ");
        }
    }
        public static int getInt(){
        int i = 0;
        boolean flag = true;
        while (flag) {
            Scanner console = new Scanner(System.in);
            if (console.hasNextInt()) {
                i = console.nextInt();
                flag = false;
            } else {
                System.out.println("Error!!");
            }
        }
            return i;
    }
}
