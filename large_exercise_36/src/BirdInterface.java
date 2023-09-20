import java.util.Scanner;

public class BirdInterface {
    private Scanner reader;
    private AllBirds allBirds;

    public BirdInterface(Scanner r) {
        this.reader = r;
        this.allBirds = new AllBirds();
    }

    public void launch () {

        while (true) {
            System.out.print("? ");
            String command = this.reader.nextLine().toLowerCase();

            if (command.equals("lopeta")) {
                break;
            }

            if (command.equals("lisaa")) {
                System.out.print("Nimi: ");
                String name = this.reader.nextLine().toLowerCase();

                System.out.print("Latinankielinen nimi: ");
                String latinName = this.reader.nextLine().toLowerCase();

                this.allBirds.add(new Bird(name, latinName));
            }

            if (command.equals("havainto")) {
                System.out.print("Mikä havaittu? ");
                String name = this.reader.nextLine().toLowerCase();
                this.allBirds.setBirdAmount(name);
            }

            if (command.equals("nayta")) {
                System.out.print("Mikä? ");
                String name = this.reader.nextLine().toLowerCase();
                this.allBirds.findBird(name);
            }

            if (command.equals("tilasto")) {
                this.allBirds.printBirds();
            }
        }
    }
}
