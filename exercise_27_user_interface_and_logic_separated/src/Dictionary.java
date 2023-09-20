import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private String finishWord;
    private String englishWord;
    private Map<String, String> list;



    public Dictionary () {
        this.list = new HashMap<>();
    }

    public void add (String f, String e) {
        this.list.put(f, e);
    }

    public String translateWord (String w) {

        for (Map.Entry<String, String> entry : this.list.entrySet()) {
            if (entry.getKey().equals(w)) {
                return entry.getValue();
            }

        }
        return null;
    }
}
