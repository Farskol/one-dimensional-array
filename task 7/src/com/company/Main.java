package com.company;

import java.util.Scanner;

public class Main {
 public static int getInt (){
     int i = 0;
     boolean d = true;
     Scanner console = new Scanner(System.in);
     while (d){
         if (console.hasNextInt()){
             i = console.nextInt();
             d = false;
         }
         else {
             System.out.print("Error");
         }
     }
     return i;
 }
    public static void main(String[] args) {
        int n = getInt();
        int numbers []= new int[2*n];
        int newNumbers [] =new int [2*n];
        for (int i = 0 ; i < 2*n; i++ ){
            numbers [i] = getInt();
        }
        for (int i = 0; i < 2*n; i++){
            newNumbers [i] = numbers[i] + numbers[2*n - 1 -i];
        }
        numbers [0] = newNumbers[0];
        for (int i = 0; i < 2*n-1; i++){
            if (newNumbers [i] < newNumbers [i+1]){
                numbers [0] = newNumbers [i+1];
            }
        }
        System.out.println("Max number is: " + numbers [0] );
    }
}
