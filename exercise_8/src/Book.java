public class Book {
    private String name;
    private int pages;
    private int published;

    public Book(String n, int p, int published) {
        this.name = n;
        this.pages = p;
        this.published = published;
    }

    public String getName() {
        return  this.name;
    }

    public int getPages () {
        return  this.pages;
    }
    public int getPublished() {
        return this.published;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String toString (){
        return getName()+ ", " + getPages() + ", " + getPublished();
    }
}
