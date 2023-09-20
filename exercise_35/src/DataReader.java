import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataReader {

    public static ArrayList<String> readerData (String data) {
        ArrayList<String> list = new ArrayList<>();

        try (Scanner reader = new Scanner(Paths.get(data))) {

            while (reader.hasNextLine()) {
                list.add(reader.nextLine());
            }
            /* list.add(reader.nextLine() + ", keittoaika: "  + reader.nextLine());

            while (reader.hasNextLine()) {
                // String[] splits = reader.nextLine().split(",");

                if (reader.nextLine().equals("")) {
                    list.add(reader.nextLine() + ", keittoaika: "  + reader.nextLine());
                }

            } */
            return list;

        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        return null;
    }
}
