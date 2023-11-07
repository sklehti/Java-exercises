import java.util.Scanner;

public class Store {

    private Storage storage;
    private Scanner reader;

    public Store (Storage storage, Scanner reader) {
        this.storage = storage;
        this.reader = reader;
    }

    public void shopping (String customer) {
        ShoppingCart shoppingCart = new ShoppingCart();
        System.out.println("Tervetuloa kauppaan " + customer);
        System.out.println("valikoimamme:");

        for (String product: this.storage.products()) {
            System.out.println(product);
        }

        while (true) {
            System.out.print("mitä laitetaan ostoskoriin (pelkkä enter vie kassalle):");
            String product = reader.nextLine();

            if (product.isEmpty()) {
                break;
            }

            if (this.storage.get(product)) {
                shoppingCart.add(product,storage.price(product));
            }

        }

        System.out.println("ostoskorissasi on:");
        shoppingCart.print();
        System.out.println("korin hinta: " + shoppingCart.price());
    }
}
