// https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/train/java
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class ShortestWord {
    public static int mySolution(String s) {
        ArrayList<String> sList = new ArrayList<>();
        Collections.addAll(sList, s.split(" "));
        return sList.stream().min( (s1, s2)-> s1.length()-s2.length() ).get().length();
    }

    public static int otherSolution(String s) {
        return Stream.of(s.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }
    public static void main(String[] args) {
        System.out.println(mySolution("bitcoin take over the world maybe who knows perhaps"));
    }
}