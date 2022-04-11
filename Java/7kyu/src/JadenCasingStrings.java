import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Collectors;

//https://www.codewars.com/kata/5390bac347d09b7da40006f6/train/java
public class JadenCasingStrings {
    public static void main(String[] args) {
        String str1 = "most  trees are blue";
        String str2 = null;
        String str3 = "";

        System.out.println(mySolution(str1));
        System.out.println(mySolution(str2));
        System.out.println(mySolution(str3));
    }

    public static String mySolution(String string) {
        if (Objects.equals(string, "") || string == null) {
            return null;
        }
        return Arrays.stream(string.split("\\s+"))
                .map(word ->  word.substring(0,1).toUpperCase(Locale.ROOT) + word.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }


//    Из пушек по воробьям. Не стоит для такой простой задачи использовать этот вариант
//    public static String mySolution(String string) {
//        return Optional.ofNullable(string)
//                .filter(str -> str.length() > 0)
//                .map(str ->
//                        Arrays.stream(str.split(" "))
//                                .map(word ->  word.substring(0,1).toUpperCase(Locale.ROOT) + word.substring(1).toLowerCase())
//                                .collect(Collectors.joining(" "))
//                )
//                .orElse(null);
//
//    }
}
