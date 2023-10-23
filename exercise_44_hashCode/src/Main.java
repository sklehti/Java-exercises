import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        DateClass p = new DateClass(1, 2, 2000);
        System.out.println(p.equals("heh"));
        System.out.println(p.equals(new DateClass(5, 2, 2000)));
        System.out.println(p.equals(new DateClass(1, 2, 2000)));

        ArrayList<DateClass> list = new ArrayList<>();

        for (int y = 1900; y < 2100; y++ ) {
            for (int m = 1; m <= 12; m++) {
                for (int d = 1; d <= 28; d++) {
                    list.add(new DateClass(d, m ,y));
                }
            }
        }

        for (DateClass day: list) {
            System.out.println(day.hashCode());
        }

    }
}