public class Money {

    private final int euro;
    private final int cent;

    public Money (int euro, int cent) {
        this.euro = euro;
        this.cent = cent;
    }

    public int getEuro() {
        return euro;
    }

    public int getCent() {
        return cent;
    }

    public Money plus (Money added) {
        Money newMoney = new Money(this.euro + added.euro, this.cent + added.cent);

        if (newMoney.cent > 100) {
            int newCent = 100 - added.cent;
            return new Money(newMoney.euro + 1, newCent);
        }

        return newMoney;
    }

    public Boolean decleare (Money comparable) {
        if (this.getEuro() < comparable.getEuro()) {
            return true;
        }

        if (this.getEuro() == comparable.getEuro() && this.getCent() < comparable.getCent()) {
            return  true;
        }
        return  false;
    }

    public Money minus (Money reduction) {
        if (this.decleare(reduction) == false) {
            Money newMoney = new Money(this.euro - reduction.euro, this.cent - reduction.cent);
            if (newMoney.cent < 0) {
                int newCent =  100 - reduction.cent;

                return new Money(newMoney.euro - 1, newCent);
            }
            return newMoney;
        }
        return new Money(0,0);

    }

    public String toString () {
        String zero = "";

        if ( cent < 10) {
            zero = "0";
        }
        return  euro + "." + zero + cent + "e";
    }
}
