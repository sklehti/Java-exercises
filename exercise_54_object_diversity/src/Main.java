public class Main {
    public static void main(String[] args) {
        Organism organism = new Organism(20, 30);
        System.out.println(organism);
        organism.move(-10, 5);
        System.out.println(organism);
        organism.move(50, 20);
        System.out.println(organism);

        System.out.println();
        System.out.println();

        Group group = new Group();
        group.addToGruop(new Organism(73, 56));
        group.addToGruop(new Organism(57, 66));
        group.addToGruop(new Organism(46, 52));
        group.addToGruop(new Organism(19, 107));
        System.out.println(group);
    }
}