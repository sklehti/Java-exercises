import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Group {
    private String name;
    ArrayList<String> group;

    public Group (String n) {
        this.name = n;
        this.group = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void  add (String n) {
        this.group.add(n);
    }
    public String longest () {
        if (this.group.isEmpty()) {
            return null;
        }

         String longest = this.group.get(0);

        for (String l: this.group) {
            if (longest.length() < l.length()) {
                longest = l;
            }
        }

        return  longest;
    }
}
