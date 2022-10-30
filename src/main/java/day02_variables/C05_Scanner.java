package day02_variables;

import java.util.Scanner;

public class C05_Scanner {
    // Kullanıcıdan ad soyad memleket konum yas boy kilo isteyin yazdırın
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//       System.out.println("Lutfen adınızı giriniz");
//       String isim = scan.nextLine();
//       System.out.println("Lutfen soyadınızı giriniz");
//       String soyad = scan.nextLine();
//       System.out.println("Memleket");
//       String memleket = scan.next();
//       System.out.println("Lutfen yaş girin");
//       int yas = scan.nextInt();
//       System.out.println("Boyunuzu giriniz");
//       byte boy = scan.nextByte();


// kullanıcıdan 5 basamaklı bir sayı alın ilk rakamın toplamını yazdırın
        System.out.println("5 basamaklı sayi giriniz...");
        int num = scan.nextInt();
        int ilkIki = num/ 1000;  //12345==>> 12 kalır
        System.out.println("ilkIki = " + ilkIki);
        int  ilIkiTop = (ilkIki%10)  + (ilkIki/10);
        System.out.println("ilIkiTop = " + ilIkiTop);;

        int onlar = (num/10)        %       10;
        //          son rakamdan kurtulduk onlar basamağındaki sayısyı bulduk
        System.out.println("onlar = " + onlar);
        
        int yuzler = (num/100)  %  10 ;

        System.out.println("yuzler = " + yuzler);


     



    }
}
