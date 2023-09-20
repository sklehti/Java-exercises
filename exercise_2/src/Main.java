import java.util.Scanner;

public class Main {
    public static void printSpace (int total) {
        for (int i = 0; i < total; i++) {
            System.out.print(" ");
        }
    }

    public static void printStars (int total) {
        for (int i = 0; i < total; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public  static void printTriangle (int total) {
        int starts = 0;
        for (int i = 1; i <= total; i++) {
            printSpace(total - i);
            printStars(i + starts++);
        }
    }


    public static  void chrismasTree (int quantity) {
        printTriangle(quantity);

        printSpace(quantity - 2);
        printStars(3);
    }

    public static void main(String[] args) {
       chrismasTree(3);

    }
}