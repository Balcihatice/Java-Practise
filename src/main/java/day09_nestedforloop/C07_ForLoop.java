package day09_nestedforloop;

public class C07_ForLoop {

        //Asagidaki sekli yazdiran kodu yaziniz
//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6
//
        public static void main(String[] args) {

            for (int i = 1; i <=6 ; i++) {

                for (int j = 1; j <= i ; j++) {

                    System.out.print(" "); //satirbaslarindaki bosluk
                }
                for (int k = i; k < 7; k++) {
                    System.out.print(k + " ");
                }
                System.out.println();
            }

//2.yol

            for(int i=1; i<=6; i++) {//satirlar icin
                for(int b=1; b<i; b++) {//bosluklar icin
                    System.out.print(" ");
                }
                for(int s=i; s<=6; s++) {//rakamlar icin
                    System.out.print(s + " ");
                }
                System.out.println();
            }



        }
    }

