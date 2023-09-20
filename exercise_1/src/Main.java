import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);

       int sum = 0;
       int total = 0;
       int even = 0;
       int odd = 0;

        System.out.println("Syötä luvut:");

        while(true) {
            int number = Integer.valueOf(reader.nextLine());
            System.out.println(number);

            if (number == -1) {
                break;
            }

            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            sum += number;
            total++;
        }

        System.out.println("kiitos ja näkemiin!");
        System.out.println("Summa: " + sum);
        System.out.println("Lukuja: " + total);
        System.out.println("Keskiarvo: " + (1.0 * sum / total));
        System.out.println("Parillisia: " + even);
        System.out.println("Pariton: " + odd);
    }
}

