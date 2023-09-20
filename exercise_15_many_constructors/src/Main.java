public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(4);

        System.out.println(calculator.value());

        calculator = null;

        calculator.reduceValue();
    }
}