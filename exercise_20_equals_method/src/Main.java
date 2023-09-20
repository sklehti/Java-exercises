public class Main {
    public static void main(String[] args) {
        MusicTrack jackSparrow = new MusicTrack("The Lonely Island", "Jack Sparrow", 196);
        MusicTrack otherSparrow = new MusicTrack("The Lonely Island", "Jack Sparrow", 196);

        if (jackSparrow.equals(otherSparrow)) {
            System.out.println("kappaleet ovat samat");
        }

        if (jackSparrow.equals("Toinen olio")) {
            System.out.println("nyt on jotain hassusti");
        }

    }
}