package com.company;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    public void run(){
        try{
            Scanner scanner = new Scanner(System.in);
            String st = scanner.nextLine();
            String string[] = st.split(" ");
            for (String el: string) {
                System.out.println(el);
            }
        } catch (Exception e){
            System.out.println("NOOOOOOOOOOOOOOOOOOOOOOO");
        }

    }
}
