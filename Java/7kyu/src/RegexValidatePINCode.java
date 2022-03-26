// https://www.codewars.com/kata/55f8a9c06c018a0d6e000132/train/java

public class RegexValidatePINCode {
    public static void main(String[] args) {
        System.out.println(mySolution("1234"));
        System.out.println(mySolution("12345"));
        System.out.println(mySolution("a123"));
    }

    /**
     * Возвращает true, если принятая строка состоит из 4-ех или 6-ти цифр
     * @param pin
     * @return
     */
    public static boolean mySolution(String pin) {
        /*
        если длина строки не валидна
            возвращаем false
        если строка состоит целиком из чисел
            возвращаем true
        В любых других случаях возвращаем false
         */
        return false;
    }
}
