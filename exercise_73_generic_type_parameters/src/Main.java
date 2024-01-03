public class Main {
    public static void main(String[] args) {
        Tube<String> tube = new Tube<>();
        tube.addTube("dibi");
        tube.addTube("dab");
        tube.addTube("dab");
        tube.addTube("daa");

        while(tube.hasInTube()) {
            System.out.println(tube.takeFromTube());
        }

        System.out.println();
        System.out.println();

        Tube<Integer> tube2 = new Tube<>();
        tube2.addTube(1);
        tube2.addTube(2);
        tube2.addTube(3);

        int sum = 0;
        while(tube2.hasInTube()) {
            sum = sum + tube2.takeFromTube();
        }

        System.out.println(sum);
        System.out.println(tube2.takeFromTube());

    }
}