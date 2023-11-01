public class Teacher extends Person {
    private int salary;

    public Teacher (String n, String a, int s) {
        super(n, a);
        this.salary = s;
    }

    public String toString () {
        return super.toString() + "\n   palkka " + this.salary;
    }
}
