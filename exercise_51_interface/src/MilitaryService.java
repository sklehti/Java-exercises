public class MilitaryService implements Conscript {
    private int days;

    public MilitaryService (int days) {
        this.days = days;
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
