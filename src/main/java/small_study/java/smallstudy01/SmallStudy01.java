package small_study.java.smallstudy01;

import java.util.Scanner;

public class SmallStudy01 {
    public static void main(String[] args) {
        //kullanicidan alinan sayinin tek mi cift mi oldugunu yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen sayi giriniz");
        int sayi = scan.nextInt();
        if (sayi % 2 == 0) {
            System.out.println("Cift sayi");
        } else {
            System.out.println("Tek sayi");
        }

   /*
       Example 2: Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap yazdirin.
       Teklif 80.000'in uzerinde ise “Kabul ediyorum”,
       60-80.000 arasinda ise “Konusabiliriz”.
       60.000'in altinda ise “Maalesef Kabul edemem” yazdirin.
 */

        System.out.println("maas teklifi giriniz");
        double teklif = scan.nextDouble();

        if (teklif > 80000) {
            System.out.println("Kabul ediyorum");
        } else if (teklif >= 6000 && teklif <= 80000) {
            System.out.println("Konusabiliriz");
        } else if (teklif < 60000 && teklif < 0) {
            System.out.println("maalesef kabul edemem");
        } else {
            System.out.println("Lutfen gecerli bir maas giriniz");
        }
/*
 /*
         Example 3: Bir sifre giriniz
         Eger ilk harf buyuk harf ise "A" olup olmadigini kontrol edin.Ilk harf A ise "Gecerli Sifre" degilse "Gecersiz Sifre" yazdirin.
         Eger ilk harf kucuk harf ise "z" olup olmadigini kontrol edin.Ilk harf z ise "Gecerli Sifre" degilse "Gecersiz Sifre" yazdirin.

 */
        System.out.println("Bir sifre giriniz");
        char sifre = scan.next().charAt(0);
        if (sifre >= 'A' && sifre <= 'Z') { //buyuk harfler arasinda
            if (sifre == 'A') {
                System.out.println("Gecerli sifre");
            } else {
                System.out.println("gecersiz sifre");
            }
        } else if (sifre >= 'a' && sifre <= 'z') { //kucuk harfler arasinda
            if (sifre == 'z') {
                System.out.println("Gecerli Sifre");
            } else {
                System.out.println("Gecersiz sifre");
            }
        }

/*
        Example 4: Verilen yilin "Leap Year"(Artik Yil) olup olmadigini kontrol eden kodu yaziniz.
        i)Yil 100 e bolunursa 400 e de bolunmelidir. ==> 1600+ (artik yil) 1800-(artik yil degil)
        ii)Yil 100 e bolunmezse 4 e bolunmelidir. ==> 1996+ (artik yil) 2001-(artik yil degil)

        Artik Yil: Miladi takvime göre 365 gün olan yılın 366 gün olduğu yıla denmektedir.
        Normalde 28 gün olan Şubat ayının 4 senede bir 29 çekmesiyle artık yıl yaşamış oluruz.
        Dört yılda bir gelen 366 günlük yil
 */
        int artikYil = 2000;
        if (artikYil % 100 == 0) {
            if (artikYil % 400 == 0) {
                System.out.println("artik yil");
            } else
                System.out.println("artik yil degil");
        } else if (artikYil % 4 == 0) {
            System.out.println("artik yil");
        } else {
            System.out.println("arik yil degil");
        }
        //     2.Yol


        int artikYil2 = 2000;
        String result = artikYil2 % 100 == 0 ? (artikYil2 % 400 == 0 ? "artik yil" : "Artik yil degil") : (artikYil2 % 4 == 0 ? "Artik Yil" : "Artik til degil");
        System.out.println(result);


        // 3.. Yol
        int artikYil3 = 2000;

        if (artikYil3 % 100 == 0) {

            if (artikYil3 % 400 == 0) {

                System.out.println("Artik yil");
            } else {

                System.out.println("Artik yil degil");
            }
        } else if (artikYil3 % 4 == 0) {

            System.out.println("Artik yil");
        } else {

            System.out.println("Artik yil degil");
        }



    }
}



