public class NonMilitaryService implements Conscript {
    private int days;

    public NonMilitaryService () {
        this.days = 362;

    }
    @Override
    public int daysLeft() {
        return this.days;
    }

    @Override
    public void serve() {
        if (this.days > 0) {
            this.days -= 1;
        }
    }
}
