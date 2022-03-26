// https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java

public class HumanReadableTime {
    public static void main(String[] args) {
        System.out.println("My solution");
        System.out.println("0 -> " + "00:00:00 = " + mySolution(0));
        System.out.println("5 -> " + "00:00:05 = " + mySolution(0));
        System.out.println("60 -> " + "00:01:00 = " + mySolution(0));
        System.out.println("86399 -> " + "23:59:59 = " +  mySolution(0));
        System.out.println("359999 -> " + "99:59:59 = " + mySolution(0));
    }

    /**
     * Возвращает время в читабельном виде ЧЧ:ММ:СС
     * @param seconds - время в секундах
     * @return - строка формата ЧЧ:ММ:СС
     */
//    public static String mySolution(int seconds) {
        /*
        вычисляем сутки в секундах
        делим нацело seconds на сутки в секундах и сохраняем результат
        вычисляем остаток от деления seconds на сутки в секундах
        вычисляем
         */

//    }
}
