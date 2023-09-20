public class Main {
    public static void main(String[] args) {
        Group j = new Group("hahmot");
        System.out.println("Pisin: " + j.longest());

        j.add("magneto");
        j.add("mystique");
        j.add("phoenix");

        System.out.println("Pisin: " + j.longest());

    }
}