import java.util.ArrayList;

public class AllBirds {
    private ArrayList<Bird> birds;

    public AllBirds() {
        this.birds = new ArrayList<>();
    }

    // lisää
    public void add (Bird b) {
        this.birds.add(b);
    }

    // tilasto
    public void printBirds () {
        for (Bird b: this.birds) {
            System.out.println(b);
        }
    }

    // näytä
    public void findBird (String n) {
        for (Bird b: this.birds) {
            if (b.getName().equals(n)) {
                System.out.println(b);
                break;
            }
        }
    }

    // havainto
    public void setBirdAmount (String n) {
        for (Bird b: this.birds) {
            if (b.getName().equals(n)) {
               b.setAmount();
                return;
            }
        }
        System.out.println("Ei ole lintu!");
    }

}
