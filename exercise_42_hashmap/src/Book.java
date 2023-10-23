import java.util.Objects;

public class Book {
    private String title;
    private int year;
    private String content;

    public Book (String t, int y, String c) {
        this.title = t;
        this.year = y;
        this.content = c;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Nimi: " + this.title  + " (" + this.year + ")" + "\nSisältö: " + this.content;
    }
}
