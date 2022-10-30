package day11_multidimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class C02_MultiDimensionalArrays {

    public static void main(String[] args) {

/*
    Kullanıcının girdigi bir array'in en buyuk elemani ile
        en kucuk elemanının  farkını bulan kodu yaziniz
*/

        Scanner input = new Scanner(System.in);

        System.out.println("Arrayin uzunlugunu giriniz");

        int len = input.nextInt();



       int[] arr  = new int[len];

        for (int i = 0; i < arr.length; i++) {

            System.out.println("Array`in " +i+" inci elemanlarini giriniz");

            arr[i] = input.nextInt();
        }
       Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("array`in en buyuk elemaani : " + arr[len-1]);

        System.out.println("array`in en kucuk elemaani : " + arr[0]);

        System.out.println(arr[len-1] - arr[0]);

    }
}
