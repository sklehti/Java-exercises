package lottery;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;


    public LotteryNumbers () {
        this.drawNumbers();
    }

    public ArrayList<Integer> getNumbers () {
        return this.numbers;
    }

    public boolean containsNumber (int number) {

        for (int n: this.numbers) {
            if (this.numbers.contains(number)) {
                return true;
            }
        }


        return false;
    }

    public void drawNumbers () {
        Random random = new Random();
        this.numbers = new ArrayList<>();

        while (this.numbers.size() < 7) {
            int randomNumber = random.nextInt(41) + 1;
            if (!this.containsNumber(randomNumber)) {
                this.numbers.add(randomNumber);
            }

        }
    }

    @Override
    public boolean equals(Object o) {
       return  false;
    }


}
