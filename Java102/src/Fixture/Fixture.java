package Fixture;

import java.util.*;

public class Fixture {
    public void run() {
        LinkedList<String> teams = new LinkedList<>();

//        teams.add("Fenerbahçe");
//        teams.add("Galatasaray");
//        teams.add("Beşiktaş");
//        teams.add("Başakşehir");
//        teams.add("Bursaspor");
//        teams.add("Trabzonspor");
//        teams.add("Antalyaspor");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter team count: ");
        int teamCount = scanner.nextInt();
        while (teamCount-- != 0) {
            System.out.print("Enter team name: ");
            teams.add(scanner.next());
        }

        if (teams.size() % 2 == 1) {
            teams.add("Bay");
        }

        int rounds = teams.size() - 1;
        int matchesPerRound = teams.size() / 2;
        LinkedList<String> homeT = new LinkedList<>();
        LinkedList<String> awayT = new LinkedList<>();

        for (int i = 0; i < rounds; i++) {
            for (int j = 0; j < matchesPerRound; j++) {
                int home = j;
                int away = teams.size() - 1 - j;
                homeT.add(teams.get(home));
                awayT.add(teams.get(away));
            }
            teams.add(1, teams.removeLast());
        }

        int week = 1;
        for (int i = 0; i < homeT.size(); i++) {
            if (i % matchesPerRound == 0)
                System.out.println("\n## Week " + week++);
            System.out.println(homeT.get(i) + " vs " + awayT.get(i));
        }
        for (int i = 0; i < awayT.size(); i++) {
            if (i % matchesPerRound == 0)
                System.out.println("\n## Week " + week++);
            System.out.println(awayT.get(i) + " vs " + homeT.get(i));
        }

    }


    public static void main(String[] args) {
        Fixture f = new Fixture();
        f.run();
    }
}
