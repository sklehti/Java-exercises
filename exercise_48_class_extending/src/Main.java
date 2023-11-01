import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Teacher ada = new Teacher("Ada Lovelace", "Korsontie 1 03100 Vantaa", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(ada);
        System.out.println(esko);

        Student olli = new Student("Olli", "Ida Albergintie 1 00400 Helsinki");

        int i = 0;
        while (i < 25) {
            olli.studing();
            i += 1;
        }
        System.out.println(olli);

        System.out.println();
        System.out.println();
        System.out.println();

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Teacher("Ada Lovelace", "Korsontie 1 03100 Vantaa", 1200));
        persons.add(new Student("Olli", "Ida Albergintie 1 00400 Helsinki"));

        printPersons(persons);
    }

    public static void printPersons (ArrayList<Person> persons) {
        for (Person p: persons) {
            System.out.println(p);
        }
    }
}