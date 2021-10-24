import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String numString = String.valueOf(num);
        int numLength = numString.length();

        int[] numArray = new int[numLength];
        for (int i = 0; i < numLength; i++)
        {
            numArray[i] = Integer.parseInt(numString.substring(i, i + 1));
        }
        Arrays.sort(numArray);

        String resultString = "";
        for (int i = numLength - 1; i >= 0; i--)
        {
           resultString += numArray[i];
        }

        return Integer.parseInt(resultString);
    }

    public static void main(String[] args) {
        System.out.println(sortDesc(142465));
    }
}
