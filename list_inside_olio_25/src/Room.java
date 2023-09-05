import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people;

    public Room () {
        this.people = new ArrayList<>();
    }

    public void add(Person person) {
        this.people.add(person);
    }

    public boolean isEmpty () {
        if (this.people.isEmpty()) {
            return true;
        }

        return  false;
    }

    public Person shortest () {
        if (this.isEmpty()) {
            return null;
        }

        Person shortestPerson = this.people.get(0);

        for (Person p: this.getPeople()) {
            if (shortestPerson.getLength() > p.getLength()) {
                shortestPerson = p;
            }
        }
        return shortestPerson;
    }

    public Person removeShortest () {

        if (!this.isEmpty()) {


            Person shortestPerson = this.shortest();


            for (Person p : this.getPeople()) {
                if (p.equals(shortestPerson)) {
                    this.people.remove(p);
                    return shortestPerson;
                }
            }
        }
        return  null;
    }

    public ArrayList<Person> getPeople () {
        return this.people;
    }
}
