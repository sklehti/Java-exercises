import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(-7);
        list.add(-4);
        list.add(2);
        list.add(-6);

        positives(list).stream().forEach(n -> System.out.println(n));


    }

    public static List<Integer> positives (List<Integer> numbers) {
        // both lines are right to writen
         return numbers.stream().filter(n -> n > 0).collect(Collectors.toList());
        // return numbers.stream().filter(n -> n > 0).collect(Collectors.toCollection(ArrayList::new));
    }
}