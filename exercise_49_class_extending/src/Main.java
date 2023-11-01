public class Main {
    public static void main(String[] args) {
        RememberingProductWarehouse juice = new RememberingProductWarehouse("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        juice.addToWarehouse(1.0);

        juice.printAnalysis();
    }
}