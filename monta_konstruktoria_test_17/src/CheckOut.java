public class CheckOut {
    private double money;
    private int lowCost;
    private  int tasty;

    public CheckOut() {
        this.money = 1000;
    }

    public double cheapFood (double money) {
        if (money >= 2.5) {
            this.lowCost++;
            this.money += 2.5;

            return money - 2.5;
        }
        return money;
    }



    public double tastyFood (double money) {
        if (money >= 4.3) {
            this.tasty++;
            this.money += 4.3;

            return money - 4.3;
        }
        return money;
    }

    public boolean cheapFood (PaymentCard card) {
        if (card.getBalance() >= 2.5) {
            this.lowCost++;
            card.takeMoney(2.5);

            return true;
        }
        return false;
    }

    public boolean tastyFood (PaymentCard card) {
        if (card.getBalance() >= 4.3) {
            this.tasty++;
            card.takeMoney(4.3);

            return true;
        }
        return false;
    }

    public void loadMoneyToCard(PaymentCard card, double sum) {
        card.addMoney(sum);
        this.money += sum;
    }

    public String toString () {
        return "kassassa rahaa " + money + " edullisia lounaita myyty " + lowCost + " maukkaita lounaita myyty " + tasty;
    }

}
