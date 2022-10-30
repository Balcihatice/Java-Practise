package day09_nestedforloop;

public class C04_ForLoop {
    /*
        Adada yalnız bir maymun var
        Her gün 4 muz yemesi gerekiyor
        o adada sadece 165 muz var
        Aşağıdaki değişkenleri oluşturun ve maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.
        Do while döngüsü, artırma ve eksiltme ve if deyimlerini kullanın
        int MuzSayısı =165, hayatta kalmaDays = 0;
        boolean maymunAlive = true;
        */
    //Maymunun kac gun hayatta kalacagini gosteren kod
    //Hayatta kaldigi suerece muz vermelisin(DO While)
    //eger 4 ten az muz kalirsa maymunlar olur

    public static void main(String[] args) {

        int muzSayisi =165;
        boolean canliMi = true;
        int yasadigiGun = 1;

        do {
            muzSayisi -= 4; //her gun 4 muz eksiltir
            yasadigiGun++;

            if(muzSayisi<4){
                canliMi = false;
                System.out.println("bugun  "+(yasadigiGun)+ " gun yasayamadi muz kalmadi.Maymun oldu");

            }else System.out.println("bugun "+yasadigiGun+" gun yasadi Muz bitmedi.Maymun hayatta");

        }while(canliMi);

        System.out.println("Toplam maymunun yasadigi gun sayisi "+(yasadigiGun-1));
    }
}
