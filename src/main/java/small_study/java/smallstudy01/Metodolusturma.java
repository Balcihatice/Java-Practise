package small_study.java.smallstudy01;

public class Metodolusturma {
    public static void main(String[] args) {
       int sonuc = toplama(); //boylece yeni degere atama yaptik

        System.out.println(toplama());

        System.out.println(cikartma(3,4));

        System.out.println("sonuc = " + sonuc);

        System.out.println("Toplama islemi cagrildi.\n- Islem sonucu" +toplama());

        System.out.println("Toplama islemi cagrildi.\n- Islem sonucu" +cikartma(3,1));
    }
     // Metod tanimlama;

    public static int toplama(){  //parametresiz

        //Degisken tanimlama
        int x=23;
        int y =624;
        return x+y;// Geriye dondurme
    }

    public static int cikartma(int a,int b){
        return a-b;
    }


}
