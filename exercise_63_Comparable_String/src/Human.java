public class Human implements Comparable<Human> {

    private String name;

    public Human (String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString () {
        return "Nimi: " + this.name;
    }


    @Override
    public int compareTo(Human o) {
        return this.getName().compareToIgnoreCase(o.getName());
    }
}
