import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Human> people = new ArrayList<>();

        people.add(new Human("pekka"));
        people.add(new Human("Maija"));
        people.add(new Human("kerttu"));
        people.add(new Human("Mikko"));
        people.add(new Human("minna"));


        people.forEach(System.out::println);
        System.out.println();

        people.stream().sorted().forEach(System.out::println);
        System.out.println();

        Collections.sort(people);
        people.forEach(System.out::println);
    }
}