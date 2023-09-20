public class Main {
    public static void main(String[] args) {
        Education haagaHealthClinic = new Education();

        Person eero = new Person("Eero", 1,110,7);
        Person pekka = new Person("Pekka", 33,176, 85);



        haagaHealthClinic.weighIn(eero);
        haagaHealthClinic.weighIn(eero);
        haagaHealthClinic.weighIn(eero);


        System.out.println("");

        System.out.println("punnituksia tehty " + haagaHealthClinic.weighing());

        haagaHealthClinic.weighIn(eero);
        haagaHealthClinic.weighIn(eero);
        haagaHealthClinic.weighIn(eero);
        haagaHealthClinic.weighIn(eero);
        

        System.out.println("punnituksia tehty " + haagaHealthClinic.weighing());

    }
}