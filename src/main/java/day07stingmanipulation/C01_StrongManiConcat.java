package day07stingmanipulation;

import java.util.Scanner;

public class C01_StrongManiConcat {
    public static void main(String[] args) {
         /*

    ONEMLI NOT=JAVA YUKARIDAN ASAGI ; SOLDAN SAGA CALISIR.

     */
        System.out.println(15 + 20 + "Merhaba"); //35Merhaba
        System.out.println("Merhaba" + 15 + 20);  //Merhaba1520
        System.out.println("Merhaba" + (15 + 20));//Merhaba35
        System.out.println("Merhaba" + 15 * 20);// Merhaba300

        //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola kullanici nasil girerse girsin
        // tam isminin buyuk harfle yazilmasini saglayin.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isim soyisim giriniz");
        String isim = input.nextLine(), soyisim = input.nextLine();

        String tamIsim = isim.concat(" "+soyisim).toUpperCase();
        System.out.println("tamIsim " + tamIsim);











    }
}
