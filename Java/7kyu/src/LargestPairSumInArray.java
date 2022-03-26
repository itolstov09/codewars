import java.util.Arrays;

//https://www.codewars.com/kata/556196a6091a7e7f58000018/train/java/
public class LargestPairSumInArray {
    public static void main(String[] args) {
        System.out.println(mySolution( new int[] {10,14,2,23,19} ));
    }

    public static int mySolution(int[] nums) {
        int[] arr = nums;
        Arrays.sort(nums);
        return arr[arr.length - 1] + arr[arr.length - 2];
    }
}
