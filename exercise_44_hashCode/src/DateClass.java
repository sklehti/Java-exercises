import java.util.Objects;

public class DateClass {
    private int day;
    private int month;
    private int year;

    public DateClass (int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals (Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof DateClass)) {
            return false;
        }

        DateClass comparableObject = (DateClass) object;

        if (this.day == comparableObject.day && this.month == comparableObject.month &&
                this.year == comparableObject.year) {
            return true;

        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
    /*
    @Override
    public int hashCode() {
        return this.day + this.month + Integer.toString(this.year).hashCode();
    }
     */
}


