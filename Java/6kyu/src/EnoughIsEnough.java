// https://www.codewars.com/kata/554ca54ffa7d91b236000023/train/java

import java.util.*;

public class EnoughIsEnough {
    public static void main(String[] args) {
        mySolution(new int[] {1,1,3,3,7,2,2,2,2}, 3);
        otherSolution(new int[] {1,1,3,3,7,2,2,2,2}, 3);
    }


    public static int[] mySolution(int[] elements, int maxOccurrences) {
        List<Integer> result = new ArrayList();
        Map<Integer, Integer> elementsCounter = new HashMap<>();
        for (int element : elements) {
            int elementCount = elementsCounter.getOrDefault(element, 0);
            elementsCounter.put(element, ++elementCount);
            if ( elementCount <= maxOccurrences) {
                result.add(element);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    public static int[] otherSolution(int[] elements, int maxOccurrences) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return Arrays.stream(elements)
                .filter(element -> map.merge(element, 1, Integer::sum) <= maxOccurrences)
                .toArray();
    }
}
