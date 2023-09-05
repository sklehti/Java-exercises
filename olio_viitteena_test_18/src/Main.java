public class Main {
    public static void main(String[] args) {
        Pet hulda = new Pet("Hulda", "sekarotuinen koira");
        Person leevi = new Person("Leevi", hulda);

        System.out.println(leevi);
    }
}