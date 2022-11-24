package small_study.java.smallstudy01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CollectionsMathods {
    /*

Sule Instructor
  8:02 PM
// part 1: create list of 5 numbers from user input
// sort the list in reverse order and print it
// shuffle the list and print it
// rotate right by 3 places and print it

// bolum 1: ullanicidan 5 sayi isteyiniz
// listeyi sort methoduyla siralayiniz ve tersten yazdiriniz
// listeyi karistiriniz ve yazdiriniz
//3'er saga kaydirin ve yazdirin'

// part 2: find the max number and min number, print them
// replace all max number with min number


    //bolum 2: maximum sayiyi ve minumum sayiyi bulun  ve yazdiri
// tum max. sayilarin yerine minumum sayiyi yazdirin
     */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Lutfen " + (i + 1) + " .inci sayiyi giriniz");
            arrList.add(input.nextInt());
        }
        System.out.println(arrList);
        Collections.sort(arrList, Collections.reverseOrder());
        System.out.println("Tersten siraladiktan sonra arrList:" + arrList);


        Collections.shuffle(arrList);//suffle = rastgele karistirir
        System.out.println("Karistirdiktan sonra:" + arrList);

        Collections.rotate(arrList, 3); //belirtilen ogeleri aga kaydirir
        System.out.println(arrList);//

        Integer maxSayi = Collections.max(arrList);
        Integer minSayi = Collections.max(arrList);

        System.out.println("max arrListedeki eleman" + maxSayi);
        System.out.println("min arrListedeki eleman" + minSayi);

        Collections.replaceAll(arrList, maxSayi, minSayi);

    }
}