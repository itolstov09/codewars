//https://www.codewars.com/kata/58daa7617332e59593000006/train/java
public class MostDigits {
    public static void main(String[] args) {
//        System.out.println(mySolution(new int[] {3, 40000, 100}));
//        System.out.println(mySolution(new int[] {-10, 1, 0, 1, 10}));
//        System.out.println(mySolution(new int[] {9000, 8, 800}));
        System.out.println(mySolution(new int[]  {8, 900, 500}));
    }

    public static int mySolution(int[] nums) {
        int mostDigitValue = nums[0];
        int mostDigitLength = String.valueOf(mostDigitValue).length();
        for (int i = 1; i < nums.length; i++) {
            int numberDigitsLength = String.valueOf(Math.abs(nums[i])).length();
            if ( numberDigitsLength == mostDigitLength) {
                continue;
            }
            else if (numberDigitsLength > mostDigitLength) {
                mostDigitValue = nums[i];
                mostDigitLength = String.valueOf(mostDigitValue).length();
            }
        }
        return mostDigitValue;
    }
}
