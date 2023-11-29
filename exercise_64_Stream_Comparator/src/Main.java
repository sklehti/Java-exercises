import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = readFile("literacyskills.csv");

        list.forEach(System.out::println);
    }

    public static List<String> readFile (String file) {
        List<String> list = new ArrayList<>();

        try (Stream<String> content = Files.lines(Paths.get(file))) {
             content.map(r -> r.split(","))
                     .filter(p -> p.length >= 5)
                     .sorted((v1, v2) -> {
                        return Double.compare(Double.parseDouble(v1[5]), Double.parseDouble(v2[5]));
                     })
                     .map(p -> p[3] + "(" + p[4] + "), " + p[2] + ", " + p[5])
                     .forEach(list::add);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return list;
    }
}