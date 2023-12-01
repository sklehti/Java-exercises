import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hand {
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
}
