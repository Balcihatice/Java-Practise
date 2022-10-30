package small_study.java.smallstudy01;

import java.util.Scanner;

public class TekBasamakli_CikanaKadar_Topla {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi gal ve en son sonuc tek basamakli olana kadar basmaklari birbiri ile topla
        tek basamakli ciktiginda,return eden metodu olusturunuz
        3+8=11>> 1+1=2
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayi giriniz");
        int sayi = scan.nextInt();

        System.out.println("Girdi:"+sayi+ "\n"+"Cikti: "+ dongu(sayi));

        System.out.println("Girdi:"+sayi+ "\n"+"Cikti: "+ alternatif(sayi));

    }
    public static int dongu(int sayi){
        while(sayi>9){
            sayi = rakamlarininTopla(sayi);
        }
        return sayi;
    }

    public static int rakamlarininTopla(int sayi){
       int topla = 0;
       int rakam = 0;

        while (sayi>0){
           rakam = sayi%10;
           topla += rakam;
           sayi /= 10;
        }
        return topla;
    }



    //2. yol
    public static int alternatif(int sayi){
        sayi = sayi%9;
        if(sayi%9==0){
            sayi=9;
        }
    return sayi;
    }

}
