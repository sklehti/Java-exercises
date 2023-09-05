import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        Main.order(numbers);

        String[] countries = {"Zimbabwe", "South-Africa", "India", "Yugoslavia", " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};
        Main.order(countries);

        ArrayList<String> al = new ArrayList<>();
        al.add("Geeks For Geeks");
        al.add("Friends");
        al.add("Dear");
        al.add("Is");
        al.add("Superb");
        Main.orderStrings(al);

        ArrayList<Integer> numbs = new ArrayList<>();
        numbs.add(5);
        numbs.add(2);
        numbs.add(8);
        numbs.add(7);
        numbs.add(-1);
        Main.orderNumbers(numbs);

    }
    public  static void order (int[] table) {
        Arrays.sort(table);
        System.out.println(Arrays.toString(table));
    }

    public static void order (String[] table) {
        Arrays.sort(table);
        System.out.println(Arrays.toString(table));
    }

    public static void orderNumbers (ArrayList<Integer> list) {
        Collections.sort(list);
        System.out.println(list);
    }

    public static void orderStrings (ArrayList<String> list) {
        Collections.sort(list);
        System.out.println(list);
    }
}