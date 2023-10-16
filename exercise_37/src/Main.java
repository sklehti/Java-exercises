import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            String value = reader.nextLine();

            if (isNumeric(value)) {
                int number = Integer.valueOf(value);

                if (number == 0) {

                    if (list.size() > 0) {

                        int sum = list.stream().reduce(0, (a, b) -> a + b);
                        System.out.println(sum * 1.0 / list.size());
                        break;
                    } else {
                        System.out.println("keskiarvon laskeminen ei ole mahdollista");
                        break;
                    }
                }

                if (number > 0) {
                    list.add(number);
                }
            } else {
                System.out.println("Syötä vain lukuja!");
            }
        }

    }

    public static boolean isNumeric (String string) {
        if (string == null) {
            return false;
        }

        try {
            int number = Integer.parseInt(string);
        } catch (NumberFormatException e) {
            return  false;
        }
        return true;

    }
}