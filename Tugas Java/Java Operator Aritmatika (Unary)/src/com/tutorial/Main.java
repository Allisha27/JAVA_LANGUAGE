package com.tutorial;

public class Main {

    public static void main(String[] args) {
	//negatif
        int angka =10;
        System.out.printf("Unary ' - ' , %d menjadi %d \n " ,angka , -angka);

     //positif
       angka =10;
        System.out.printf("Unary ' + ' , %d menjadi %d \n " ,angka , +angka);

     //increment
     angka = 10;
        System.out.printf("Unary '++' , %d menjadi %d \n " , angka , ++angka);

      //decrement
      angka =10;
        System.out.printf("Unary '--', %d menjadi %d \n " , angka ,--angka);

      //prefix
        angka = 10;
        System.out.printf("Unary dengan '++' , %d menjadi %d \n" , angka ,++angka);

      //posfix
        angka = 10;
        System.out.printf("Unary dengan '++',posfix %d menjadi %d \n" , angka , angka++);
        System.out.printf("Unary dengan '++' ,posfix menjadi %d \n",angka);

      //boolean
      boolean Allisha=true;
        System.out.println("nilai boolean Allisha =" + Allisha);
        System.out.println("nilai boolean Allisha =" + !Allisha);
    }
}
