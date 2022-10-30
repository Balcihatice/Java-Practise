package day01_variables;

public class C01_Variables {
    public static void main(String[] args) {
/*
byte.short,int ,long double, float veri typelerinin max ve min degerini yazdırın
 */
        byte byteMax = Byte.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;
        System.out.println("byteMax = " + byteMax);

        System.out.println("byteMin = " + byteMin);
        short shrtMax = Short.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;
        System.out.println("intMin = " + intMin);
        long longMin = Long.MIN_VALUE;
        System.out.println("longMin = " + longMin);

        //System.out.println("T\nE\nC\nH\nP\nR\nO\nE\nD\nU\nC\nA\nT\nİ\nO\nN");
// 12345,yan yana ve alt alta yazın
        System.out.println("*****println*********");
        System.out.println("1\n2\n3\n4\n5");
        System.out.println("========print========");
        System.out.print("1");
        System.out.print("2");
        System.out.print("3");
        System.out.print("4");
        System.out.println("5");
//Farklı üç data type da variable oluşturun ve yazdırın
        String okulIsmi = "Emin";
        System.out.println("okulIsmi = " + okulIsmi);
        int sayi = 123;
        double sayi2 = 43.45;
        double toplam = sayi + sayi2;
        System.out.println("toplam = " + toplam);

        char ch = 'h';
        System.out.println("ch = " + ch);
// bir tam sayı ve bir char toplamı
        int toplam2 = ch+sayi;
        System.out.println(ch+sayi);// 227 h harfinin aski degerini aldı
        System.out.println(227-sayi);// h nin aski degeri

  int sayi3 = 0;
  char harf2 = 's';
        System.out.println(sayi3 + harf2); // snin aski degeri 115 çıktı .aski degeri bulmak için sıfır ile topla


    // Initiallizing Variable  (variableye baaşlangıç degeri verme )
        int age = 32;











    }
}
