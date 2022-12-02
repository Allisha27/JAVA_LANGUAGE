package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("GRADING NILAI");

        int nilai;

        Scanner userInput= new Scanner(System.in);

        System.out.print("masukan nilai:");
        nilai = userInput.nextInt();
        if (nilai > 90){
            System.out.println("nilai kamu " + nilai + "=A");
        }else if (nilai > 80){
            System.out.println("nilai kamu " + nilai + "=B");
        }else if (nilai > 70){
            System.out.println("nilai kamu " + nilai + "=C");
        }else if (nilai > 60){
            System.out.println("nilai kamu " + nilai + "=D");
        }else if(nilai > 50){
            System.out.println("nilai kamu " + nilai + "=E");
        }else {
            System.out.println("grading selesai");
        }

    }
}
