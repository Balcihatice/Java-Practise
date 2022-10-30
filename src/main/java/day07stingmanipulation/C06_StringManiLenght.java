package day07stingmanipulation;

import java.util.Scanner;

public class C06_StringManiLenght {


// Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

/**
 * Length()
 * length() method'u girilen String'in uzunlugunu verir
 * butun karakterlerin adedi (bosluklar da birer karakterdir)
 */
        //havva==leght=5
        //index=4
        public static void main(String[] args) {


            String cumle="Bugun hava yagmurlu";
            System.out.println(cumle.length());//19

            String str1="";
            System.out.println(str1.length());//0


            String str2=" ";
            System.out.println(str2.length());//1

            // Kullanicidan isim ve soyismini girmesini isteyin ve
            // hangisinin daha uzun oldugunu yazdirin.

            Scanner input = new Scanner(System.in);
            System.out.println("Lutfen isminizi ve soyisminizi giriniz: \n isim :");
            String isim=input.next();
            System.out.println("Soyisim");
            String soyIsim=input.next();


            if(isim.length()>soyIsim.length()){
                System.out.println("isminiz soyisminizde uzun");
            }else if(isim.length()==soyIsim.length()){
                System.out.println("Isminiz soyisminizle ayni uzunlukta");
            }else System.out.println("Soyisminiz isminizden uzun");
















        }
}
