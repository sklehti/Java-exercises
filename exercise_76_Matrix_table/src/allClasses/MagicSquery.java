package allClasses;

import java.util.ArrayList;

public class MagicSquery {
    private int [][] table;

    public MagicSquery () {
        this.table = new int[3][3];
    }

    public void addValues (int[][]t) {
       try {
           this.table = t;
       } catch (Exception e) {
           System.out.println(e);
       }

    }

    public ArrayList<Integer> rowsSum () {
        ArrayList<Integer> tempList = new ArrayList<>();

        for (int row = 0; row < table.length; row++) {
            int tempValues = 0;

            for (int column = 0; column < table[row].length; column++) {
                tempValues += table[row][column];
            }
            tempList.add(tempValues);
        }
        return tempList;
    }

    public ArrayList<Integer> diagonalSums () {
        ArrayList<Integer> tempList = new ArrayList<>();
        int tempValues1 = 0;
        int tempValues2 = 0;

        for (int row = 0; row < table.length; row++) {

            for (int column = 0; column < table[row].length; column++) {
                if (row == column) {
                    tempValues1 += table[row][column];
                }

                if ((row + column) == table.length - 1) {
                    tempValues2 += table[row][column];
                }

            }

        }
        tempList.add(tempValues1);
        tempList.add(tempValues2);

        return tempList;
    }
}
