/**
 * More info about Enum: <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">...</a>
 */

public class Main {
    public static void main(String[] args) {
        Person vilma = new Person("Vilma", Education.FT);
        System.out.println(vilma);
        System.out.println(Education.FT.getEnumNumber());
        System.out.println(Education.FilYO.getEnumNumber());
        System.out.println(Education.LuK.getTitle());

        System.out.println();

        Employees university = new Employees();
        university.add(new Person("Petrus", Education.FT));
        university.add(new Person("Arto", Education.FilYO));
        university.add(new Person("Elina", Education.FT));

        university.print();

        university.getFired(Education.FilYO);

        System.out.println("==");

        university.print();

    }
}