import java.util.HashMap;

public class Debenture {
    private HashMap <String, Double> debenture;

    public Debenture () {
        this.debenture = new HashMap<>();
    }

    public void setLoan (String name, double loanAmount) {
        this.debenture.put(name, loanAmount);
    }

    public double loanAmount (String person) {
        return this.debenture.getOrDefault(person, 0.0);
    }

}
