import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("esim.", "esimerkki");
        abbreviations.addAbbreviation("jne.", "ja niin edelleen");
        abbreviations.addAbbreviation("yms.", "ynnä muuta sellaista");

        String text = "esim. jne. yms. lol.";

        for (String part: text.split(" ")) {
            if (abbreviations.isThereAbbreviantion(part)) {
                part = abbreviations.getAbbreviation(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();

    }
}