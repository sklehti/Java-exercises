import java.util.Collections;
import java.util.Comparator;

public class SameCountriesRanked implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) {
        int countryOrder = o1.getCountry() - o2.getCountry();

        if (countryOrder == 0) {
            return o1.getValue() - o2.getValue();
        }

        return countryOrder;
    }
}
