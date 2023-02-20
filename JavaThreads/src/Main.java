
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        int totalNumbers = 10000;
        ThreadRace threadRace = new ThreadRace(totalNumbers);
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        for (int i = 0; i < totalNumbers; i++) {
            executorService.execute(threadRace);
        }
        executorService.shutdown();

        try {
            while (!executorService.isTerminated()) {
                Thread.sleep(1000);
            }
            System.out.println("Finished all threads");
            System.out.println("Numbers 1: " + threadRace.getNumbers1().size());
            System.out.println("Numbers 2: " + threadRace.getNumbers2().size());
            System.out.println("Numbers 3: " + threadRace.getNumbers3().size());
            System.out.println("Numbers 4: " + threadRace.getNumbers4().size());
            System.out.println("Even numbers: " + threadRace.getEvenNumbers().size());
            System.out.println("Odd numbers: " + threadRace.getOddNumbers().size());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}