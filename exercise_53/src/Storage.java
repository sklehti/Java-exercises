import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storage {
    private Map<String , Integer> storage;
    private Map<String, Integer> storageBalance;

    public Storage () {
        this.storage = new HashMap<>();
        this.storageBalance = new HashMap<>();
    }

    public void addProduct (String product, int price, int balance) {
       this.storage.put(product, price);
       this.storageBalance.put(product, balance);
    }

    public int price (String product) {
        if (this.storage.containsKey(product)) {
            return this.storage.get(product);
        }
        return -99;
    }

    public int balance (String product) {
        if (this.storageBalance.containsKey(product)) {
            return this.storageBalance.get(product);
        }
        return 0;
    }

    public boolean get (String product) {
        if ( this.storageBalance.containsKey(product) && this.storageBalance.get(product) > 0) {
            this.storageBalance.replace(product, this.storageBalance.get(product) - 1);
            return  true;
        }
        return  false;
    }

    public Set<String> products () {
        return this.storage.keySet();
    }
}
