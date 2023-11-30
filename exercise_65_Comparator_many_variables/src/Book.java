public class Book {
    private String name;
    private int minAge;

    public Book(String n, int a) {
        this.name = n;
        this.minAge = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int age) {
        this.minAge = age;
    }

    public String toString () {
        return this.name + " (" + this.minAge + " vuotiaille ja vanhemmille)";
    }
}
