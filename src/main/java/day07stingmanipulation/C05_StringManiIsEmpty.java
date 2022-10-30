package day07stingmanipulation;

import java.util.Scanner;

public class C05_StringManiIsEmpty {
    public static void main(String[] args) {

        String str1 = "Hi";
        System.out.println(str1.isEmpty());
        String str2 = "";
        System.out.println(str2.isEmpty());//true dur hicligin ici bostur
        String str3 = " ";
        System.out.println(str3.isEmpty());


// Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cumle giriniz");
        String cumle = scan.nextLine();

        if (cumle.isEmpty()) {
            System.out.println("Cumle bos");
        } else
            System.out.println("cumle bos degil");

// 2..yol .....
        System.out.println("Luten bir cumle giriniz...");
        String str5 = scan.nextLine();

        boolean spaceVarMi = str5.replaceAll("[^ ]", "").length()>0;
        System.out.println(spaceVarMi);




    }
}
