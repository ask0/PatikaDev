package BookList;


public class Book {
    private String title;
    private int pages;
    private String author;
    private String datePublished;

    public Book(String title, int pages, String author, String datePublished) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.datePublished = datePublished;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public String toString() {
        return "Title: " + title + " Pages: " + pages + " Author: " + author + " Date Published: " + datePublished;
    }




}
