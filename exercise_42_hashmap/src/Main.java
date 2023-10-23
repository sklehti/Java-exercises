import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap <String, Book> table = new HashMap<>();

        table.put("tunteet", new Book("Järki ja tunteet", 1811, "..."));
        table.put("luulot", new Book("Ylpeys ja ennakkoluulo", 1813, "...."));

        printValues(table);
        System.out.println("---");
        printRightValues(table, "ennakko");

    }

    public static void printValues (HashMap <String ,Book> hashMap) {
        for (Book b: hashMap.values()) {
            System.out.println(b);
        }
    }

    public static void printRightValues (HashMap <String ,Book> hashMap, String value) {
        for (Book b: hashMap.values()) {
            if (b.getTitle().contains( value)) {
                System.out.println(b);
            }
        }
    }
}