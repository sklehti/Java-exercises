public class Main {
    public static void main(String[] args) {
        SecondWatch watch = new SecondWatch();

        while(true) {
            System.out.println(watch);
            watch.valuedUpper();

            try {
                Thread.sleep(50);
            } catch (Exception e) {
                System.out.println("virhe");
            }
        }
    }
}