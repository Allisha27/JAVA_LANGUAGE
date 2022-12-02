package com.tutorial;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// projek 1 -16/10/2022
        String nama, alamat, umur;

        nama   ="allisha";
        alamat ="laut";
        umur   ="19";

        System.out.printf("nama saya %s alamat saya di %s dan umur saya %s \n", nama , alamat, umur );


        nama   ="badru";
        alamat ="dekeng";
        umur   ="19";

        System.out.printf("nama saya %s alamat saya di %s dan umur saya %s \n", nama , alamat, umur );

        int a , b ,c;
        a=12;
        a+=10;

        b=15;
        b*=2;

        c=6;
        c/=2;

        System.out.println("nilai a adalah " + a);
        System.out.println("nilai b adalah " + b);
        System.out.println("nilai c adalah " + c);

        c=10;

        double d;
        d = (double)c / 4;
        System.out.println(d);

        int nilaiInt;
        nilaiInt = 300;
        System.out.println();

        byte nilaiByte;
        nilaiByte =(byte) nilaiInt;
        System.out.println(nilaiByte);

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);





    }
}
