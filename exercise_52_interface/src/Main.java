public class Main {
    public static void main(String[] args) {
        Box box = new Box(10);
        Box box2 = new Box(20);

        box.add(new Book("Fedor Dostojevski", "Rikos ja Rangaistus", 2));
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        box.add(new CdDisk("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CdDisk("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CdDisk("Rendezvous Park", "Closer to Being Here", 2012));

        box2.add(new CdDisk("Rendezvous Park", "Closer to Being Here", 2012));
        box2.add(new CdDisk("Rendezvous Park", "Closer to Being Here", 2012));
        box2.add(box);

        System.out.println(box);
        System.out.println(box2);


    }
}