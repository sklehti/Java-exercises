public class Calculator {
    private int value;

    public Calculator(int startValue) {
        this.value = startValue;
    }

    public Calculator() {
        this(0);
    }

    public int value() {
        return this.value;
    }

    public void addValue() {
        this.addValue(1);

    }

    public void addValue(int add) {
        this.value  += add;
    }

    public void reduceValue () {
        this.reduceValue(1);

    }

    public void reduceValue (int reduceValue) {
        this.value  -= reduceValue;
    }
}
