public class Main {
    public static void main(String[] args) {

        NonMilitaryService nonMilitaryService = new NonMilitaryService();
        Conscript militaryService = new MilitaryService(300);

        nonMilitaryService.serve();
        nonMilitaryService.serve();
        nonMilitaryService.serve();
        System.out.println(nonMilitaryService.daysLeft());

        militaryService.serve();
        militaryService.serve();
        militaryService.serve();
        System.out.println(militaryService.daysLeft());

    }
}