package day14_inheritianceencapsulation.Odev;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit {

    static LocalDateTime date;


    public static void main(String[] args) {

        kayitOl();
    }

    private static void kayitOl() {

        List<String> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String isim = input.nextLine();

        list.add(isim);
    }


}
