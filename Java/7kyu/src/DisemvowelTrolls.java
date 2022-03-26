//https://www.codewars.com/kata/52fba66badcd10859f00097e/train/java
public class DisemvowelTrolls {
    public static void main(String[] args) {
        System.out.println(mySolution("Hello"));
        System.out.println(mySolution("This website is for losers LOL!"));
        System.out.println(otherSolution("Hello"));
        System.out.println(otherSolution("This website is for losers LOL!"));
    }

    public static String mySolution(String text) {
        String[] vowels = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
        String result = text;
        for (String vowel: vowels) {
            result = result.replace(vowel,"");
        }
        return result;
    }

    public static String otherSolution(String Z) {
        return Z.replaceAll("(?i)[aeiou]" , "");
    }

}
