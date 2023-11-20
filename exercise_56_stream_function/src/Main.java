import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * A stream is created from any object that implements the Collection interface
 * (e.g. ArrayList, HashSet, HashMap, ...) with the stream() method.
 * https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html
 */

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        List<Double> list = new ArrayList<>();

        System.out.println("Kirjoita syötteitä, \"loppu\" lopettaa.");

        while (true) {
            String value = reader.nextLine().toLowerCase();

            if (value.equals("loppu")) {
                break;
            }

            if (isNumeric(value)) {
                list.add(Double.parseDouble(value));
            } else {
                System.out.println("Syötä vain lukuja!");
            }


        }

        System.out.println();
        System.out.println("Tulostetaanko negatiivisten vai positiivisten lukujen keskiarvo? (n/p)");
        String value2 = reader.nextLine().toLowerCase();

        if (value2.equals("n")) {
            double averageValue = list.stream().filter(v -> v < 0).mapToDouble(n -> n).average().getAsDouble();
            System.out.println("Negatiivisten lukujen keskiarvo: " + averageValue);

        } else if (value2.equals("p")) {
            double averageValue = list.stream().filter(v -> v > 0).mapToDouble(p -> p).average().getAsDouble();
            System.out.println("Positiivisten lukujen keskiarvo: " + averageValue);

        } else {
            System.out.println("Valitse n tai p.");
        }

    }



     public static boolean isNumeric (String value){
        if (value == null) {
            return false;
        }

        try {
            double d = Double.parseDouble(value);

        } catch (NumberFormatException e) {
            return  false;
        }

        return  true;

    }


}