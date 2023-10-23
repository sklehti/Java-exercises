public class Main {
    public static void main(String[] args) {
        Debenture mattiDebenture = new Debenture();
        mattiDebenture.setLoan("Arto", 51.5);
        mattiDebenture.setLoan("Arto", 10.5);

        System.out.println(mattiDebenture.loanAmount("Arto"));
    }
}