import java.util.Scanner;

public class TextInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextInterface ( Scanner s, Dictionary d) {
        this.reader = s;
        this.dictionary = d;
    }

    public void launch () {

        while (true) {
            System.out.print("Komento:");

            String word = reader.nextLine().toLowerCase();

            if (word.equals("lopeta")) {
                System.out.println("hei hei!");
                break;
            }

            if (word.equals("lisää")) {
                System.out.print("Sana: ");
                String finishWord = reader.nextLine().toLowerCase();
                System.out.print("Käännös: ");
                String englishWord = reader.nextLine().toLowerCase();

                this.dictionary.add(finishWord, englishWord);
                continue;
            }

            if (word.equals("hae")) {
                System.out.print("Haettava: ");
                String w = reader.nextLine().toLowerCase();
                String translation =  this.dictionary.translateWord(w);

                if (translation != null) {
                    System.out.println("Käännös: " + translation);
                } else {
                    System.out.println("sanaa " + translation + " ei löydy");
                }


                continue;
            }
            System.out.println("Tuntematon komento");
        }
    }
}
