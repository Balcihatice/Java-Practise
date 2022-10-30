package day09_nestedforloop;

import java.util.Scanner;

public class Calisma {
    /*


     Kullanicidan toplanmak uzere sayilar isteyin.
     Sayi adedi 10'u gecerse yada toplami 500'u gecerse
    " Bu kadar sayi yeter ...adet sayi girdiniz toplami..." yazdirin
     */
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);

    int sayi=0;
    int toplam=0;
    int sayac=0;

    while(sayi<11 && toplam<500){
        System.out.println("Toplanmak uzere sayi giriniz");
        sayi = input.nextInt();
        toplam+=sayi;
        sayac++;
        }
    if (toplam>500){
        System.out.println(sayac + "detsayi girdiniz. Toplami: "+ toplam);
    }else
        System.out.println("Bu kadar sayi yeter "+ sayac + " sayi girdiniz.Toplami: " + toplam);

    }


}
