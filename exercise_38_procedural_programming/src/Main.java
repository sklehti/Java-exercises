import java.util.Scanner;

/**
 *  This program is made using procedural programming.
 */
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int firstTank = 0;
        int secondTank = 0;

        while (true) {
            System.out.println("Ensimmäinen: " + firstTank + "/100");
            System.out.println("Toinen: " + secondTank + "/100");

            String command = reader.nextLine();
            String[] array = command.toLowerCase().split(" ");

            if (array[0].equals("lopeta")) {
                break;
            }

            if (array[0].equals("lisaa") && array.length > 1) {
                firstTank += Integer.valueOf(array[1]);

                if (firstTank > 100) {
                    firstTank = 100;
                }
            }

            if (array[0].equals("siirra") && array.length > 1) {
                firstTank -= Integer.valueOf(array[1]);
                secondTank += Integer.valueOf(array[1]);

                if (firstTank < 0) {
                    firstTank = 0;
                }

                if (secondTank > 100) {
                    secondTank = 100;
                }
            }

            if (array[0].equals("poista") && array.length > 1) {
                secondTank -= Integer.valueOf(array[1]);

                if (secondTank < 0) {
                    secondTank = 0;
                }

            }

        }
    }
}