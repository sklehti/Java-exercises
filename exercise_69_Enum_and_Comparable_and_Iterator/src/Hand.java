import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private List<Card> handCards;

    public Hand () {
        this.handCards = new ArrayList<>();
    }

    public void add (Card card) {
        if (card != null) {
            this.handCards.add(card);
        }
    }

    public void print () {
        Iterator<Card> iterator = this.handCards.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void order () {
        this.handCards.sort(Card::compareTo);
    }

    public List<Card> getHandCards() {
        return handCards;
    }

    public void setHandCards(List<Card> handCards) {
        this.handCards = handCards;
    }

    @Override
    public int compareTo(Hand o) {
         int values1 = this.handCards.stream().mapToInt(Card::getValue).sum();
         int values2 = o.getHandCards().stream().mapToInt(Card::getValue).sum();

         return values1 - values2;
    }

    public void orderByCountry () {
        SameCountriesRanked sameCountriesRanked = new SameCountriesRanked();
        Collections.sort(this.handCards,sameCountriesRanked);
    }
}
