package day04_ifstatement;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {
        /*
          //Kullanicidan bir gun alin
        // eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal  gun” yazdirin.
        // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
        // “Pazar”  ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin
         */

     Scanner scan = new Scanner(System.in) ;
        System.out.println("Lutfen gun giriniz");
        String day = scan.nextLine().toLowerCase();
        if(day.equalsIgnoreCase("Cuma")){
            System.out.println("Muslumanlar icin kutsal gun");
        }else if (day.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        }else if(day.equalsIgnoreCase("Pazar")) {
            System.out.println("Hırıstiyanlar icin kutsal gun");
        }else {
            System.out.println("Oyle bir kutsal gun yok");
        }









    }
}
