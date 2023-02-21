package BookList;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("The Hobbit", 295, "J.R.R. Tolkien", "1937"));
        books.add(new Book("The Lord of the Rings", 1216, "J.R.R. Tolkien", "1954-1955"));
        books.add(new Book("The Silmarillion", 429, "J.R.R. Tolkien", "1977"));
        books.add(new Book("The Children of Húrin", 352, "J.R.R. Tolkien", "2007"));
        books.add(new Book("Watership Down", 310, "Richard Adams", "1972"));
        books.add(new Book("The Chronicles of Narnia", 778, "C.S. Lewis", "1950-1956"));
        books.add(new Book("The Lion, the Witch and the Wardrobe", 208, "C.S. Lewis", "1950"));
        books.add(new Book("The Magician's Nephew", 208, "C.S. Lewis", "1955"));
        books.add(new Book("Ender's Game", 324, "Orson Scott Card", "1985"));
        books.add(new Book("The Hitchhiker's Guide to the Galaxy", 215, "Douglas Adams", "1979"));

        Map<String, String> bookMap = books.stream().collect(Collectors.toMap(Book::getTitle, Book::getAuthor));
        bookMap.forEach((k, v) -> System.out.println(k + " by " + v));

        System.out.println("Books more than 400 pages:");
        books.forEach(book -> {
            if (book.getPages() > 400) {
                System.out.println(book.getTitle() + " " + book.getPages());
            }
        });

        System.out.println("Books more than 400 pages using stream:");
        books.stream().filter(book -> book.getPages() > 400).forEach(book -> System.out.println(book.getTitle() + " " + book.getPages()));


    }
}
