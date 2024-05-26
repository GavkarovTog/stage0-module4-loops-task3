package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int fst = 0;
        int snd = 1;

        for (int i = 1; i <= lastFibonacci; i ++) {
            System.out.println(snd);
            int tmp = fst;
            fst = snd;
            snd = tmp + snd;
        }
    }
}
