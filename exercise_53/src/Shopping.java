public class Shopping {
    private String product;
    private int amount;
    private int unitPrice;

    public Shopping (String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public int price () {
        System.out.println(this.amount + " " + this.unitPrice);
        return this.amount * this.unitPrice;
    }



    public void increaseAmounts () {
        this.amount += 1;
    }

    public String toString () {
        return this.product + ": " + this.amount;
    }
}
