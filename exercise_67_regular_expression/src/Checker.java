public class Checker {


    public Checker (){

    }

    public boolean isTheDayOfTheWeek (String strg) {
        if (strg.matches(("ma|ti|ke|to|pe|la|tai|su"))) {
            return true;
        }
        return false;
    }

    public boolean allVocals (String strg) {
        if (strg.matches("[a-ö]*")) {
            return true;
        }
        return false;
    }

    public boolean time (String strg) {
        // <= 8 merkkiä ()8
        // 3:s ja 6:s = ":"
        // muut ovat numeroita [0-9]

        if (strg.matches("([0-9]{2}):[0-9]{2}:[0-9]{2}")) {
            return true;
        }
        return false;
    }
}
