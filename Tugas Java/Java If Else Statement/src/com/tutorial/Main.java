package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput= new Scanner(System.in);
        System.out.print("masukan waktu:");


        int waktu = 9;
        waktu = userInput.nextInt();
        if (waktu < 9) {
            System.out.println("Good morning.");
        } else {
            System.out.println("Good afternoon.");
        }
        System.out.println("program selesai");

    }
}
