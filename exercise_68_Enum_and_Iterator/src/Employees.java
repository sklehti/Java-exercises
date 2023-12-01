import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List<Person> list;

    public Employees () {
        this.list = new ArrayList<>();
    }

    public void add ( Person addedPerson){
        if (addedPerson != null) {
            this.list.add(addedPerson);
        }
    }

    public void add (List<Person> addedPeople) {
        this.list.addAll(addedPeople);
    }

    public void print () {
        // this.list.forEach(System.out::println);
        Iterator<Person> iterator = this.list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /**
     * go through an iteration
     * @param education selected title
     */
    public void print (Education education) {
        Iterator<Person> iterator = this.list.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                System.out.println(iterator);
            }
        }
    }

    public void getFired (Education education) {
        Iterator<Person> iterator = this.list.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
