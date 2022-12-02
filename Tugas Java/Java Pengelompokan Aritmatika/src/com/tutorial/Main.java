package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Kesimpulannya adalah
    // Perkalian atau Pembagianakan dilakukan terlebih dahulu

    // Jika dilakukan perkalian dan Pembagian ,maka
    // akan dilakukan operasi dari kiri ke kanan

        int hasil = 5 * 10 / 2;
        System.out.println(hasil);
        hasil = 5 + 2 - 10;
        System.out.println(hasil);

     //Mengggunakan pengelompokan operasi dengan ( )
        hasil = 60 /  (2 + 10);
        System.out.println(hasil);

        Scanner userInput = new Scanner(System.in);
        //perhitungan persamaan kuadrat
        System.out.println("MENGHITUNG PERSAMAAN KUADRAT");
        int m, x ,c;

        System.out.print("nilai x = " );
        x = userInput.nextInt();
        System.out.print("gradient m = " );
        m = userInput.nextInt();
        System.out.print("bias c = " );
        c = userInput.nextInt();
        int y =(m * x * x ) + c ;

        System.out.println("nilai y " + y);


    }
}
