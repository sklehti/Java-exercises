import java.util.Scanner;

public class TaskInterface {
    private TodoList todoList;
    private Scanner reader;

    public TaskInterface (TodoList t, Scanner r) {
        this.todoList = t;
        this.reader = r;
    }

    public void launch () {

        while (true) {
            System.out.print("Komento: ");
            String command = reader.nextLine().toLowerCase();

            if (command.equals("lopeta")) {
                break;
            }

            if (command.equals("lisää")) {
                System.out.print("Lisättävä: ");
                String addedTask = reader.nextLine().toLowerCase();

                this.todoList.add(addedTask);
            }

            if (command.equals("listaa")) {
                this.todoList.print();
            }

            if (command.equals("poista")) {
                System.out.print("Mikä poistetaan? ");
                int number = Integer.valueOf(reader.nextLine());

                this.todoList.removeTask(number);
            }
        }
    }
}
