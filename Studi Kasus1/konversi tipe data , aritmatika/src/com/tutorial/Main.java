package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        double luas;
        int alas , tinggi;


        System.out.print("masukkan alas : ");
        alas = userInput.nextInt();

        System.out.print("masukkan tinggi : ");
        tinggi = userInput.nextInt();

        luas = (double) alas * tinggi /2;
        System.out.println("luasnya adalah = " + luas);


    }
}
