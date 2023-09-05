public class Wizards {
    private int upperLimit;
    private int lowerLimit;

    public Wizards (int upperLimit) {
        this.upperLimit = upperLimit;
        this.lowerLimit = 0;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public int getLowerLimit() {
        return lowerLimit;
    }

    public int getValue() {
        return this.lowerLimit;
    }

    public void setLowerLimit(int lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public int moveUpper () {
        this.lowerLimit = this.lowerLimit + 1;

        if (this.lowerLimit >= this.upperLimit) {
            this.lowerLimit = 0;
        }
        return this.lowerLimit;
    }

    public String toString () {
        if (this.lowerLimit < 10) {
            return "0" + this.lowerLimit;
        }
        return "" + this.lowerLimit;
    }

}
