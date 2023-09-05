public class DateClass {
    private int date;
    private int month;
    private int year;

    public DateClass(int d, int m, int y) {
        this.date = d;
        this.month = m;
        this.year = y;
    }

     public boolean equals (Object comparable) {

        if (this == comparable) {
            return  true;
        }

        if (!(comparable instanceof DateClass)) {
            return  false;
        }

        DateClass comparableDate = (DateClass) comparable;

        if (this.date == comparableDate.date &&
            this.month == comparableDate.month &&
            this.year == comparableDate.year
        ) {
            return true;
        }

        return false;
    }
}
