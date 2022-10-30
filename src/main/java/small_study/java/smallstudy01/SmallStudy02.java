package small_study.java.smallstudy01;

import java.util.Scanner;

public class SmallStudy02 {
    public static void main(String[] args) {
//Interviev sorusu
// //* oru6) 100 den kucuk bir tam sayi isteyin
//        1 den baslayarak girilen sayiya kadar yazdirin
 //               sayi 3 un kati ise sayi yerine Java yadirin
           //     sayi hem 3 hemde 5 in kati ise sayi yerine Java Guzeldir

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen sayi giriniz");
        byte sayi1 = scan.nextByte();
        boolean ucunKatiMi, besinKatiMi;
        String mesaj1 ="",kelimeJava = "Java",kelimeGuzeldir = "Guzeldir";



 /*7
 0 interviev  String isteyin ve tersten yazdirin

  */
        System.out.println("Bir cumle giriniz.");
        
        
String cumle = scan.nextLine();
String cumle2 = "";
        for (int i = cumle.length()-1; i>-1; i--) {
            cumle2 = cumle2+ cumle.substring(i,i+1);
        }
        System.out.println(cumle2);



//cumleyi metodla ters cevir
        


















    }
}
