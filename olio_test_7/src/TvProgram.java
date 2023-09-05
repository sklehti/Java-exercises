public class TvProgram {
    private String name;
    private int length;

    public TvProgram(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getLength() {

        return this.length;
    }

    public void setLength(int length) {

        this.length = length;
    }

    public String toString() {
        return this.name + ", " + this.length + " minuuttia";
    }
}
