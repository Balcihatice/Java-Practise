package day05_ifstatement;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

  /*Soru 6) Kullanicidan iki sayi isteyin,
 sayilarin ikisi de pozitif ise "sayilarin toplamini "yazdirin,
 sayilarin ikisi de negative ise "sayilarin carpimini" yazdirin,
 sayilarin ikisi farkli isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
 sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.*/


        Scanner scan = new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz");
        double sayi1 = scan.nextDouble();
        System.out.println("2.sayiyi giriniz");
        double sayi2 = scan.nextDouble();

        if (sayi1 > 0 && sayi2 > 0) {
            System.out.println(sayi1 + sayi2);
        } else if (sayi1 < 0 && sayi2 < 0) {
            System.out.println(sayi1 * sayi2);
        } else if (sayi1*sayi2 < 0){ //zit isaretlerde carpim eksi dir
            System.out.println("Farkli isaretlerde islem yapamazsin");
        } else {
            System.out.println("sifir yutan elemandir");
        }
    }
}