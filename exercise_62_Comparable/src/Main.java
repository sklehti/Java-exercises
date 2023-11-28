import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Human> list = new ArrayList<>();
        list.add(new Human("Pirkko", 4000));
        list.add(new Human("Maija", 5600));
        list.add(new Human("Pertti", 3500));
        list.add(new Human("Kalle", 4200));

        list.forEach(System.out::println);
        System.out.println();

        // list ordering with Comparable method "sorted"
        list.stream().sorted().forEach(System.out::println);
        System.out.println();

        list.forEach(System.out::println);
        System.out.println();

        // list ordering with Collections class
        Collections.sort(list);
        list.forEach(System.out::println);

    }
}
