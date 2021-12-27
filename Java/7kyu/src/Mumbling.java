// https://www.codewars.com/kata/5667e8f4e3f572a8f2000039/train/java

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Mumbling {
    public static void main(String[] args) {
        System.out.println(mySolution("abcd"));
        System.out.println(otherSolution("abcd"));
    }


    public static String mySolution(String str) {
        List<String> charList = new ArrayList<>();

        for ( int charIndex = 0; charIndex <= str.length() - 1; charIndex++ ){
            char char_ = str.charAt(charIndex);
            String buffer = "";
            buffer += Character.toUpperCase(char_);
            for ( int j = 1; j <= charIndex; j++) {
                buffer += Character.toLowerCase(char_);
            }
            charList.add(buffer);
        }

        return charList.stream().collect(Collectors.joining("-"));
    }

    public static String otherSolution(String str) {
        str = str.toLowerCase();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            builder.append(Character.toUpperCase(ch));
            for (int j = 0; j < i; j++) {
                builder.append(ch);
            }
            builder.append("-");
        }

        return builder.deleteCharAt(builder.lastIndexOf("-")).toString();
    }
}
