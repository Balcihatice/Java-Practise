package day07stingmanipulation;

import java.util.Scanner;

public class C09_StringMani {
    //Soru 1) Kullanicidan email adresini girmesini isteyin,
// mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
// @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
// @gmail.com ile bitmiyorsa "lutfen yazimı kontrol edin" yazdırın

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi giriniz");
        String mail = input.nextLine();

        if (!mail.contains("@gmail.com")) {
            System.out.println("Mail adresi giriniz");
        } else if (mail.endsWith("@gmail.com")) {
            System.out.println("Mail adresiniz kaydediliyor");
        } else {
            System.out.println("Lutfen yazimi kontrol ediniz");
        }
//2.yoll.........

        String email="abc@gmail.co**";
        String arananMetin="@gmail.com";

        if(!email.contains(arananMetin)){
            System.out.println("lutfen gmail adresi giriniz");

        }else if(email.endsWith(arananMetin)){
            System.out.println("Email adresiniz kaydedildi ");
        }else
            System.out.println("lutfen yazimı kontrol edin");

















    }


}
