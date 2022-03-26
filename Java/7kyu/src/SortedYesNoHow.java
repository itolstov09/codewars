//https://www.codewars.com/kata/580a4734d6df748060000045/train/java
public class SortedYesNoHow {
    public static void main(String[] args) {
        System.out.println(mySolution(new int[] {15, 7, 3, -8}));
    }

    public static String mySolution(int[] arr) {
        String answer = "";
        String order = "";
        int firstNumber = arr[0];
        int secondNumber = arr[1];
        if (firstNumber > secondNumber) {
            answer = "yes, ";
            order = "descending";
        } else if (firstNumber < secondNumber) {
            answer = "yes, ";
            order = "ascending";
        }

        for (int i = 2; i < arr.length; i++) {
            if ( arr[i - 1] > arr[i] && order.equals("ascending") || arr[i - 1] < arr[i] && order.equals("descending")) {
                return "no";
            }
        }

        return answer + order;
    }

}
