package day08_loops;

public class Deneme {
    public static void main(String[] args) {
        /*
             *1 1
            *-*3 2
           *---*5 3
          *-----*7 4
         *********9 5
         */


        for (int i = 1; i < 6; i++) {


            for (int m = 5 - i; m > 0; m--) {


                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {   //2i-1=


                if ((k == 1 || k == 2 * i - 1) || i == 5) {


                    System.out.print("*");


                } else {


                    System.out.print(" ");//aralardaki bosluklar
                }
            }
            System.out.println();


        }
    }
}