package day02_variables;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //  Soru 1)   Kullanicinin  girdigi 4 basamakli sayinin
        //  ilk ve son rakaminin toplamini ekrana yazdiran programi yazdiriniz

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Lutfen 4 basamaklı sayı giriniz...");
        int sayi = scan1.nextInt();

        // bir sayının birler basamagındaki rakamı %10 ile hesaplayabiliriz

        int sonRakam = sayi%10;
        System.out.println("SonRakam = " + sonRakam);
        int ilkRakam = sayi/1000;

        System.out.println("ilkRakam + sonRakam = " + (ilkRakam + sonRakam));

    //  Soru 2) Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
        /* Ornek : Inputs : 853
    Output : Girdiginiz sayinin birler basamagi : 3
             Girdiginiz sayinin onlar basamagi : 5
             Girdiginiz sayinin yuzler basamagi : 8

         */
       Scanner scan = new Scanner(System.in);
      // System.out.println("üç basamaklı bir sayı giriniz:");
//
 //     int sayi4 = scan.nextInt();
//
// 1. yol       //birler basamağındaki sayıyı bulmak için
//      int birler=sayı1%10;
//      System.out.println("Birler basamağı:"+birler);
//
//        int onlar=sayı1/10;
//
//        int gerçekOnlar=onlar%10;
//        System.out.println("Onlar basamağı:"+gerçekOnlar);
//
//        int yüzler=sayı1/100;
//        System.out.println("Yüzler basamağı:"+yüzler);
//
//// 2. yol
//     int birler = sayi4%10;
//     int onlar = (sayi4/10)%10;
//     int yuzler = (sayi4/100);
//        System.out.println("birler = " + birler);
//        System.out.println("onlar = " + onlar);
//        System.out.println("yuzler = " + yuzler);
//
// Ödev:  Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplamini bulunuz
        //         *   Ex :
        //         *   input  : 12345==>1+2+4+5=12
        //         *   output : 12
          System.out.println("5 basamakli sayi giriniz");
           int sayi5 = scan.nextInt();

         int birler2 = sayi5%10;
         int onlar2 = (sayi5/10)%10;
         int yuzler2 = (sayi5/100)%10;
         int binler = (sayi5/1000)%10;
         int onBinler = sayi5/10000;
        System.out.println("birler2 = " + birler2);
        System.out.println("onlar2 = " + onlar2);
        System.out.println("binler = " + binler);
        System.out.println("onBinler = " + onBinler);
         int istenenToplam = birler2 + onlar2 + binler + onBinler;
        System.out.println("istenenToplam = " + istenenToplam);




    }
}
