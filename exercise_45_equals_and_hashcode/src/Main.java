import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        RegistrationNumber reg1 = new RegistrationNumber("FI", "ABC-123");
        RegistrationNumber reg2 = new RegistrationNumber("FI", "UXE-465");
        RegistrationNumber reg3 = new RegistrationNumber("D", "B WQ-431");

        ArrayList<RegistrationNumber> finish = new ArrayList<>();
        finish.add(reg1);
        finish.add(reg2);

        RegistrationNumber newNo = new RegistrationNumber("FI", "ABC-123");

        if (!finish.contains(newNo)) {
            finish.add(newNo);
        }

        System.out.println("suomalaiset: " + finish);
        // jos equals-metodia ei ole ylikirjoitettu, menee sama rekisterinumero toistamiseen listalle



        VehicleRegister owners = new VehicleRegister();
        owners.add(reg1, "Arto");
        owners.add(reg2, "Arto");
        owners.add(reg3, "Jurgen");

        System.out.println("omistajat:");
        System.out.println(owners.get(new RegistrationNumber("FI", "ABC-123")));
        System.out.println(owners.get(new RegistrationNumber("D", "B WQ-431")));
        // jos hashCode ei ole ylikirjoitettu, eivät omistajat löydy

        System.out.println();
        System.out.println("Rekisterinumero:");
        owners.printRegistrationNumbers();

        System.out.println();
        System.out.println("omistajat:");
        owners.printOwners();

        System.out.println();
        System.out.println(owners.remove(reg1));
        System.out.println(owners.get(new RegistrationNumber("FI", "ABC-123")));

        System.out.println();
        System.out.println("Rekisterinumero:");
        owners.printRegistrationNumbers();

        System.out.println();
        System.out.println("omistajat:");
        owners.printOwners();





    }
}