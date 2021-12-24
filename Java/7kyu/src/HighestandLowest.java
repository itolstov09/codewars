// https://www.codewars.com/kata/554b4ac871d6813a03000035/train/java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HighestandLowest {
    public static String MySolution(String numbers) {
        int[] numbersArray = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numbersArray);
        return String.format("%s %s", numbersArray[numbersArray.length - 1], numbersArray[0]);
    }

    public static String OtherSolution(String numbers) {
        String[] array = numbers.split(" ");
        List<Integer> nums = new ArrayList<>();

        for(String i : array){
            nums.add(Integer.parseInt(i));
        }
        return Collections.max(nums) + " " + Collections.min(nums);
    }



    public static void main(String[] args) {
        System.out.println(MySolution("1 2 -3 4 5"));
        System.out.println(OtherSolution("1 2 -3 4 5"));
    }
}
