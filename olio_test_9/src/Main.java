import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Minkä tiedoston sisältö tulostetaan?");
        Scanner reader = new Scanner(System.in);

        String name = reader.nextLine();

        try (Scanner dataReader = new Scanner(Paths.get(name))) {
            while(dataReader.hasNextLine()) {
                System.out.println(dataReader.nextLine());
            }
        } catch (Exception e) {
            System.out.println("virhe: " + e.getMessage());
        }
    }
}