// https://www.codewars.com/kata/578553c3a1b8d5c40300037c/train/java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OnesAndZeros {
    public static void main(String[] args) {
        System.out.println(mySolution(new ArrayList<>(Arrays.asList(1,1,1,1))));
        System.out.println(otherSolution(new ArrayList<>(Arrays.asList(1,1,1,1))));
    }

    public static int mySolution(List<Integer> binary) {
        String binaryStr = "";
        for (int digit : binary) {
            binaryStr += Integer.toString(digit);
        }
        return Integer.parseInt(binaryStr, 2);
    }
    public static int otherSolution(List<Integer> binary) {
        return binary.stream().reduce((x, y) -> x * 2 + y).get();
    }
}
