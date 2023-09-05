import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        Scanner reader = new Scanner(System.in);

        TaskInterface taskInterface = new TaskInterface(todoList,reader);
        taskInterface.launch();

    }
}