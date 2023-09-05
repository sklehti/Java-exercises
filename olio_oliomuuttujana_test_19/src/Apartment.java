public class Apartment {
    private int rooms;
    private int squeres;
    private int squerePrice;

    public Apartment (int rooms, int squeres, int squrePrice) {
        this.rooms = rooms;
        this.squeres = squeres;
        this.squerePrice = squrePrice;
    }

    public int getSqueres () {
        return this.squeres;
    }

    public int getSquerePrice () {
        return this.squerePrice;
    }


    public boolean bigger (Apartment comparableApartment) {
        if (this.getSqueres() > comparableApartment.getSqueres()) {
            return true;
        }
        return false;
    }

    public int getApartmentPrice (Apartment apartment) {
        return apartment.getSquerePrice() * apartment.getSqueres();
    }

    public int priceDifference (Apartment comparableApartment) {
        int firstPrice = getApartmentPrice(this);
        int secondPrice = getApartmentPrice(comparableApartment);

        return   Math.abs((firstPrice - secondPrice));
    }

    public boolean moreExpensive (Apartment comparableApartment) {
        if (getApartmentPrice(this) > getApartmentPrice(comparableApartment)) {
            return  true;
        }
        return  false;

    }
}
