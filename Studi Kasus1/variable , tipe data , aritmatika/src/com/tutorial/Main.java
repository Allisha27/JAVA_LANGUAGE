package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double PI, luas;
        int r ;
        PI = 3.14;

        System.out.println("keliling lingkarang : " + PI);

        System.out.print("masukkan jari-jari : ");
        r  = userInput.nextInt();

        luas = PI * r * r;
        System.out.println("hasil = " + luas);




    }
}
