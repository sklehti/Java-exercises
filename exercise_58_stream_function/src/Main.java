import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisibleNumbers = divisibleNumbers(numbers);
        divisibleNumbers.stream().forEach(n ->
                System.out.println(n));

    }

    public static ArrayList<Integer> divisibleNumbers (ArrayList<Integer> numbers) {
        return numbers.stream().filter(n -> (n % 2 == 0 || n % 3 == 0 || n % 5 == 0)).collect(Collectors.toCollection(ArrayList::new));
    }
}