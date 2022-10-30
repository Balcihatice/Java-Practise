package day08_loops;

import java.util.Scanner;

public class C05_ForLoop {
    /*
      Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
      tekrarlayan kodu yaziniz
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime=input.nextLine();

        System.out.println("Lutfen kac kere tekrarlanmasini istiyorsaniz giriniz");
         int tkrSayisi=input.nextInt();

         String ilkSonHarf = kelime.substring(0,1)+kelime.substring(kelime.length()-1);
        String cikti="";
        for (int i = 1; i <=tkrSayisi ; i++) {
            cikti+=ilkSonHarf;
        }
        System.out.println(cikti);


        // 2.Yol

        System.out.println("kelime girin");
        String str=input.next();
        System.out.println("Tekrar sayini girin");
        int sayi=input.nextInt();

        String ilk = str.substring(0,1);
        String son=str.substring(str.length()-1);
        String yeni=ilk+son;
        System.out.println(yeni.repeat(sayi));

    }
}
