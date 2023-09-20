public class Bird {
    private String name;
    private String latinName;
    private int amount;

    public Bird (String n, String l) {
        this.name = n;
        this.latinName = l;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount() {
        this.amount++;
    }

    public String toString () {
        return this.name + " (" + this.latinName + "): " + this.amount + " havaintoa";
    }
}
