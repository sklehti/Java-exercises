import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Minkä niminen tiedosto luetaan?");
        String name = reader.nextLine();

        try (Scanner dataReader = new Scanner(Paths.get(name))) {
            list.add(dataReader.nextLine());


            System.out.println("Mitä etsitään?");
            String person = reader.nextLine();

            if (list.contains(person)) {
                System.out.println("Löytyi!");
            } else {
                System.out.println("Ei löytynyt.");
            }

        } catch (Exception e) {
            System.out.println("Tiedoston " + name + " lukeminen epäonnistui.");
        }

    }
}