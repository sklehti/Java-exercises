public class CdDisk implements Storing {
    private String artist;
    private String cdName;
    private int published;


    public CdDisk (String artist, String cdName, int published) {
        this.artist = artist;
        this.cdName = cdName;
        this.published = published;


    }
    @Override
    public double weight() {
        return 0.1;
    }

    public String toString () {
        return this.artist + ": " + this.cdName + " (" + this.published + ")";
    }
}
