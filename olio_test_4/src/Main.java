import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReadingSpace all = new ReadingSpace();
        ReadingSpace even = new ReadingSpace();
        ReadingSpace odd = new ReadingSpace();
        Scanner reader = new Scanner(System.in);

        System.out.println("Anna lukuja:");

        while(true) {
            int number = Integer.valueOf(reader.nextLine());

            if (number == -1) {
                break;
            }

            all.addNumber(number);

            if (number % 2 == 0) {
                even.addNumber(number);
            } else {
                odd.addNumber(number);
            }
        }

        System.out.println("Summa: " + all.getSum());
        System.out.println("parillinen: " + even.getSum());
        System.out.println("pariton: " + odd.getSum());
    }
}