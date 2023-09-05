public class MusicTrack {
    private String name;
    private String artist;
    private int length;

    public MusicTrack (String n, String a, int l) {
        this.name = n;
        this.artist = a;
        this.length = l;
    }

    public boolean equals (Object comparable) {

        if (this == comparable) {
            return true;
        }

        if (!(comparable instanceof MusicTrack)) {
            return false;
        }

        MusicTrack comparableTrack = (MusicTrack) comparable;

        if (this.name.equals(comparableTrack.name) &&
        this.artist.equals(comparableTrack.artist) &&
        this.length == comparableTrack.length
        ) {
            return true;
        }

        return  false;
    }
}
