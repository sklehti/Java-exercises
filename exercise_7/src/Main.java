import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<TvProgram> list = new ArrayList<>();
        int max = 0;

        while (true) {
            System.out.print("nimi: ");
            String name = reader.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("pituus: ");
            int maxLength = Integer.valueOf(reader.nextLine());
            list.add(new TvProgram(name, maxLength));
        }

        System.out.print("Ohjelman maksimipituus? ");
        int maxLength = Integer.valueOf(reader.nextLine());

       for (TvProgram l: list) {
           if (maxLength >= l.getLength()) {
               System.out.println(l);
           }
       }



    }
}