package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// Membuat sebuah objek untuk menangkap input dari user

        Scanner inputUser = new Scanner(System.in);

     // Sebuah program sederhana untuk membuat sebuah angka
     int nilaiBenar = 5 ;
     int nilaiTebakan;
     boolean statusTebakan;

        System.out.print("masukan nilai tebakan anda: ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("nilai tebakan anda adalah: " + nilaiTebakan);

     // Operasi Logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("tebakan anda : " + statusTebakan);

     // Operasi aljabar boolean ( and / or )
        System.out.print("masukan nilai diantara 4 dan 9: " );
        nilaiTebakan = inputUser.nextInt();

        statusTebakan = ( nilaiTebakan >4 ) && ( nilaiTebakan < 9 );

        System.out.println("tebakan anda : " + statusTebakan);
    }
}
