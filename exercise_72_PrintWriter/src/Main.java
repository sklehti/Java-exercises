import dictionary.MemoryDictionary;

public class Main {
    public static void main(String[] args) {
        /*
        MemoryDictionary dictionary = new MemoryDictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("ohjelmointi", "programming");
        dictionary.remove("apina");
        dictionary.remove("banana");

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("monkey"));
        System.out.println(dictionary.translate("banana"));
        System.out.println(dictionary.translate("banaani"));
        System.out.println(dictionary.translate("ohjelmointi"));

        System.out.println();
        System.out.println();

        MemoryDictionary dictionary2 = new MemoryDictionary("words.txt");
        boolean successed = dictionary2.downloadFile();

        if (successed) {
            System.out.println("sanakirjan lataaminen onnistui");
        }

        System.out.println(dictionary2.translate("apina"));
        System.out.println(dictionary2.translate("ohjelmointi"));
        System.out.println(dictionary2.translate("alla oleva"));
        */

        MemoryDictionary dictionary3 = new MemoryDictionary("words.txt");
        dictionary3.downloadFile();

        // Note! you can add new words to the dictionary
        dictionary3.add("computer", "tietokone");


        dictionary3.save();


    }
}