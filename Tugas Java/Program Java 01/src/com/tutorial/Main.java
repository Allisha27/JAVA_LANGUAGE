package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput =  new Scanner(System.in);
        String nama, alamat , notlp;
        int umur;

        // FORM PENDAFTARAN SISWA

        System.out.println("==========FORM PENDAFTARAN SISWA==========");
        System.out.print(" nama    = ");
        nama = userInput. nextLine();
        System.out.print(" alamat  = ");
        alamat = userInput. nextLine();
        System.out.print(" notlp   = ");
        notlp = userInput. nextLine();
        System.out.print(" umur    = ");
        umur = userInput. nextInt();
        System.out.println("==========FORM PENDAFTARAN SISWA==========");
        System.out.println(" nama    = " + nama);
        System.out.println(" alamat  = " + alamat);
        System.out.println(" notlp   = " + notlp);
        System.out.println(" umur    = " + umur);


    }
}
