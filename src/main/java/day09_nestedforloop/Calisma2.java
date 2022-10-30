package day09_nestedforloop;

import java.util.Scanner;

public class Calisma2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen String bir ifade giriniz...");
        String str=input.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a' || str.charAt(i)==' '){
                continue;
            }
            System.out.println(str.charAt(i));
        }


    }
}
