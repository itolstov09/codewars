import java.util.HashSet;

// https://www.codewars.com/kata/545cedaa9943f7fe7b000048/train/java
public class DetectPangram {
    public static boolean mySolution(String sentence) {
        HashSet<String> uniqueLetters = new HashSet<>();
        for (char c : sentence.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                uniqueLetters.add(String.valueOf(c));
            }
        }
        return uniqueLetters.size() == 26;
    }

    public static boolean otherSolution(String sentence) {
        return sentence.chars()
                .filter(Character::isLetter)
                .map(Character::toLowerCase)
                .distinct()
                .count() == 26;
    }


    public static void main(String[] args) {
        System.out.println(mySolution("The quick brown fox jumps over the lazy dog."));
        System.out.println(otherSolution("The quick brown fox jumps over the lazy dog."));
    }
}
