package allClasses;

public class MagicSqueryFactory {
    public MagicSqueryFactory () {

    }

    public int[][] createMagicSquery (int p) {
        System.out.println(p * p);
        int table [][] = new int[p][p];
        int valuesAmount = p * p;
        int i = 1;

        int row = 0;
        int column = (int) Math.floor(p / 2.0);
        System.out.println(column + " ja " + p);

         while (i <= valuesAmount) {

            if (table[row][column] == 0) {
                table[row][column] = i;
                i++;

                row = row - 1;
                column = column + 1;
            }

            if (row < 0 && column < p) {
                row = p - 1;
            }

            else if (row >= 0 && column == p) {
                column = 0;
            }

            else if ((row >= 0 && column < p &&  table[row][column] > 0) ||row < 0 && column == p) {
                row = row + 2;
                column = column - 1;
            }

        }
        return table;
    }

}
