// https://www.codewars.com/kata/585d7d5adb20cf33cb000235/train/java

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindTheUniqueNumber {
    public static void main(String[] args) {
        System.out.println(mySolution(new double[]{ 1, 1, 1, 2, 1, 1 }));
        System.out.println(otherSolution(new double[]{ 1, 1, 1, 2, 1, 1 }));
    }


    public static double mySolution(double[] arr) {
        Map<Double, Integer> freqCount = new HashMap<>();
        for (double number : arr ) {
            freqCount.merge(number, 1, Integer::sum);
        }
        return Collections.min(freqCount.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static double otherSolution(double[] arr) {
        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length-1]:arr[0];
    }
}
