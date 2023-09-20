public class ReadingSpace {
    private int quantity;
    private int sum;

    public ReadingSpace() {
        this.quantity = 0;
        this.sum = 0;
    }

    public void addNumber (int number) {
        this.sum += number;
        this.quantity ++;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public int getSum() {
        return this.sum;
    }

    public double average () {

        if (this.sum > 0 && this.quantity > 0) {
            double avg = 1.0 * this.sum / this.quantity;
            return avg;
        } else {
            return 0;
        }
    }
}
