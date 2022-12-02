package com.tutorial;

public class Main {

    public static void main(String[] args) {

        int x ,y;
        boolean hasilkomparasi;

        // equal = persamaan
        System.out.println("PERSAMAAN");
        x = 20;
        y = 20;
        hasilkomparasi = (x == y);
        System.out.printf( " %d apakah sama dengan %d ? %s \n " , x ,y ,( x == y ));

        x = 19;
        y = 20;
        hasilkomparasi = (x == y);
        System.out.printf( " %d apakah sama dengan %d ? %s \n " , x ,y ,( x == y ));

        // not equal = pertidaksamaan
        System.out.println("PERTIDAKSAMAAN");
        x = 30;
        y = 30;
        hasilkomparasi = (x != y);
        System.out.printf(" %d apakah sama dengan %d ? %s \n " , x ,y ,( x != y ));

        x = 29;
        y = 30;
        hasilkomparasi = (x != y);
        System.out.printf(" %d apakah sama dengan %d ? %s \n " , x ,y ,( x != y ));

        // greater than = lebih dari
        System.out.println("LEBIH DARI");
        x = 35;
        y = 40;
        hasilkomparasi = (x > y);
        System.out.printf(" %d apakah sama dengan %d ? %s \n " , x ,y ,( x > y ));

        x = 40;
        y = 35;
        hasilkomparasi = (x > y);
        System.out.printf(" %d apakah sama dengan %d ? %s \n " , x ,y ,( x > y ));

        // less than = kurang dari
        System.out.println("KURANG DARI");
        x =  45;
        y = 50;
        hasilkomparasi = (x < y);
        System.out.printf(" %d apakah sama dengan %d ? %s \n " , x ,y ,( x < y ));

        x = 50;
        y = 45;
        hasilkomparasi = (x < y);
        System.out.printf(" %d apakah sama dengan %d ? %s \n " , x ,y ,( x < y ));

        // greater than or equal = lebih dari sama dengan
        System.out.println("LEBIH DARI SAMA DENGAN");
        x = 55;
        y = 50;
        hasilkomparasi = (x >= y);
        System.out.printf( " %d apakah sama dengan %d ? %s \n " , x ,y ,( x >= y ));

        x = 50;
        y = 55;
        hasilkomparasi = (x >= y);
        System.out.printf( "%d apakah sama dengan %d ? %s \n " , x ,y ,( x >= y ));

        x = 50;
        y = 50;
        hasilkomparasi = (x >= y);
        System.out.printf(" %d apakah sama dengan %d ? %s \n " , x ,y ,( x >= y ));

        // less than or equal= kurang dari sama dengan
        System.out.println( "KURANG DARI SAMA DENGAN");
        x = 65;
        y = 60;
        hasilkomparasi = (x <= y);
        System.out.printf( " %d apakah sama dengan %d ? %s \n " , x ,y ,( x <= y ));

        x = 60;
        y = 65;
        hasilkomparasi = (x <= y);
        System.out.printf(" %d apakah sama dengan %d ? %s \n " , x ,y ,( x <= y ));

        x = 60;
        y = 60;
        hasilkomparasi = (x <= y);
        System.out.printf(" %d apakah sama dengan %d ? %s \n " , x ,y ,( x <= y ));






    }
}
