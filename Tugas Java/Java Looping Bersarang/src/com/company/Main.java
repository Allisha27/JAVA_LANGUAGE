package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++ ){
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int i = 0; i < 5; i++ ){
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
                if (i == j){
                break;
                }
            }
            System.out.print("\n");
            }
    }
}
