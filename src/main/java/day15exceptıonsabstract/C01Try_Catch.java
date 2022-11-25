package day15exceptıonsabstract;

public class C01Try_Catch {

    //verilen iki sayiyi 10 kez bolen kodu yaziniz
    public static void main(String[] args) {

//
//        int sayi1 = 100;
//        int sayi2 = 5;
//
//        int sayac = 1;
//
//        System.out.println("******IF ELSE ILE*******");
//
//        while (sayac < 10) {
//            if (sayi2 == 0) {
//                System.out.println("Islem yaparken payda sifir oldu");
//            } else {
//                System.out.println(sayi1 / sayi2);
//            }
//            sayi2--;
//            sayac++;
//
//        }


        System.out.println("****** TRY CATCH ********");
        int a = 100;
        int b = 5;
        int sayac2 = 1;
        while (sayac2 < 10) {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Payda sifir oldu");
            }
            b--;
            sayac2++;

        }


    }//main
}//class