package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //assigment
        //tipe data [] nama ={komponen-komponen}

        System.out.println("assigment array");
        //     index =       0 1 2 3
        //                   | | | |
        int[] arrayInteger ={1,2,3,4};

        arrayInteger[0] = 11;

        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[1]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);

        //deklarasi
        //tipedata[] nama = new int [jumlah array];

        System.out.println("Deklarasi array");
        float[] arrayFloat = new float [5];

    }
}
