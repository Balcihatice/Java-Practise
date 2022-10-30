package small_study.java.smallstudy01;

import java.util.Scanner;

public class Ucun_UssuMu {
    /*
    Bir pozitif sayi verildiginde,3  ussuolup olmadigini kontrol edin,
    3 un kuvveti ise true , degilse false return edin
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayi giriniz");
        int sayi = scan.nextInt();

        System.out.println("Girdi: " + sayi + "\n" + "Cikti:" + powerOfThere(sayi));
    }

    public static boolean powerOfThere(int sayi) {//3,9,27,81
        boolean b = false;//3un kati disindaki degerler icin false olur
        int carpma = 1;
        for (int i = 1; i < sayi; i++) {
            carpma *= 3;
            if (carpma == sayi) {
                b = true;
                break;

            }
        }
        return b;
    }
}
