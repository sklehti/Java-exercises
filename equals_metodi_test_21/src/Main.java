

public class Main {
    public static void main(String[] args) {
        DateClass d = new DateClass(24, 3, 2017);
        DateClass d2 = new DateClass(23,7,2017);

        Person leevi = new Person("Leevi", d);
        Person lilja = new Person("Lilja", d2);

        if (leevi.equals(lilja)) {
            System.out.println("Meniköhän nyt oikein");
        }

        d = new DateClass(24, 3, 2017);
        d2 = new DateClass(24,3,2017);

        leevi = new Person("Leevi", d);
        Person otherLeevi = new Person("Leevi", d2);

        if (leevi.equals(otherLeevi)) {
            System.out.println("Toimii oikein");
        }
    }
}