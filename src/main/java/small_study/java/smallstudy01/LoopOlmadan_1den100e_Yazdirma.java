package small_study.java.smallstudy01;

public class LoopOlmadan_1den100e_Yazdirma {

    public static void main(String[] args) {

        yazdir(100);//-100iken
    }

    public static void yazdir(int sayi) {

        if (sayi < 110) {//-100 iken 0 olabilir

            System.out.print(sayi + " ");

            yazdir(sayi + 1);
        }
    }


}
