import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegister {
    private HashMap <RegistrationNumber, String> hashMap;

    public VehicleRegister () {
        this.hashMap = new HashMap<>();
    }

    public boolean add (RegistrationNumber reg, String o) {

        if (!this.hashMap.containsKey(reg)) {
            this.hashMap.put(reg, o);
            return  true;
        }
        return  false;
    }

    public String get (RegistrationNumber reg) {
            return this.hashMap.get(reg);
    }

    public boolean remove (RegistrationNumber reg) {
        String removeInfo = this.hashMap.remove(reg);
       if (removeInfo == null) {
           return false;
       }
       return true;
    }

    public void printRegistrationNumbers () {
        for (RegistrationNumber number: this.hashMap.keySet()) {
            System.out.println(number);
        }
    }

    public void printOwners () {
        ArrayList<String> allOwners = new ArrayList<>();

        for (String o: this.hashMap.values()) {

            if (!(allOwners.contains(o))) {
                System.out.println(o);
                allOwners.add(o);
            }

        }
    }

}
