import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Arvosanarekisteri rekisteri = new Arvosanarekisteri();
        Scanner reader = new Scanner(System.in);

        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(rekisteri, reader);
        kayttoliittyma.kaynnista();
    }
}