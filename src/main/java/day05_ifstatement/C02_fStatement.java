package day05_ifstatement;

import java.util.Scanner;

public class C02_fStatement {
    public static void main(String[] args) {
      /*  Kullanicidan yasini isteyin
// 65 veya daha buyukse emekli olabilirsin
// 65'den kucukse emekli olamazsin "? sene daha calisman lazim" yazdirin*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas > 0) {
            if (yas >= 65) {
                System.out.println("Emekli olabilirsin");
            } else {
                System.out.println("Emeekli olamazsin");
                System.out.println(65 - yas + " sene daha calismalisin");
            }
        } else {
            System.out.println("Lutfen sifirdan buyuk bir sayi giriniz");
        }

     //  String str = "Java ogren , isi kap";
     //  String sonHarf = ""+(str.charAt(str.length()-1));
     //   sonHarf = str.substring(str.length()-1); //son harfi string olarak aliriz
     //  System.out.println("sonHarf = " + sonHarf);
     //  //charat metodu cahar dondurur.char in primitivdir.yaninda hazir metod yoktur.
     //  //son indexdeki karakteri upper case yapalim
     //  System.out.println(str.substring(str.length()-1).toUpperCase());
     //
     //   //son uc harf   buyuk
     //  System.out.println(str.substring(str.length()-3).toUpperCase());


    }
}
