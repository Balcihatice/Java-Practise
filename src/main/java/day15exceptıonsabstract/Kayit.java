package day15exceptıonsabstract;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit {
//List interface constructor olusturamazyiz

    static List<String> listKullaniciId = new ArrayList<>();

    static List<Integer> listKullaniciSaniye = new ArrayList<>();

    static Scanner input = new Scanner(System.in);
    static int counter = 0;

    public void kayit() {
        String KullaniciId = "";
        System.out.println("Lutfen kullanici ID giriniz");
        KullaniciId = input.nextLine();
        int kullaniciSaniye = LocalDateTime.now().getSecond();
        System.out.println("Kullanici saniye " + kullaniciSaniye);
        listKullaniciId.add(KullaniciId);
        listKullaniciSaniye.add(kullaniciSaniye);


        tamamMiDevamMi();

    }

    //kayit
    private void tamamMiDevamMi() {
        String tmmMidvmM = "";
        do {

            System.out.println("Kayit girmeye devam etmek istiyormusunuz ? (E/H)");
            tmmMidvmM = input.next();
            if (tmmMidvmM.equalsIgnoreCase("e")) {
                kayit();
            } else if (tmmMidvmM.equalsIgnoreCase("h")) {
                System.out.println("Gule Gule");
                break;

            }


        } while (!tmmMidvmM.equalsIgnoreCase("e") && !tmmMidvmM.equalsIgnoreCase("h"));
        counter++;
        //Suanda ilk on saniyede girmesede kaydediyor,bunun onune gecebilmek icin
        if (counter == 1) { //bunu yazmazsak arrayi tekrar tekrar tekrar yazdirir

            SansliKullanici snsliKlnc = new SansliKullanici();//sansli kullanici classina eklemek icin
            snsliKlnc.sansliKullaniciYazdir(listKullaniciId, listKullaniciSaniye);
        }

    }


}
