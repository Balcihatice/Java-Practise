package day01_variables;

import java.util.Scanner;

public class MilKilometre {
    public static void main(String[] args) {

//Mil’i kilometreye çeviren bir program yazınız. (double kullanınız)
// Not 1: km = mile x 1.6
        double km,miles;
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen km olarak uzunluk giriniz");

        km = input.nextDouble();
        input.close();
        miles = (km*1.6);

        System.out.printf("%f kilometre = %f miles" ,km ,miles);

    }}
