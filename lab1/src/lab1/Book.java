package lab1;

public class Book {
    private int pages;
    private String name;
    public Book(String c) {
        pages = 1;
        name = c;
    }
    public Book(int r) {
        pages = r;
        name = "red";
    }
    public Book(int r, String c) {
        pages = r;
        name = c;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  "pages=" + pages + ", name=" + name;
    }
}
