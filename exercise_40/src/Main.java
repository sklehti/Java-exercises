import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskList list = new TaskList();
        Scanner reader = new Scanner(System.in);

        UserInterface userInterface = new UserInterface(list, reader);
        userInterface.launch();

    }
}