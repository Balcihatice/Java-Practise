package day08_loops;

public class C06_NestedLoop {
  /*
         *
        * *
       *   *
      *     *
     *********
 */
    // Sekilde gorulen ucgeni yazdiriniz
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {//satir kontrolu
            for (int j = 1; j <=9 ; j++) {//sutun kontrolu
                if((i==1 && j== 5) ||(i==2 && (j==4 || j==6)) ||(i==3 && (j==3 || j==7)) ||(i==4 &&(j==2 ||j==8))|| i==5 ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    //2.Yol
        int satir;
        String bosluk = " ";
        String bosluklar;
        for (satir = 1; satir <= 4; satir++) {
            bosluklar = bosluk.repeat(5 - satir);
            System.out.print(bosluklar);
            System.out.print("*");
            switch (satir) {
                case 2:
                    bosluklar = bosluk.repeat(1);
                    System.out.print(bosluklar);
                    System.out.print("*");
                    break;
                case 3:
                    bosluklar = bosluk.repeat(3);
                    System.out.print(bosluklar);
                    System.out.print("*");
                    break;
                case 4:
                    bosluklar = bosluk.repeat(5);
                    System.out.print(bosluklar);
                    System.out.print("*");
                    break;
            }
            System.out.println();
        }
        System.out.println("*".repeat(9));

    }
}
