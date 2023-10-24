public class Main {
    public static void main(String[] args) {
        MultipleTranslationDictionary dictionary = new MultipleTranslationDictionary();

        dictionary.add("kuusi", "six");
        dictionary.add("kuusi", "spruce");

        dictionary.add("pii", "silicon");
        dictionary.add("pii", "pi");

        System.out.println(dictionary.tranlate("kuusi"));
        dictionary.remove("pii");
        System.out.println(dictionary.tranlate("pii"));

    }
}