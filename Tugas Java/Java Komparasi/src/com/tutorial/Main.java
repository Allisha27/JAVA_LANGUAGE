package com.tutorial;

public class Main {

    public static void main(String[] args) {
	// operator komparasi
        int a,b;
        boolean hasilkomparasi;

     //equal = persamaan
        System.out.println("-------PERSAMAAN");
        a= 12;
        b=12;
        hasilkomparasi= (a == b);
        System.out.printf("%d apakah sama dengan %d ? %s \n", a,b,(a == b));

        a= 11;
        b=12;
        hasilkomparasi= (a == b);
        System.out.printf("%d apakah sama dengan %d ? %s \n", a,b,(a == b));

        // non equal = pertidaksamaan
        System.out.println("-------PERTIDAKSAMAAN");
        a= 27;
        b=27;
        hasilkomparasi= (a != b);
        System.out.printf("%d apakah sama dengan %d ? %s \n", a,b,(a != b));

        a= 28;
        b=27;
        hasilkomparasi= (a != b);
        System.out.printf("%d apakah sama dengan %d ? %s \n", a,b,(a != b));

        // greater than = lebih dari
        System.out.println("-------LEBIH DARI");
        a= 7;
        b=5;
        hasilkomparasi= (a > b);
        System.out.printf("%d apakah sama dengan %d ? %s \n", a,b,(a > b));

        a= 7;
        b=10;
        hasilkomparasi= (a > b);
        System.out.printf("%d apakah sama dengan %d ? %s \n", a,b,(a > b));

        // less than = kurang dari
        System.out.println("-------KURANG DARI");
        a= 7;
        b=5;
        hasilkomparasi= (a < b);
        System.out.printf("%d apakah sama dengan %d ? %s \n", a,b,(a < b));

        a= 7;
        b=10;
        hasilkomparasi= (a < b);
        System.out.printf("%d apakah sama dengan %d ? %s \n", a,b,(a < b));

        // greater than or equal = lebih dari sama dengan
        System.out.println("-------LEBIH DARI SAMA DENGAN ");
        a= 7;
        b=5;
        hasilkomparasi= (a >= b);
        System.out.printf("%d apakah sama dengan %d ? %s \n", a,b,(a >= b));

        a= 7;
        b=10;
        hasilkomparasi= (a >= b);
        System.out.printf("%d apakah sama dengan %d ? %s \n", a,b,(a >= b));

        a= 10;
        b=10;
        hasilkomparasi= (a >= b);
        System.out.printf("%d apakah sama dengan %d ? %s \n", a,b,(a >= b));

        // less than or equal = kurang dari sama dengan
        System.out.println("-------KURANG DARI SAMA DENGAN ");
        a= 7;
        b=5;
        hasilkomparasi= (a <= b);
        System.out.printf("%d apakah sama dengan %d ? %s \n", a,b,(a <= b));

        a= 7;
        b=10;
        hasilkomparasi= (a <= b);
        System.out.printf("%d apakah sama dengan %d ? %s \n", a,b,(a <= b));

        a= 10;
        b=10;
        hasilkomparasi= (a <= b);
        System.out.printf("%d apakah sama dengan %d ? %s \n", a,b,(a <= b));
















    }
}
