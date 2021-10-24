// https://www.codewars.com/kata/55f2b110f61eb01779000053/train/java


public class SumOfNumbers {
    public static int mySolution(int a, int b)
    {
        if (a == b) {
            return a;
        }

        if (a > b) {
            int tmp;
            tmp = b;
            b = a;
            a = tmp;
        }

        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }

        return sum;
    }

    public static int otherSolution(int a, int b)
    {
        return (a + b) * (Math.abs(a - b) + 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println("My solution");
        System.out.println(mySolution(1, 0));
        System.out.println(mySolution(0, 1));
        System.out.println(mySolution(1, 6));
        System.out.println(mySolution(1, -6));
        System.out.println(mySolution(15, 6));
        System.out.println(mySolution(15, 9));

        System.out.println("Other solution");
        System.out.println(otherSolution(1, 0));
        System.out.println(otherSolution(0, 1));
        System.out.println(otherSolution(1, 6));
        System.out.println(otherSolution(1, -6));
        System.out.println(otherSolution(15, 6));
        System.out.println(otherSolution(15, 9));
    }
}
