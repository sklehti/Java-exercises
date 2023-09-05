public class PaymentCard {
    private double balance;

    public PaymentCard (double b) {
        this.balance = b;
    }

    public double getBalance () {
        return  this.balance;
    }

    public void addMoney (double money) {
        this.balance += money;
    }

    public boolean takeMoney (double money) {

        if (this.balance >= money) {
            this.balance -= money;

            return  true;
        }
        return false;

    }


}
