public class Person {
    private String name;
    private Education education;

    public Person (String n, Education e) {
        this.name = n;
        this.education = e;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public String toString () {
        return this.name + ", " + this.education;
    }
}
