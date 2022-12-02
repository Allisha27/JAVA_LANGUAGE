package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] jjj) {
        Scanner userInput = new Scanner(System.in);

        String nama, alamat;
        int usia, gaji;

        System.out.print("NAMA       : " );
        nama = userInput.nextLine();
        System.out.print("USIA       : " );
        usia = userInput.nextInt();
        System.out.print("ALAMAT     : " );
        alamat = userInput.next();
        System.out.print("GAJI       : " );
        gaji = userInput.nextInt();

        System.out.println("NAMA     : " + nama);
        System.out.println("USIA     : " + usia);
        System.out.println("ALAMAT   : " + alamat);
        System.out.println("GAJI     : " + gaji);



    }
}
