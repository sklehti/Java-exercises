public class RememberingProductWarehouse extends ProductWarehouse {
    private ChangingHistory changingHistory;

    public RememberingProductWarehouse(String name, double balance, double initialBalance) {
        super(name, balance);

        this.changingHistory = new ChangingHistory();
        this.changingHistory.add(initialBalance);
        super.addToWarehouse(initialBalance);

    }

    public String history () {
        return this.changingHistory.toString();
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.changingHistory.add(super.getBalance());
    }

    public double takeFromWarehouse (double amount) {
        super.takeFromWarehouse(amount);
        this.changingHistory.add(super.getBalance());

        return super.getBalance();
    }

    public void printAnalysis () {
        System.out.println("Tuote: " +  super.getProductName());
        System.out.println("Historia: " + this.changingHistory.toString());
        System.out.printf("Suurin tuotemäärä: %.2f",this.changingHistory.maxValue());
        System.out.println();
        System.out.printf("Pienin tuotemäärä: %.2f",this.changingHistory.minValue());
        System.out.println();
        System.out.printf("Keskiarvo: %.2f",this.changingHistory.averageValue());

    }
}
