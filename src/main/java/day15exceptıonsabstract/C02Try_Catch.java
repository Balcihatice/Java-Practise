package day15exceptıonsabstract;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02Try_Catch {
    /*
        Marketteki tum urunleri bir array'de tuttugumuzu varsayalim.
        Kullaniciya index sorup, o indexdeki urunu yazdiran bir program yaziniz.
        (Kullanici marketteki urun sayisindan fazla sayida bir index girerse exeption vermesinin onune gecelim)
         */
    public static void main(String[] args) {

        String[] urunler = {"Et", "Sut", "Findik", "Fistik"};
        Scanner input;

        boolean flag = true;

        int index = 0;
        while (flag) { //hatali harf veya simge girerse
            try {
                input = new Scanner(System.in);
                System.out.println("Istediginiz urunun sira numarasini giriniz ");
                index = input.nextInt();
                flag = false;
            } catch (InputMismatchException e) {
                e.printStackTrace();
                // System.out.println("Gecerli index girilmedi");
            }
        }
        try {
            System.out.println(urunler[index]);//dukkanda olmayan buyuk bir sayi girerse

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiginiz deger 0 ile 3 arasinda olmali");
        }
    }
}
