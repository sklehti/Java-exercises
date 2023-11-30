/**
 * More info about regular expression: https://ohjelmointi-20.mooc.fi/osa-10/3-yleishyodyllisia-tekniikoita
 */

public class Main {
    public static void main(String[] args) {
        Checker checker = new Checker();

        System.out.println(checker.isTheDayOfTheWeek("ma"));
        System.out.println(checker.isTheDayOfTheWeek("maa"));
        System.out.println(checker.isTheDayOfTheWeek("ke"));
        System.out.println(checker.isTheDayOfTheWeek("k"));

        System.out.println();

        System.out.println(checker.allVocals("fsdjflkjfldks")); // true
        System.out.println(checker.allVocals("fsdjfl658903kjfl2dks")); // false
        System.out.println(checker.allVocals("fsdjfl??kjfl.dks")); // false

        System.out.println();

        System.out.println(checker.time("36:55:22")); // true
        System.out.println(checker.time("3655:22")); // false
        System.out.println(checker.time("36:a5:22")); // false
        System.out.println(checker.time("36:55:222")); // false
        System.out.println(checker.time("01:05:00")); // true






    }
}