package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String strRepr = "" + t;

        int digitsSum = 0;
        for (int i = 0; i < strRepr.length(); i ++) {
            digitsSum += Integer.parseInt(strRepr.charAt(i) + ""); 
        }

        System.out.println(digitsSum);
    }
}
