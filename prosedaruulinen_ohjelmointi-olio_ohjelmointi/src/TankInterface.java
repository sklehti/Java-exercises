import java.util.Scanner;

public class TankInterface {
    private Scanner reader;
    private Tank tank1;
    private Tank tank2;


    public TankInterface () {
        this.reader = new Scanner(System.in);
        this.tank1 = new Tank();
        this.tank2 = new Tank();

    }

    public void launch () {
        while (true) {
            System.out.println("Ensimmäinen: " + tank1);
            System.out.println("Toinen: " + tank2);
            String addAmount = reader.nextLine();

            if (addAmount.equals("lopeta")) {
                break;
            }

            String command = addAmount.split(" ")[0];
            int amount = Integer.valueOf(addAmount.split(" ")[1]);

            if (command.equals("lisaa") && amount > 0) {
                this.add(amount);

            }
            if (command.equals("siirra") && amount > 0) {
                this.move(amount);
            }

            if (command.equals("poista") && amount > 0) {
               this.remove(amount);
            }

        }
    }
   public void add (int amount) {
       tank1.add(amount);
       System.out.println();
   }

   public void move (int amount) {
       tank1.remove(amount);
       tank2.add(amount);
       System.out.println();
   }

   public void remove (int amount) {
       tank2.remove(amount);
       System.out.println();
   }
}
