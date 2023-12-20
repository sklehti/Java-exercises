package dictionary;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MemoryDictionary {
    private Map< String ,String> dictionary;
    private String file;

    public MemoryDictionary (String file) {
         this();

        this.file = file;
    }
    public MemoryDictionary () {
        this.dictionary = new HashMap<>();
    }

    public boolean downloadFile () {
        try (Scanner reader = new Scanner(Paths.get(this.file))) {
            while (reader.hasNextLine()) {
                String[] row = reader.nextLine().split(":");

                this.add(row[0], row[1]);
            }

        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean save () {
        try {
            PrintWriter writer = new PrintWriter(this.file);

            for ( Map.Entry<String, String> entry: this.dictionary.entrySet()) {
                writer.println(entry.getKey() + ":" + entry.getValue());
            }
            writer.close();

        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public void add (String word, String translation) {
            this.dictionary.putIfAbsent(word, translation);

    }

    public String translate (String word) {
        if (this.dictionary.containsKey(word))
            return this.dictionary.get(word);
        else if (this.dictionary.containsValue(word))
            for (Map.Entry<String, String> entry: this.dictionary.entrySet()) {
                if (entry.getValue().equals(word)) {
                    return entry.getKey();
                }
            }
        return  null;
    }

    public void remove (String word) {
        if (this.dictionary.containsKey(word))
            this.dictionary.entrySet().removeIf(e -> e.getKey().equals(word));
        else if (this.dictionary.containsValue(word))
            this.dictionary.entrySet().removeIf(e -> e.getValue().equals(word));
    }

}
