public class Main {
    public static void main(String[] args) {
        int []numbers = {3, -1, 8, 4};

        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));

    }

    public static int sum (int[] table, int wherefrom, int whereTo, int smallest, int biggest) {

        int sum = 0;
        if (wherefrom < 0) {
            wherefrom = 0;
        }
        if (whereTo >= table.length) {
            whereTo = table.length - 1;
        }
        for (int x = wherefrom; x < whereTo; x++) {
            if (table[x] >= smallest && table[x] <= biggest) {
                sum += table[x];
            }
        }

        return sum;
    }
}