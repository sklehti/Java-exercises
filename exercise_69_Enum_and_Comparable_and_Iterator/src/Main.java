import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
      Card first = new Card(2, Country.RUUTU);
      Card second = new Card(14, Country.PATA);
      Card third = new Card(12, Country.HERTTA);
      Card secondDublicate = new Card(14, Country.PATA);


      System.out.println(first);
      System.out.println(second);
      System.out.println(third);

      System.out.println();

      System.out.println(first.compareTo(second)); // -1
      System.out.println(second.compareTo(third)); // 1
      System.out.println(second.compareTo(secondDublicate)); // 0

      System.out.println();

      Hand hand = new Hand();

      hand.add(new Card(2, Country.RUUTU));
      hand.add(new Card(14, Country.PATA));
      hand.add(new Card(12, Country.HERTTA));
      hand.add(new Card(2, Country.PATA));

      hand.print();

      System.out.println();

      hand.order();
      hand.print();

      System.out.println();

      Hand hand2 = new Hand();

      hand2.add(new Card(11, Country.RUUTU));
      hand2.add(new Card(11, Country.PATA));
      hand2.add(new Card(11, Country.HERTTA));

      int comparable = hand.compareTo(hand2);

      if (comparable < 0) {
        System.out.println("arvokkaampi käsi sisältää kortit");
        hand2.print();
      } else if (comparable > 0){
        System.out.println("arvokkaampi käsi sisältää kortit");
        hand.print();
      } else {
        System.out.println("kädet yhtä arvokkaat");
      }

      System.out.println();
      System.out.println();

      Hand cards = new Hand();

      cards.add(new Card(12, Country.HERTTA));
      cards.add(new Card(4, Country.PATA));
      cards.add(new Card(2, Country.RUUTU));
      cards.add(new Card(14, Country.PATA));
      cards.add(new Card(7, Country.HERTTA));
      cards.add(new Card(2, Country.PATA));

      cards.orderByCountry();
      cards.print();

    }
}