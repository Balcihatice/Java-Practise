package day08_loops;

public class C07_FoorLoop {

    /*   Asagidaki sekli olusturunuz
     *****
     *  *
     * *
     **
     *

     */
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                for (int j = 1; j <= 5; j++) {
                    System.out.print("*");
                }

            } else {
                for (int j = 5; j >= i; j--) {
                    if (j == 5 || j == i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

    }
}
