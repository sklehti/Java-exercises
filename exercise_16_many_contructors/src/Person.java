public class Person {

    private String nimi;
    private int ika;
    private int paino;
    private int pituus;


    public Person (String nimi) {
        this(nimi, 0, 0, 0);
    }

    public Person (String nimi, int ika, int pituus, int paino) {
        this.nimi = nimi;
        this.ika = ika;
        this.paino = paino;
        this.pituus = pituus;
    }

    // muita konstruktoreja ja metodeja

    public String getNimi() {
        return this.nimi;
    }

    public int getIka() {
        return this.ika;
    }

    public int getPaino() {
        return this.paino;
    }

    public int getPituus() {
        return this.pituus;
    }

    public void vanhene() {
        this.ika = this.ika + 1;
    }

    public void lisaaPainoa() {
        this.paino = this.paino + 1;

    }

    public void setPituus(int uusiPituus) {
        this.pituus = uusiPituus;
    }

    public void setPaino(int uusiPaino) {
        this.paino = uusiPaino;
    }

    public double painoindeksi() {
        double pituusPerSata = this.pituus / 100.0;
        return this.paino / (pituusPerSata * pituusPerSata);
    }

    @Override
    public String toString() {
        return this.nimi + ", ikä " + this.ika + " vuotta";
    }
}