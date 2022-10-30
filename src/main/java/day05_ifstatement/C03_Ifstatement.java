package day05_ifstatement;

import java.util.Scanner;

public class C03_Ifstatement {
//Soru 1) Kullanicidan maas icin bir teklif isteyin ve
    // asagidaki degerlere gore cevap yazdirin.
    //Teklif 20.000’in uzerinde ise “Kabul ediyorum” ,
    //10000 – 20.000 arasinda ise “Konusabiliriz”,
    //10.000’nin altinda ise “Maalesef Kabul edemem” yazdirin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen maas bilgisi giriniz");
        double maas = scan.nextDouble();

  if (maas>20000){
      System.out.println("Kabul ediyorum");
  } else if (maas>10000 && maas<=20000) {
      System.out.println("Dusunmem Lazim");
  }else {
      System.out.println("Uzgunum calisamam");
        }


    }
}
