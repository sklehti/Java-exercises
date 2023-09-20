import java.util.ArrayList;
import java.util.Scanner;

public class RecipeInterface {
    private Scanner reader;

    public RecipeInterface(Scanner reader) {
        this.reader = reader;

    }


    public void launch () {
        System.out.print("Mistä luetaan? ");
        String fileName = reader.nextLine();
        ArrayList<String> list = DataReader.readerData(fileName);
        ArrayList<String> mainContents = this.showMainContents(list);

        System.out.println();
        System.out.println("Komennot:\n" +
                "listaa - listaa reseptit\n" +
                "lopeta - lopettaa ohjelman\n" +
                "hae nimi - hakee reseptiä nimen perusteella\n" +
                "hae keittoaika - hakee reseptiä keittoajan perusteella\n" +
                "hae aine - hakee reseptiä raaka-aineen perusteella");



        while (true) {
            System.out.println();
            System.out.print("Syötä komento: ");
            String command = reader.nextLine();
            System.out.println();

            if (command.equals("listaa")) {
                System.out.println("Reseptit:");

                for (String l: mainContents) {
                    System.out.println(l);
                }

            }

            if (command.equals("hae nimi")) {
                System.out.print("Mitä haetaan: ");
                String name = reader.nextLine();

                System.out.println();
                System.out.println("Reseptit:");

               for (String l: mainContents) {
                   if (l.contains(name)) {
                       System.out.println(l);
                   }
               }
            }

            if (command.equals("hae keittoaika")) {
                System.out.print("Keittoaika korkeintaan:  ");
                int time = Integer.valueOf(reader.nextLine());

                System.out.println();
                System.out.println("Reseptit:");

                for (String l: mainContents) {
                    String value = l.split(": ")[1];

                    if (Integer.valueOf(value) <= time) {
                        System.out.println(l);
                    }
                }
            }

            if (command.equals("hae aine")) {
                System.out.print("Mitä raaka-ainetta haetaan: ");
                String name = reader.nextLine();

                System.out.println();
                System.out.println("Reseptit:");
                String title = "";

                for (int i = 0; i < list.size(); i++) {

                    if (list.get(i).length() > 0 && Character.isUpperCase(list.get(i).charAt(0))) {
                       title = list.get(i);
                    }

                    if (list.get(i).equals(name) && title.length() > 0) {
                        for (String c: mainContents) {
                            if (c.contains(title)) {
                                System.out.println(c);
                            }
                        }
                    }
                }
            }

            if (command.equals("lopeta")) {
                break;
            }
        }


    }

    public ArrayList<String> showMainContents (ArrayList<String> list) {
        ArrayList<String> contents = new ArrayList<>();

       for (int i = 0; i < list.size(); i++) {

            if (list.get(i).length() > 0 && Character.isUpperCase(list.get(i).charAt(0))) {
                contents.add(list.get(i) + ", keittoaika: " + list.get(i + 1));
            }
        }

        return  contents;
    }
}
