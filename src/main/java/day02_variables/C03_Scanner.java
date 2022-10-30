package day02_variables;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // scan object i oluşturduk
//        System.out.println("Lutfen isim giriniz...");
//        String kullaniciIsmi = input.nextLine();
//
        //Soru 1 ) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplatan bir program yazdirin
//( CEMBERIN CEVRESI = 2*3.14*r  DAIRENIN ALANI = 3.14*r*r  )
        //       System.out.println("Lutfen cemberin yarıcapini giriniz...");
//          int r = input.nextInt();
//        System.out.println("Alan: " + 3.14*r*r);
//        System.out.println("Cavre : " + 2*3.14*r);
//
        //Soru 2 )  Kullanicidan bir dikdortgenin uzun ve kisa kenarlarini isteyip o dikdortgenin alan ve

        // cevre hesabini yapan bir program yaziniz.
//      Scanner scan2 = new Scanner(System.in);
//       System.out.println("Lutfen kısa kearı giriniz");
//       double kısa = scan2.nextDouble();
//       System.out.println("Lütfen uzun kenar uzunlugunu giriniz");
//       double uzun = scan2.nextDouble();
//      double  alan = kısa*uzun;
//      double cevre = 2*(uzun+kısa);
//       System.out.println("alan = " + alan);
//       System.out.println("cevre = " + cevre);

        //Soru 3) Kenar uzunluklari kullanicidan alinana bir ucgenin cevresini hesaplayan bir program yaziniz.(byte kullanin)
        // Ucgenin cevresi=a+b+c
//      Scanner scan = new Scanner(System.in);
//       System.out.println("Lutfen üc kenar uzunlugunu giriniz");
//       byte a =  scan.nextByte();
//       byte b = scan.nextByte();
//       byte c = scan.nextByte();
//       int cevre  = a+b+c;
//       System.out.println("cevre = " + cevre);
        // Soru4)   /*Kullanicidan aldiginiz sekille asagidaki gibi bir gorunum olusturan bir kod yaziniz

  /*
               A
              A A
             A A A
           */
         Scanner nesne = new Scanner(System.in);
        System.out.println("Lutfe bir karakter seciniz");
        char ch = nesne.next().charAt(0); //chartat 0.indexi alır
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch);
        System.out.println(ch+" "+ch+" "+ch);
        




    }
}