public class Book {
    private String name;
    private int year;
    private int pages;
    private String author;

    public Book (String n, int y, int p, String a) {
        this.name = n;
        this.year = y;
        this.pages = p;
        this.author = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString () {
        return "nimi: " + this.name + ", vuosi: " + this.year + ", sivumäärä: " + this.pages + ", kirjoittaja: " + this.author;
    }
}
