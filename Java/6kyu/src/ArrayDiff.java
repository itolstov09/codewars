// https://www.codewars.com/kata/523f5d21c841566fde000009/train/java

import java.util.Arrays;

public class ArrayDiff {
    public static void main(String[] args) {
        System.out.println("mySolution");
        System.out.println(Arrays.toString(mySolution(new int[]{1, 2}, new int[]{1})));
        System.out.println(Arrays.toString(mySolution(new int[]{1, 2, 2}, new int[]{1})));
        System.out.println(Arrays.toString(mySolution(new int[]{1, 2, 2}, new int[]{2, 2})));
        System.out.println(Arrays.toString(mySolution(new int[]{1, 2, 2}, new int[]{})));
        System.out.println(Arrays.toString(mySolution(new int[]{}, new int[]{1, 2})));
    }

    /**
     * Возвращает отфильтрованный список чисел
     * @param arrayA - исходный список
     * @param arrayB - список чисел, которые необходимо убрать из исходного списка
     * @return
     */
    public static int[] mySolution(int [] arrayA, int [] arrayB) {
        // Скорее всего тут пригодится Java...Collector или похожий на него класс
        /*
        если элемент исходного массива не найден в фильтрующем массиве
            добавляем элемент в результат
         */

    }
}
