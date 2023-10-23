import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> keyValuePairs;

    public Abbreviations () {
        this.keyValuePairs = new HashMap<>();
    }

    public void addAbbreviation ( String k, String v) {
        String keyValue = trimKeyValue(k);

        if (!isThereAbbreviantion(keyValue)) {
            this.keyValuePairs.put(k, v);
        } else {
            System.out.println("Lyhenne löytyy jo listasta.");
        }

    }

    public String getAbbreviation (String value) {
        if (isThereAbbreviantion(value)) {
            return this.keyValuePairs.get(value);
        } else {
            return "";
        }
    }

    public boolean isThereAbbreviantion (String value) {
        if (this.keyValuePairs.containsKey(value)) {
            return true;
        }
        return  false;
    }

    public static String trimKeyValue (String value) {
        if (value == null) {
            return "";
        }

        return value.toLowerCase().trim();
    }

}
