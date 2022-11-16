package day14_inheritianceencapsulation;

public class Test {


    private double genislik;
    private double yukseklik;
    private double ekranBuyuklugu;
    private int maxSes = 30;
    private int ses = 12;//artirip azalttigimiz gostermek icin bir deger atadik.
    private boolean guc;
    public Test(double genislik, double yukseklik, double ekranBuyuklugu) {//constructor olusturdum
        this.genislik = genislik;//burdaki genisligi genislik olarak kabul et
        this.yukseklik = yukseklik;
        this.ekranBuyuklugu = ekranBuyuklugu;
    }
    public double kanalDegistirme(int kanal) {
        switch (kanal) {
            case 1:
                return 34.75;//sout demedik cunku methodumuz void degil,birsey dondurmeli
            case 2:
                return 45.23;
            case 3:
                return 50.89;
        }
        return 0;
    }
    public void gucDugmesi() {//kapaliysa acar aciksa kapatir TV'yi

        this.guc = !guc; //Kapaliysa acar,Aciksa kapatir,
    }
    public int sesAzaltma() {
        if (0 < ses) {//ses pozitifse azaltir
            ses--;
        }
        return ses;
    }
    public int sesArtirma(){//maxSesden kucukse artirir
        if(maxSes>ses){
            ses++;
        }return  ses;
    }
}
