package small_study.java.smallstudy01;

import java.util.Scanner;

public class Soru {

    public static void main(String[] args) {
        /*
Example 6:
Kullanicidan gun ismini yazmasini isteyin.
Girilen isim gecerli bir gun ise gun isminin 1.,2.ve3.harflerini buyuk,
digerleri kucuk olacak sekilde yazdirin
gun ismi gecerli degilse "Gecerli gun ismi giriniz" yazdirin.
*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Gun ismi giriniz");
        String gunNo = scan.nextLine();

        if (gunNo.equalsIgnoreCase("Pazar")) {
            System.out.println("PazaR");

        } else if (gunNo.equalsIgnoreCase("Pazartesi")) {
            System.out.println("SalI");

        } else if (gunNo.equalsIgnoreCase("Sali")) {
            System.out.println("SalI");

        } else if (gunNo.equalsIgnoreCase("CarSamba")) {
            System.out.println("CarSamba");

        } else if (gunNo.equalsIgnoreCase("PerSembe")) {
            System.out.println("PerSembe");

        } else if (gunNo.equalsIgnoreCase("cuma")) {
            System.out.println("cuma");

        } else if (gunNo.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Cumartesi");

        } else if (gunNo.equalsIgnoreCase("Pa")) {
            System.out.println("SalI");

        } else {
            System.out.println("Lutfen gun ismi giriniz");

        }
    }
}
