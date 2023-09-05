public class Account {
    private String account;
    private double money;

    public Account(String a, double m) {
        this.account = a;
        this.money = m;
    }

    public String getAccount() {
        return account;
    }

    public double getMoney() {
        return  money;
    }

    public void otto(double quantity) {
         this.money -= quantity;
    }

    public void pano(double quantity) {
        this.money += quantity;
    }

    public String toString() {
        return getAccount() + " " + getMoney();
    }








}
