/**
 * StringBuffer is a more efficient way to add characters to a string than String.
 */

public class Main {
    public static void main(String[] args) {
        String value = "";

        for (int i = 0; i < 5; i++) {
            value += i + "\n";

        }
        // at the top, a total of nine strings are created


        System.out.println();

        StringBuffer value2 = new StringBuffer();

        for (int i = 0; i < 5; i++) {
            value2.append(i);
        }
        // only one string is created at the top
    }
}