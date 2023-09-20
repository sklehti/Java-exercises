import java.util.ArrayList;

public class AllGrades {
    private ArrayList<Integer> allGrades;
    private int acceptanceStudent;

    public AllGrades () {
        this.allGrades = new ArrayList<>();
        this.acceptanceStudent = 0;
    }

    public int size () {
        return this.allGrades.size();
    }

    public void add (int number) {
        this.allGrades.add(number);
    }

    public int sum () {
        int sum = 0;

        for (int n: this.allGrades) {
            sum += n;
        }
        return sum;
    }

    public String average () {
        if (this.allGrades.size() > 0) {
            return 1.0 * this.sum() / this.allGrades.size() + "";
        } else {
            return "-";
        }

    }

    public ArrayList<Integer> getAllGrades() {
        return allGrades;
    }
}
