public class Main {
    public static void main(String[] args) {
        Goods book = new Goods("Aapiskukko", 2);
        Goods telephone = new Goods("Nokia 3210", 1);
        Goods brick = new Goods("tiiliskivi", 4);

        Suitcase suitcase1 = new Suitcase(10);
        suitcase1.addGoods(book);
        suitcase1.addGoods(telephone);

        Suitcase suitcase2 = new Suitcase(10);
        suitcase2.addGoods(brick);

        CargoHold cargoHold = new CargoHold(1000);
        cargoHold.addSuitcase(suitcase1);
        cargoHold.addSuitcase(suitcase2);

        System.out.println("kaikki tavarat:");
        cargoHold.printCargosHold();
    }
}