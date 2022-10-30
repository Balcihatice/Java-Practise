package day03_ifstatement;

import java.util.Scanner;

public class C02_AsciiDegerler {
    public static void main(String[] args) {

       char harf = 'a' ;
       char harf2 = 'A';
        System.out.println("harf>harf2===>>>" + (harf>harf2));
// karşılastırma ıslemlerını sonucunu true ya da false döner

// Buyuk harflerin askii degerleri kucuk harflerin askii degerlerinden daha kucuktur
 // herhangi bir char variablenın aski degerleini bulun
     char space = ' '; // space in aski degeri
        System.out.println("Spacein aski degeri " + (space+0)); // soacein askii degerini bulmak için toplamaya
        // etkisi olmayan sıfır ile toplarız
     char m = 'm';
        System.out.println("m nin aski degeri " + (m+0)); // 109

// 2.yol
        int harf3 = 'm';
        System.out.println("'m'nin askii degeri = " + harf3);

 // kıyaslayın
        byte b1 = 12;
        byte b2 =-125;
        System.out.println("b1>b2==>>>" + (b1>b2)); // true

        boolean sonuc3 = 5>4 && 7<9 &&6+3==9 &&5+2!=8;
        System.out.println("sonuc3 = " + sonuc3);

        /*Example
        Kullanıcıdan aldıgınız 2 sayıyı yine kullanıcıdan aldıgınız 4 işlemle uygulamaya koyunuz
   */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen \n toplama islemi için 1 \n cıkarma islemi için 2 \n bölme islemi için 3 \n çarpka işlemi için 4 \n giriniz ");
        int islem = scan.nextInt(); // islem tercihi için bir variable oluşturdum
        System.out.println("Lutfen iki tam sayı giriniz...");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        if(islem==1){
            System.out.println("Toplama sonucu " + num1 +"+"+num2 + "="+(num1 + num2));
        } else if (islem==2) {
            System.out.println("Cıkarma sonucu " + num1+ "-" +num2+ "=" +(num1-num2));
        }else if(islem==3){
            System.out.println("Bölme sonucu " + num1+ "/" +num2+"=" +(num1/num2));
        } else if (islem ==4) {
            System.out.println("Carpma sonucu " + num1+ "*" +num2+"=" +(num1*num2));
        }else {
            System.out.println("Hatalı bir secim yaptınız");
        }
    }
}
