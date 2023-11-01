public class Student extends Person {
    private int credits;
    public Student (String n, String a) {
        super(n, a);
        this.credits = 0;
    }

    public void studing () {
        this.credits += 1;

    }

    public String credits () {
        return "opintopisteitä " + this.credits;
    }

    public String toString () {
        return super.toString() + "\n   " + this.credits();
    }
}
