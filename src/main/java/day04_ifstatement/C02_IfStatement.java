package day04_ifstatement;

public class C02_IfStatement {
    public static void main(String[] args) {
        /*

    /*
    Ogrenci asagidaki gibi notlar aldiginda karsisindaki degerleri yazdiran bir kod yaziniz
                 not hesaplayici
              90 ~100 => A  Cok Iyi
              80 ~ 89 => B  Iyi
              70 ~ 79 => C  Orta
              60 ~ 69 => D  Gecer
              0 ~ 59  => F  Zayif
   */
        int not = 59;
        if (not >= 90 && not <= 100) {
            System.out.println("Notunuz: A -->> Çok İyi");
        } else if (not >= 80 && not < 90) {
            System.out.println("Notunuz: B -->> İyi");
        } else if (not >= 70 && not < 80) {
            System.out.println("Notunuz: C -->> Orta");
        } else if (not >= 60 && not < 70) {
            System.out.println("Notunuz: D -->> Gecer");
        } else {
            System.out.println("Notunuz: F -->> zayıf");
        }


    }
}
