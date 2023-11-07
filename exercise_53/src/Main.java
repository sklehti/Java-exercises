import java.util.*;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addProduct("kahvi", 5, 10);
        storage.addProduct("maito", 3, 20);
        storage.addProduct("piimä", 2, 55);
        storage.addProduct("leipä", 7, 8);

        Store store = new Store(storage, new Scanner(System.in));
        store.shopping("Pekka");
    }


}