package com.tutorial;

import java.util.*;

public class Main {
    //switch case

    public static void main(String[] args) {
        String input;

        Scanner inputUser= new Scanner(System.in);

        System.out.print("panggil nama:");
        input =inputUser.next();

        //ekspresinya berapa satuan (int ,long ,byte ,short), String atau enum
        switch(input){
            case "allisha":
                System.out.println("saya allisha hadir bos!!!");
                break;
            case "dude":
                System.out.println("saya dude hadir bos!!!");
                break;
            case "raka":
                System.out.println("saya raka hadir boss!!!");
                break;
            default:
                System.out.println( input + "tidak hadir bos!!!");
        }
        System.out.println("selesai program");
    }
}
