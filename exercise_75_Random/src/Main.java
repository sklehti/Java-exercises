

import lottery.LotteryNumbers;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LotteryNumbers row = new LotteryNumbers();
        ArrayList<Integer> lotteryNumbers = row.getNumbers();

        System.out.println("lottonumerot:");
        for (int number: lotteryNumbers) {
            System.out.print(number + " ");
        }

        System.out.println("");
    }
}