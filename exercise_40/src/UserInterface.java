import java.util.Scanner;

public class UserInterface {
    private TaskList taskList;
    private Scanner reader;

    public UserInterface (TaskList list, Scanner reader) {
        this.taskList = list;
        this.reader = reader;
    }

    public void launch () {

        while (true) {
            System.out.print("Komento: ");
            String command = this.reader.nextLine();

            if (command.toLowerCase().equals("lopeta")) {
                break;
            }

            if (command.toLowerCase().equals("lisaa")) {
                System.out.print("lisättävä: ");
                String task = this.reader.nextLine().toLowerCase();
                this.taskList.add(task);
            }

            if (command.toLowerCase().equals("listaa")) {
                this.taskList.print();
            }

            if (command.toLowerCase().equals("poista")) {
                while (true) {
                    System.out.print("Mikä poistetaan? ");

                    String value = reader.nextLine();

                    if (isNumeric(value)) {
                        this.taskList.remove(Integer.parseInt(value));
                        break;
                    } else {
                        System.out.println("Syötteen tulee olla numero!");
                    }
                }

            }

        }
    }

    public boolean isNumeric (String value) {
        if (value == null) {
            return false;
        }

       try {
           int number = Integer.parseInt(value);
       } catch (NumberFormatException e) {
           return false;
       }

       return true;
    }

}
