package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        int K = console.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N;i++){
            A[i] = console.nextInt();
        }
        for (int i = 0; i < N; i++){
            if(A[i]%K == 0){
                System.out.print(A[i] + " ");
            }
        }
    }
}
