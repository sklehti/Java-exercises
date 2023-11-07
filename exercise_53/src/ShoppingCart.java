import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
   private Map<String, Shopping> shoppingCart;

   public ShoppingCart() {
       this.shoppingCart = new HashMap<>();
   }

   public void add (String product, int price) {
       if (this.shoppingCart.containsKey(product)) {
           this.shoppingCart.get(product).increaseAmounts();
       } else {
           this.shoppingCart.put(product, new Shopping(product,1, price ));
       }

   }

   public int price () {
        int wholePrice = 0;
       for (Shopping price: this.shoppingCart.values()) {
           wholePrice += price.price();
       }
       return wholePrice;

   }

   public void print() {
       for (Shopping cart: this.shoppingCart.values()) {
           System.out.println(cart);
       }

   }
}
