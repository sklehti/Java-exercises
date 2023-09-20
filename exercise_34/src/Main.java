import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        RatingInterfaceClass grades = new RatingInterfaceClass(reader);
        grades.launch();
    }
}