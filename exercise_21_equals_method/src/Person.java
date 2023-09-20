public class Person {
    private String name;
    private DateClass birthDay;

    public Person (String n, DateClass b) {
        this.name = n;
        this.birthDay = b;
    }

    public boolean equals (Object comparable) {

        if (this == comparable) {
            return true;
        }

        if (!(comparable instanceof Person)) {
            return false;
        }

        Person comparablePerson = (Person) comparable;

        if (this.name.equals(comparablePerson.name) &&
            this.birthDay.equals(comparablePerson.birthDay)
        ) {
            return true;
        }

        return false;
    }
}
