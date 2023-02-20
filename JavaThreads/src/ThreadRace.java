import java.util.ArrayList;

public class ThreadRace implements Runnable {
    private int number = 1;
    private final Object lock = new Object();
    private ArrayList<Integer> numbers1 = new ArrayList<>();
    private ArrayList<Integer> numbers2 = new ArrayList<>();
    private ArrayList<Integer> numbers3 = new ArrayList<>();
    private ArrayList<Integer> numbers4 = new ArrayList<>();
    private ArrayList<Integer> evenNumbers = new ArrayList<>();
    private ArrayList<Integer> oddNumbers = new ArrayList<>();
    private int totalNumbers;

    public ThreadRace(int totalNumbers) {
        this.totalNumbers = totalNumbers;
    }

    public int getTotalNumbers() {
        return totalNumbers;
    }

    public void setTotalNumbers(int totalNumbers) {
        this.totalNumbers = totalNumbers;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Object getLock() {
        return lock;
    }

    public ArrayList<Integer> getNumbers1() {
        return numbers1;
    }

    public void setNumbers1(ArrayList<Integer> numbers1) {
        this.numbers1 = numbers1;
    }

    public ArrayList<Integer> getNumbers2() {
        return numbers2;
    }

    public void setNumbers2(ArrayList<Integer> numbers2) {
        this.numbers2 = numbers2;
    }

    public ArrayList<Integer> getNumbers3() {
        return numbers3;
    }

    public void setNumbers3(ArrayList<Integer> numbers3) {
        this.numbers3 = numbers3;
    }

    public ArrayList<Integer> getNumbers4() {
        return numbers4;
    }

    public void setNumbers4(ArrayList<Integer> numbers4) {
        this.numbers4 = numbers4;
    }

    public ArrayList<Integer> getEvenNumbers() {
        return evenNumbers;
    }

    public void setEvenNumbers(ArrayList<Integer> evenNumbers) {
        this.evenNumbers = evenNumbers;
    }

    public ArrayList<Integer> getOddNumbers() {
        return oddNumbers;
    }

    public void setOddNumbers(ArrayList<Integer> oddNumbers) {
        this.oddNumbers = oddNumbers;
    }

    @Override
    public void run() {
        int i = getTotalNumbers() / 4;
        synchronized (lock) {
            if (this.number <= i) {
                numbers1.add(this.number);
                System.out.println(this.number + " added to numbers1");
            } else if (this.number > i && this.number <= i * 2) {
                numbers2.add(this.number);
                System.out.println(this.number + " added to numbers2");
            } else if (this.number > i * 2 && this.number <= i * 3) {
                numbers3.add(this.number);
                System.out.println(this.number + " added to numbers3");
            } else if (this.number > i * 3 && this.number <= i * 4) {
                numbers4.add(this.number);
                System.out.println(this.number + " added to numbers4");
            }
            if (this.number % 2 == 0) {
                evenNumbers.add(this.number);
                System.out.println(this.number + " added to evenNumbers");
            } else {
                oddNumbers.add(this.number);
                System.out.println(this.number + " added to oddNumbers");
            }

            this.number++;
        }
    }
}
