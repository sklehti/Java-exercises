public class Human implements Comparable<Human> {
    private String name;
    private int salary;

    public Human (String n, int s) {
        this.name = n;
        this.salary = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Human o) {
        return this.getSalary() - o.getSalary();
    }

    @Override
    public String toString() {
        return "Nimi: " + this.name + " palkka: " + this.salary;
    }
}
