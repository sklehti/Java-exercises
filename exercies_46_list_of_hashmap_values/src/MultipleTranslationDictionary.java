import java.util.ArrayList;
import java.util.HashMap;

public class MultipleTranslationDictionary {
    private HashMap<String, ArrayList<String>> hashMap;

    public MultipleTranslationDictionary () {
        this.hashMap = new HashMap<>();
    }

    public void add (String k, String v) {
        this.hashMap.putIfAbsent(k, new ArrayList<>());

       ArrayList<String> list = this.hashMap.get(k);
       list.add(v);
    }

    public ArrayList<String> tranlate (String word) {
        if (this.hashMap.get(word) != null) {
            return this.hashMap.get(word);
        }
        return new ArrayList<>();
    }

    public void remove (String word) {
        if (this.hashMap.get(word) != null) {
            this.hashMap.remove(word);
        }
    }

}
