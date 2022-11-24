package small_study.java.smallstudy01;

import java.util.HashMap;
import java.util.Scanner;

public class KullaniciBilgileriMap {

    /*
    /* 1- Kullanıcıdan bir kişinin kimlik numarasını(4 haneli), tam ismini, adresini , telefonunu alın.
   2- Kimlik numarasını key olarak, diğer bilgileri value olarak bir mape depolayın
   3- Kimlik numarasını girerek kullanıcını bilgilerini ekrana yazdırın
   4- Tüm kullanicilarin isimlerini ekrana yazdıralım
*/
    public static void main(String[] args) {


        HashMap<Integer, HashMap<String, String>> kisiListesi = new HashMap<>();

        Scanner input = new Scanner(System.in);

        String secim = "";
        do {
            HashMap<String, String> kisiBilgileri = new HashMap<>();
            System.out.println("Lutfen isim soyisim giriniz");

            kisiBilgileri.put("tam isim", input.nextLine());
            System.out.println("Adresinizi giriniz");
            kisiBilgileri.put("Adres", input.nextLine());

            System.out.println("Telefon numaranizi giriniz");
            kisiBilgileri.put("Telefon", input.nextLine());

            System.out.println("Tc numaranizi giriniz");
            kisiListesi.put(input.nextInt(), kisiBilgileri);//tc yi kisiListesi map`ine ekledik

            input.nextLine();//DUMMY Scanner bug ini duzeltmek icin yazdirdik, yazdirmadan once yazdirir, sonra yazdirabiliriz

            System.out.println("kisiBilgileri" + kisiBilgileri);
            System.out.println("Kisi Listesi" + kisiListesi);

            System.out.println(" Devam etmek istiyormusunuz E/H ");
            secim = input.nextLine();

        } while (secim.equalsIgnoreCase("E"));
        System.out.println("Gormek istediginiz kisinin tc numarasini giriniz");

        System.out.println(kisiListesi.get(input.nextInt()));

    }
}