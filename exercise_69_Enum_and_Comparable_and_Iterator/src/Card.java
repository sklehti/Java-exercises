import java.util.Comparator;

public class Card implements Comparable<Card> {
    private int value;
    private Country country;

    public  Card (int v, Country c) {
        this.value = v;
        this.country = c;
    }

    public String getValue() {
        if (this.value == 11) return "J";
        if (this.value == 12) return "Q";
        if (this.value == 13) return "K";
        if (this.value == 14) return "A";


        return String.valueOf(value);
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getCountry() {
        return country.ordinal();
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String toString () {
        return this.country + " " + this.getValue();
    }

    @Override
    public int compareTo(Card o) {
        return Comparator.comparing(Card::getValue)
                .thenComparing(Card::getCountry)
                .compare(this, o);
    }
}
