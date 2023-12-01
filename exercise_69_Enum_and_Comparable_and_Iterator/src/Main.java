
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

    }
}