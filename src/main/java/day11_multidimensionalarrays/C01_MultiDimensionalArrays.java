package day11_multidimensionalarrays;

import day10_arrays.C05_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C01_MultiDimensionalArrays {

    public static void main(String[] args) {

        //Kullanicidan alinan bir Stringde gecen sesli harfleri console yazdirin

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen cumle giriniz");

        String cumle = input.nextLine().toLowerCase();

        String[] arr = cumle.split(""); //Cumleyi Array`e donusturduk

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals("a") ||
                    arr[i].equals("e") ||
                    arr[i].equals("u") ||
                    arr[i].equals("0") ||
                    arr[i].equals("i")) {

                System.out.print(arr[i] + " ");
            }

        }
    }
}
