public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person (String f, String l, int b) {
        this.firstName = f;
        this.lastName = l;
        this.birthYear = b;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
