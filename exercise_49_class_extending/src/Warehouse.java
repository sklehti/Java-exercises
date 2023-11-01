import java.text.DecimalFormat;

public class Warehouse {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    private double volume;
    private double balance;

    public Warehouse (double v) {
        if (v > 0) {
            this.volume = v;
        }


    }

    public double getBalance () {
        return this.balance;
    }

    public double getVolume () {
        return this.volume;
    }

    public double getWholeVolume () {
        return this.volume - this.balance;
    }

    public void addToWarehouse (double amount) {
        if (amount > 0) {
            this.balance += amount;


            if (this.balance > this.volume) {
                this.balance = this.volume;
            }
        }
    }

    public double takeFromWarehouse (double amount) {
        if (amount > 0) {
            if (amount >= this.balance) {
                this.balance = 0;
                return this.balance;
            }
            this.balance -= amount;
            return amount;
        }
        return 0;
    }

    public String toString () {
        return "saldo = " + this.df.format(this.getBalance()) + " tilaa " + this.df.format(this.getWholeVolume());
    }
}
