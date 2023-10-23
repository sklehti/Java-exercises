import java.util.Objects;

public class RegistrationNumber {
    private final String regNo;
    private final String country;

    public RegistrationNumber(String c, String r) {
        this.regNo = r;
        this.country = c;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getCountry() {
        return country;
    }

    public String toString () {
        return this.country + " " + this.regNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RegistrationNumber)) {
            return false;
        }
        RegistrationNumber that = (RegistrationNumber) o;

        if (this.regNo.equals(that.regNo) && this.country.equals(that.country)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNo, country);
    }
}
