import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: Uniikit sukunimet...

        Scanner reader = new Scanner(System.in);
        ArrayList<Person> list = new ArrayList<>();

        while (true) {
            System.out.println("Syötetäänkö henkilöiden tietoja, \"loppu\" lopettaa:");
            String answer = reader.nextLine().toLowerCase();

            if (answer.equals("loppu")) {
                break;
            }

            System.out.print("Syötä etunimi: ");
            String firstName = reader.nextLine();

            System.out.print("Syötä sukunimi: ");
            String lastName = reader.nextLine();

            System.out.print("Syötä syntymävuosi: ");
            String year = reader.nextLine();

            if (isNumeric(year)) {
                list.add(new Person(firstName, lastName, Integer.parseInt(year)));

            } else {
                System.out.println("syötä luku!");
            }

            System.out.println();
        }

        System.out.println("Uniikit sukunimet aakkosjärjestyksessä:");
        list.stream().forEach(p -> System.out.println(p.getLastName()));
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int i = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}