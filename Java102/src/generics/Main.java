package generics;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> liste = new MyList<>();
        System.out.println("Dizideki Kapasite : " + liste.getCapacity());
        System.out.println("Dizideki eleman: " + liste.size());
        System.out.println("isEmpty: " + liste.isEmpty());
        liste.add(1);
        System.out.println(liste.indexStart);
        System.out.println(liste.remove(0));
        System.out.println("isEmpty: " + liste.isEmpty());
        System.out.println(liste.toString());
        liste.add(2);
        liste.add(3);
        liste.add(4);
        liste.add(5);
        liste.add(6);
        liste.add(7);
        liste.add(8);
        System.out.println(liste.toString());
        liste.add(9);
        liste.add(10);
        liste.add(11);
        liste.add(12);
        liste.add(13);
        liste.add(14);
        liste.add(15);
        liste.add(16);
        liste.add(17);
        liste.add(18);
        liste.add(19);
        liste.add(20);
        System.out.println(liste.toString());
        liste.clear();
        System.out.println(liste.toString());
        liste.add(5);
        System.out.println(liste.toString());
//        liste.add(188);
//        System.out.println(liste.remove(15));
//
//        System.out.println("Set: " + liste.set(0, 55));
//        System.out.println("Set: " + liste.set(39, 52));
//        System.out.println("Dizideki Kapasite : " + liste.getCapacity());
//        System.out.println("Dizideki eleman: " + liste.size());
//        System.out.println(Arrays.toString(liste.getArray()));
//        System.out.println("Dizideki eleman: " + liste.size());
//
//        System.out.println("İndexteki eleman: " + liste.get(15));
//        System.out.println();
//        System.out.println(liste.toString());
//        System.out.println("Index of: " + liste.indexOf(188));
//        System.out.println("LastIndexOf: " + liste.lastIndexOf(null));
//        System.out.println(liste.indexStart);
//        liste.add(33);
//        System.out.println(liste.toString());

    }
}
