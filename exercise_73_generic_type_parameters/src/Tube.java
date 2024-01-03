import java.util.ArrayList;
import java.util.List;

public class Tube<T> {

    private List<T> tube;

    public Tube () {
        this.tube = new ArrayList<>();
    }

    public void addTube (T value) {
        this.tube.add(value);
    }

    public T takeFromTube () {
        if (this.tube.isEmpty()) {
            return null;
        }
        return  this.tube.removeFirst();
    }

    public boolean hasInTube () {
        if (this.tube.isEmpty()) {
            return false;
        }

        return true;
    }
}
