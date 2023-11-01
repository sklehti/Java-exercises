public class ProductWarehouse extends Warehouse {
    private String productName;

    public ProductWarehouse(String name, double balance) {
        super(balance);

        this.productName = name;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName (String newName) {
        this.productName = newName;
    }

    public String toString () {
        return this.productName + ": " + super.toString();
    }
}
