package day07stingmanipulation;

public class C02_StringManiSubsitring {
    public static void main(String[] args) {
    /** substring()
     //substring() in iki kullanimi vardir.
     //1)substring(baslangic indexi, bitis indexi) String'in ortasindan bir parca almaya yarar
     //2)substring(baslangic indexi) String'in verilen index'ten sonuna kadar almaya yarar. Sonuc ise String dir.
     */

        //10.index dahil sonuna kadar verilen Stringi yazdiriniz >> ava gibi olsa
        String cumle = "Her dert Java gibi olsa";
        System.out.println("Her dert Java gibi olsa >>> " + cumle.substring(10));


        //son 10 harfi yazdirin >>>>gibi olsa:
        System.out.println("Her dert Java gibi olsa >>> " + cumle.substring(cumle.length()-9));


        // ilk 10 karakteri yazdırma yöntemi >> Her dert J
        System.out.println(cumle.substring(0,10));


        // 11.ci karakterden sonuna kadar olan Stringi yazdiralim >> ava gibi olsa
        System.out.println(cumle.substring(10));











}
}
