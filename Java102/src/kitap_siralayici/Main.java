package kitap_siralayici;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> b = new TreeSet<>();
        b.add(new Book("King Without A Goal", 555, "John", "21.02.2010"));
        b.add(new Book("Friend Of The Ocean", 166, "Eliot", "11.02.2015"));
        b.add(new Book("Agents Of Desire", 220, "Sarah", "17.03.1993"));
        b.add(new Book("Rebels Of The Light", 11, "Bill", "21.11.2005"));
        b.add(new Book("Revenge Of The Land", 210, "Mark", "05.09.2022"));

        for (Book o : b) {
            System.out.println(o.getName());
        }

        System.out.println("****");
        TreeSet<Book> b2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPage() - o2.getPage();
            }
        });

        b2.addAll(b);
        for (Book o : b2) {
            System.out.println(o.getName());
        }
    }
}
