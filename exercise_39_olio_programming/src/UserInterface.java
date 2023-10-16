import java.util.Scanner;

public class UserInterface {
    private Tank firstTank;
    private  Tank secondTank;

    private Scanner reader;

    public UserInterface () {
        this.firstTank = new Tank();
        this.secondTank = new Tank();
        this.reader = new Scanner(System.in);
    }

    public void launch () {
        while (true) {
            System.out.println("Ensimmäinen: " + firstTank);
            System.out.println("Toinen: " + secondTank);

            String command = reader.nextLine();
            String[] array = command.toLowerCase().split(" ");

            if (array[0].equals("lopeta")) {
                break;
            }

            if (array[0].equals("lisaa") && array.length > 1) {
                firstTank.add(Integer.valueOf(array[1]));
            }

            if (array[0].equals("siirra") && array.length > 1) {
                firstTank.remove(Integer.valueOf(array[1]));
                secondTank.add(Integer.valueOf(array[1]));
            }

            if (array[0].equals("poista") && array.length > 1) {
                secondTank.remove(Integer.valueOf(array[1]));
            }

        }
    }

}
