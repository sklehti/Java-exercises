import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Dictionary book = new Dictionary();

        TextInterface textInterface = new TextInterface(reader, book);
        textInterface.launch();


    }
}