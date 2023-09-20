import java.util.ArrayList;

public class CargoHold {
    private int maxweght;

    private ArrayList<Suitcase>  cargos;

    public CargoHold (int w) {
        this.maxweght = w;
        this.cargos = new ArrayList<>();
    }

    public void addSuitcase (Suitcase suitcase) {

        int wholeWeight = 0;
        for (Suitcase s: this.cargos) {
            wholeWeight += s.coWeight();
        }

        if (wholeWeight + suitcase.coWeight() <= this.maxweght) {
            this.cargos.add(suitcase);
        }

    }

    public void printCargosHold () {
        for (Suitcase s: this.cargos) {
            s.printGoods();
        }
    }

    public String toString () {
        int weight = 0;
        for (Suitcase s: this.cargos) {
            weight += s.coWeight();
        }
        return this.cargos.size() + " matkalaukkua (" + weight + " kg)";
    }
}
