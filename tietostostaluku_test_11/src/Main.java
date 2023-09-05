import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Tiedosto?");
        String file = reader.nextLine();

        System.out.print("Alaraja? ");
        int lower = Integer.valueOf(reader.nextLine());

        System.out.print("yläraja? ");
        int upper = Integer.valueOf(reader.nextLine());

        try (Scanner dataReader = new Scanner(Paths.get(file))) {
            while(dataReader.hasNextLine()) {
                int n = Integer.valueOf(dataReader.nextLine());

                if (n >= lower && n <= upper) {

                    numbers.add(n);
                }
            }
            System.out.println("Lukuja: " + numbers.size());

        } catch (Exception e) {
            System.out.println("virhe: " + e.getMessage());
        }


    }
}