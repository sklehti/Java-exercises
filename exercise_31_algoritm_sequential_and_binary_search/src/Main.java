import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("kirja2", 2));
        books.add(new Book("kirja1", 4));
        books.add(new Book("kirja5", 9));
        books.add(new Book("kirja4", 25));
        books.add(new Book("kirja3", 60));
        books.add(new Book("kirja5", 80));
        books.add(new Book("kirja5", 111));
        books.add(new Book("kirja5", 162));
        books.add(new Book("kirja5", 1620));


        System.out.println(Main.sequentialSearch(books,60));

        // Note! The list must be in sort before using the binary search
        System.out.println(Main.binarySearch(books, 162));
    }

    public static int sequentialSearch (ArrayList<Book> list, int selectedId ) {
        for (int i = 0; i <list.size(); i++) {
            if (selectedId == list.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch (ArrayList<Book> list, int selectedId) {

        if (list.isEmpty()) {
            return -1;
        }

        int startIndex = 0;
        int endIndex = list.size();

        while (true) {

            if (startIndex - endIndex == 0) {
                return  -1;
            }

            int tempIndex = (endIndex - startIndex) / 2;

            if (list.get(startIndex + tempIndex).getId() == selectedId) {
                return  startIndex + tempIndex;
            }

            if (list.get(startIndex + tempIndex).getId() < selectedId) {
               startIndex += tempIndex + 1;
            } else if (list.get(startIndex + tempIndex).getId() > selectedId) {
                endIndex = startIndex + tempIndex;

            }

        }
    }
}