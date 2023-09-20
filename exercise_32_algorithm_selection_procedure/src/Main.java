import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        Main.orderArray(numbers);
    }

    public static int smallest (int[] table) {
        int smallest = table[0];

        for (int t: table) {
            if (smallest > t) {
                smallest = t;
            }
        }
        return smallest;
    }

    public static int smallestIndex (int[] table) {
        int smallest = Main.smallest(table);

        for (int i = 0; i < table.length; i++) {
            if (smallest == table[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int smallestIndexFrom (int[] table, int startIndex) {
        int arrayLength = table.length - startIndex;
        int[] newTable = new int[arrayLength];

        int index = 0;

        for (int i = startIndex; i < table.length; i++) {
            newTable[index] = table[i];
            index++;
        }
        int smallest = Main.smallest(newTable);

        for (int i = 0; i < table.length; i++) {
            if (smallest == table[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void change (int[] table, int index1, int  index2) {
        int tempValue = table[index1];
        table[index1] = table[index2];
        table[index2] = tempValue;
    }

    public static void orderArray (int[] table) {
        System.out.println(Arrays.toString(table));

        for (int i = 0; i < table.length; i++ ) {
            int smallest = Main.smallestIndexFrom(table, i);
            Main.change(table, smallest, i);
            System.out.println(Arrays.toString(table));
        }
    }
}

