// https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


public class YourOrderPlease {
    public static void main(String[] args) {
//        MySolution("");
        mySolution("is2 Thi1s T4est 3a");
        otherSolution("is2 Thi1s T4est 3a");
    }


    public static String mySolution(String words) {
        if ( words.length() == 0 ) {
            return "";
        }

        String[] wordsArray = words.split(" ");
        Map<Integer, String> orderedStrings = new HashMap<>();
        for (String word : wordsArray) {
            for (int charIndex = 0; charIndex <= word.length(); charIndex++) {
                char char_ = word.charAt(charIndex);
                if (Character.isDigit(char_)) {
                    orderedStrings.put(Character.getNumericValue(char_), word);
                    break;
                }
            }
        }
        return String.join(" ", orderedStrings.values());

    }

    public static String otherSolution(String words) {
        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
                .reduce((a, b) -> a + " " + b).get();
    }

}
