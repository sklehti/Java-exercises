import allClasses.MagicSquery;
import allClasses.MagicSqueryFactory;

public class Main {
    public static void main(String[] args) {
        MagicSquery magicSquery = new MagicSquery();

        int [][] matrix = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 2},

        };
        magicSquery.addValues(matrix);
        System.out.println(magicSquery.rowsSum().toString());

        System.out.println(magicSquery.diagonalSums().toString());

        System.out.println();
        System.out.println();

        MagicSqueryFactory factory = new MagicSqueryFactory();
        int table1[][] = factory.createMagicSquery(3);
        int table2[][] = factory.createMagicSquery(5);

        System.out.println(tableAsAString(table1));

        System.out.println();
        System.out.println();

        System.out.println(tableAsAString(table2));

    }

    public static String tableAsAString (int[][] table ) {
        StringBuilder returnValues = new StringBuilder();

        for (int row = 0; row < table.length; row++) {

            for (int column = 0; column < table[row].length; column++) {
                returnValues.append(table[row][column]+ " ");
            }
           returnValues.append("\n");
        }

        return returnValues.toString();
    }
}