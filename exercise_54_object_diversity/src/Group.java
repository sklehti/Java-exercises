import java.util.ArrayList;

public class Group implements Transferred {
    private ArrayList<Transferred> list;

    public Group () {
        this.list = new ArrayList<>();
    }
    @Override
    public void move(int dx, int dy) {
        for (Transferred o: this.list) {
            o.move(dx, dy);
        }
    }

    public void addToGruop (Organism transferred) {
        this.list.add(transferred);
    }

    public String toString () {
        String returnString = "";
        for (Transferred o: this.list) {
            returnString += o.toString() + "\n";
        }
        return returnString;
    }
}
