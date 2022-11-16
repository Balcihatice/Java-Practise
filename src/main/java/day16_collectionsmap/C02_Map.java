package day16_collectionsmap;

import java.sql.Array;
import java.util.HashMap;
import java.util.Map;

public class C02_Map {
//  Ad ve soyad bulunduruan iki ayrı array'i ad=soyad  seklinde yazdırınız.
// input : {"Ahmet", "Alev", "Gulay"};  {"Yilmaz", "Erdem", "Kaleli"};
// output : {Ahmet=Yilmaz, Alev =Erdem, Gulay=Kaleli};

    public static void main(String[] args) {

        String[] isim = {"Ahmet", "Alev", "Gulay"};
        String[] soyIsim = {"Yilmaz", "Erdem", "Kaleli"};

        HashMap<String, String> isimSoyisim = new HashMap<>();

        for (int i = 0; i < isim.length; i++) {
            isimSoyisim.put(isim[i], soyIsim[i]);
        }
        System.out.println(isimSoyisim);


    }
}
