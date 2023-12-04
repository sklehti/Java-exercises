import java.util.Comparator;

public class Card implements Comparable<Card> {
    private int value;
    private Country country;

    public  Card (int v, Country c) {
        this.value = v;
        this.country = c;
    }

    public int getValue() {
        return this.value;
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
        if (this.value == 11) return this.country + " J";
        if (this.value == 12) return this.country + " Q";
        if (this.value == 13) return this.country + " K";
        if (this.value == 14) return this.country + " A";

        return this.country + " " + this.getValue();
    }

    @Override
    public int compareTo(Card o) {
        return Comparator.comparing(Card::getValue)
                .thenComparing(Card::getCountry)
                .compare(this, o);
    }


}
