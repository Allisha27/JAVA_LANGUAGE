package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int umurBenar = 18;
        int umurTebakan;
        boolean statusTebakan;

        System.out.print("masukan umur tebakan anda: ");
        umurTebakan = userInput.nextInt();
        System.out.println("umur tebakan anda adalah : " + umurTebakan);

        statusTebakan = (umurTebakan == umurBenar);
        System.out.println("Tebakkkan anda : "  + statusTebakan);

        System.out.print("saya lahir tahun 2004 ,maka umur saya sekarang adalah : \n");
        umurTebakan =userInput.nextInt();

        statusTebakan =( umurTebakan >17 ) && ( umurTebakan <18 );
        System.out.println("Tebakkan anda : " + statusTebakan);

    }
}
