import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Book> booklist = new ArrayList<>();

        while(true) {
            System.out.print("name: ");
            String name = reader.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("Sivuja: ");
            int pages = Integer.valueOf(reader.nextLine());

            System.out.print("Julkaisuvuosi: ");
            int published = Integer.valueOf(reader.nextLine());

            booklist.add(new Book(name, pages, published));
        }

        System.out.print("mitä tulostetaan? ");
        String answer = reader.nextLine();

        if (answer.toLowerCase().equals("kaikki")) {
            for(Book b: booklist) {
                System.out.println(b);
            }
        } else if (answer.toLowerCase().equals("nimi")) {
            for(Book n: booklist) {
                System.out.println(n.getName());
            }
        }
    }
}