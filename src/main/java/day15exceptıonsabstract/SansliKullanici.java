package day15exceptıonsabstract;

import java.util.ArrayList;
import java.util.List;

public class SansliKullanici {
    public void sansliKullaniciYazdir(List<String> listKullaniciId, List<Integer> listKullaniciSaniye) {
        //ilk on saniyede girilenleri yakalamam lazim
        List<String> sansliKullaniciIndexes = new ArrayList<>();

        //ilk on saniyede girdiyse for loop ile tek tek bakmak lazim
        for (int i = 0; i < listKullaniciSaniye.size(); i++) {
            if (listKullaniciSaniye.get(i) < 10) {
                sansliKullaniciIndexes.add(listKullaniciId.get(i));
            }

        }
        System.out.println("Sansli Kullanicilar");
        System.out.println(sansliKullaniciIndexes);


    }
}
