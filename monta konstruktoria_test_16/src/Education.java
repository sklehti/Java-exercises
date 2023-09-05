public class Education {
    private int quality;

    public int weighIn (Person person) {
        this.quality++;
        return person.getPaino();
    }

    public void enterWeight (Person person) {
        person.lisaaPainoa();
    }

    public int weighing () {
        return this.quality;
    }
}
