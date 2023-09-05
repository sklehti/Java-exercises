

public class Main {
    public static void main(String[] args) {
       Account matinTili = new Account("Matin tili", 1000);
       Account omaTili = new Account("Oma tili", 0);

        System.out.println(matinTili);
        System.out.println(omaTili);

       matinTili.otto(100);
       omaTili.pano(100);

        System.out.println(matinTili);
        System.out.println(omaTili);
    }

}