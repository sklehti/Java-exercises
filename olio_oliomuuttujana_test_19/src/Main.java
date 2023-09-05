public class Main {
    public static void main(String[] args) {

        Apartment eiraStudioApartment = new Apartment(1, 16, 5500);
        Apartment kallioOneBedroom = new Apartment(2,38,4200);
        Apartment jakomakiComio = new Apartment(3,78, 2500);

        System.out.println(eiraStudioApartment.moreExpensive(kallioOneBedroom));
        System.out.println(jakomakiComio.moreExpensive(kallioOneBedroom));
    }
}