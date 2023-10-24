public class Main {
    public static void main(String[] args) {
        Cellar cellar = new Cellar();

        cellar.add("a14", "luistimet");
        cellar.add("a14", "maila");
        cellar.add("a14", "luistimet");

        cellar.add("f156", "rullaluistimet");
        cellar.add("f156", "rullaluistimet");

        cellar.add("g63", "six");
        cellar.add("g63", "pi");

        cellar.remove("f156", "rullaluistimet");

        System.out.println(cellar.content("f156"));

        cellar.remove("f156", "rullaluistimet");

        System.out.println(cellar.cellars());

    }
}