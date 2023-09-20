import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RatingInterfaceClass {
    private Scanner reader;
    private AllGrades grades;
    private AllGrades passGrades;
    public RatingInterfaceClass(Scanner reader) {
        this.reader = reader;
        this.grades = new AllGrades();
        this.passGrades = new AllGrades();
    }

    public void launch () {
        System.out.println("Syötä yhteispisteet, -1 lopettaa:");

        while (true) {
           int number = Integer.valueOf(reader.nextLine());

           if (number == -1) {
               break;
           }
           this.addGradeToList(number);
        }
        this.printResults();
    }

    public void addGradeToList (int number) {
        if (number >= 0 && number <= 100) {
            this.grades.add(number);

            if (number >= 50) {
                this.passGrades.add(number);
            }
        }
    }

    public Map<Integer, Integer> gradeDistribution () {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 5; i >= 0; i--) {
            map.put(i, 0);
        }

        for (int g: this.grades.getAllGrades()) {
                if (g < 50) {
                    map.replace(0, map.get(0), map.get(0) + 1);
            }   else if (g < 60) {
                    map.replace(1, map.get(1), map.get(1) + 1);
                } else if (g < 70) {
                    map.replace(2, map.get(2), map.get(2) + 1);
            } else if (g < 80) {
                    map.replace(3, map.get(3), map.get(3) + 1);
            } else if (g < 90) {
                    map.replace(4, map.get(4), map.get(4) + 1);
            } else if (g >= 90) {
                    map.replace(5, map.get(5), map.get(5) + 1);
            }
        }
        return map;
    }

    public String printStars (int number) {
        for (int i = 0; i < number; i++) {
            return "*";
        }
    return "";
    }

    public double acceptanceRate (AllGrades allGrades, AllGrades acceptanceGrades) {
        if (allGrades.size() == 0 || acceptanceGrades.size() == 0) {
            return 0;
        }
        return (100.0 * acceptanceGrades.size()) / allGrades.size();
    }

    public void printResults () {
        System.out.println("Pisteiden keskiarvo (kaikki): " + this.grades.average());
        System.out.println("Pisteiden keskiarvo (hyväksytyt): " + this.passGrades.average());
        System.out.println("Hyväksymisprosentti: " + this.acceptanceRate(this.grades, this.passGrades));
        System.out.println("Arvosanajakauma: ");

        Map<Integer, Integer> map = this.gradeDistribution();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println( k + ": " +  this.printStars(v.intValue()));

        }

    }

}
