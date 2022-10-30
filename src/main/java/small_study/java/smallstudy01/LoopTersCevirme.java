package small_study.java.smallstudy01;

import java.util.Scanner;

public class LoopTersCevirme {

    // Kullanicidan bir sayi alin ve ardindan ters cevirin or 12345>>>54321
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen sayi giriniz");

        int sayi = input.nextInt();

        int tersi = 0;

        int kalan = 0;

        while (sayi > 0) {

            kalan = sayi % 10;

            tersi = tersi * 10 + kalan;

            sayi = sayi / 10;
        }

        System.out.println(tersi);
    }
}
