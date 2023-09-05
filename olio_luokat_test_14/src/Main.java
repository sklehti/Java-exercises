public class Main {
    public static void main(String[] args) {
        Item measure = new Item("Mitta");
        Item cargo = new Item("Laasti", "remonttitavarat");
        Item ring = new Item("Rengas", 5);

        System.out.println(measure);
        System.out.println(cargo);
        System.out.println(ring);

    }
}
