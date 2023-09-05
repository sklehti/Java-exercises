public class SecondWatch {
    private Wizards hundredthSecond;
    private Wizards second;

    public SecondWatch() {
        this.hundredthSecond = new Wizards(100);
        this.second = new Wizards(60);
    }

    public void valuedUpper () {
        this.hundredthSecond.moveUpper();

        if (this.hundredthSecond.getValue() == 0) {
            this.second.moveUpper();

            if (this.second.getValue() == 0) {
                this.second.setLowerLimit(1);


            }
        }


    }

    public String toString () {
        return this.second + ":" + this.hundredthSecond;
    }
}
