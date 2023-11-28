import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        readBooks("books.txt").forEach(System.out::println);
    }

    public static List<Book> readBooks (String file) {
        List<Book> list = new ArrayList<>();

        try (Stream<String> bookList = Files.lines(Paths.get(file))) {
           bookList.map(r -> r.split(","))
                   .filter(p -> p.length >= 2)
                   .map(p -> new Book(p[0], Integer.parseInt(p[1]), Integer.parseInt(p[2]), p[3]))
                   .forEach(list::add);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return list;
    }
}