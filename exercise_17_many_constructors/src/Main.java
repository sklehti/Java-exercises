public class Main {
    public static void main(String[] args) {
        CheckOut unicafeExactum = new CheckOut();
        System.out.println(unicafeExactum);

        PaymentCard anttiCard = new PaymentCard(2);
        System.out.println("kortilla rahaa " + anttiCard.getBalance() + " euroa");

        boolean didItsucceed = unicafeExactum.tastyFood(anttiCard);
        System.out.println("riittikö raha: " + didItsucceed);

        unicafeExactum.loadMoneyToCard(anttiCard, 100);

        didItsucceed = unicafeExactum.tastyFood(anttiCard);
        System.out.println("riittikö raha: " + didItsucceed);

        System.out.println("kortilla rahaa " + anttiCard.getBalance() + " euroa");

        System.out.println(unicafeExactum);
    }
}