import java.util.*;

public class BookInterface {
    private Scanner reader;
    private List<Book> list;

    public BookInterface (Scanner r) {
        this.reader = r;
        this.list = new ArrayList<>();
    }

    public void launch () {

        while (true) {
            System.out.print("Syötä kirjan nimi, tyhjä lopettaa: ");
            String name = this.reader.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("Syötä kirjan pienin kohdeikä: ");
            String minAge = this.reader.nextLine();

            if (isInteger(minAge)) {
                this.list.add(new Book(name, Integer.parseInt(minAge)));

            } else {
                System.out.println("Syötteen pitää olla kokonaisluku!");
            }
            System.out.println();
        }

        this.allBooks(this.list);
    }

    public boolean isInteger (String value) {
        if (value == null) {
            return false;
        }

        try {
            int v = Integer.parseInt(value);

        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public void allBooks (List<Book> books) {
        System.out.println("Kirjat:");

        Comparator<Book> sortBooks = Comparator.comparing(Book::getMinAge).thenComparing(Book::getName);

        this.list.sort(sortBooks);

        this.list.forEach(System.out::println);
    }
}
