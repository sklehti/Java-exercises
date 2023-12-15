import application.AverageSensor;
import application.Sensor;
import application.StandardSensor;
import application.Termometer;

class Main {
    public static void main(String[] args) {
        Sensor kumpula1 = new Termometer();
        kumpula1.on();
        System.out.println("lämpötila Kumpulassa " + kumpula1.measure() + " astetta");

        Sensor kaisaniemi1 = new Termometer();
        Sensor helsinkiVantaa1 = new Termometer();

        AverageSensor capital1 = new AverageSensor();
        capital1.addSensor(kumpula1);
        capital1.addSensor(kaisaniemi1);
        capital1.addSensor(helsinkiVantaa1);

        capital1.on();
        System.out.println("lämpötila Pääkaupunkiseudulla " + capital1.measure() + " astetta");

        System.out.println();
        System.out.println();
        System.out.println();

        Sensor kumpula = new Termometer();
        Sensor kaisaniemi = new Termometer();
        Sensor helsinkiVantaa = new Termometer();

        AverageSensor capital = new AverageSensor();
        capital.addSensor(kumpula);
        capital.addSensor(kaisaniemi);
        capital.addSensor(helsinkiVantaa);

        capital.on();
        System.out.println("lämpötila Pääkaupunkiseudulla " + capital.measure() + " astetta");

        System.out.println("mittaukset: " + capital.measures());

    }
}
