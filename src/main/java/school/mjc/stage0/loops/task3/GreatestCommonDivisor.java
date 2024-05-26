package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int minimal = first > second ? first : second;

        for (int i = minimal; i >= 1; i --) {
            if (first % minimal == 0 && second % minimal == 0) {
                System.out.println(minimal);
            }
        }
    }
}
