import java.util.ArrayList;
import java.util.HashMap;

public class Cellar {
   private HashMap<String, ArrayList<String>> hashMap;

   public Cellar() {
       this.hashMap = new HashMap<>();
   }

   public void add (String cellar, String goods) {
       this.hashMap.putIfAbsent(cellar, new ArrayList<>());

       ArrayList<String> goodsList = this.hashMap.get(cellar);
       goodsList.add(goods);
   }

   public ArrayList<String> content (String cellar) {
       if (this.hashMap.get(cellar) != null) {
           return this.hashMap.get(cellar);
       }

       return new ArrayList<>();
   }

   public void remove (String cellar, String goods) {
       if (this.hashMap.get(cellar) != null) {
           this.hashMap.get(cellar).remove(goods);
       }

       if (this.hashMap.get(cellar).size() == 0) {
           this.hashMap.remove(cellar);
       }
   }

   public ArrayList<String> cellars () {
       ArrayList<String> allCellars = new ArrayList<>();

       for (String cellar: this.hashMap.keySet()) {
           allCellars.add(cellar);
       }
       return allCellars;
   }

}
