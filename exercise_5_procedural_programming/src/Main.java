import java.util.Scanner;

/***
 * Tämä ohjelma on toteutettu prosedaruulista ohjelmointia käyttäen
 */
public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int tank1 = 0;
        int tank2 = 0;

        while(true) {
            System.out.println("Ensimmäinen: " + tank1 + "/100");
            System.out.println("Toinen: " + tank2 + "/100");

            String addAmount = reader.nextLine();

            if (addAmount.equals("lopeta")) {
                break;
            }

            String command = addAmount.split(" ")[0];
            int amount = Integer.valueOf(addAmount.split(" ")[1]);

            if (command.equals("lisaa") && amount > 0) {
                tank1 = add(amount, tank1);
                System.out.println();

            }
            if (command.equals("siirra") && amount > 0) {
                if (amount > tank1) {
                    amount = tank1;
                    tank1 = 0;
                } else {
                    tank1 = tank1 - amount;
                }
                if (amount + tank2 > 100) {
                    tank2 =  100;
                } else {
                    tank2 =  amount + tank2;
                }

                System.out.println();
            }

            if (command.equals("poista") && amount > 0) {
                tank2 = remove(amount, tank2);
                System.out.println();
            }

        }
    }
    public static int add (int amount, int tank1) {
        if (tank1 + amount <= 100) {
            return  tank1 + amount;
        }
        return 100;
    }

    public static int remove (int amount, int tank2) {
        if (amount > tank2) {
            return 0;
        }
        return tank2 - amount;

    }
}