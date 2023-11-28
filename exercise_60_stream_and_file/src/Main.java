import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> list = read("names.txt");

        /* for (String l: list) {
            System.out.println(l);
        } */
        list.forEach(System.out::println);

    }

    public static List<String> read (String file) {
        List<String> list = new ArrayList<>();

        try (Stream<String> fileList = Files.lines(Paths.get(file))) {
            fileList.forEach(list::add);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
}