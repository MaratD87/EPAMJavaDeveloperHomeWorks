package Homework_1_and_2;

/*
Добавление пробелов в строку
 */
public class Homework2_12 {
    public static void main(String[] args) {
        String aString = "someword";
        StringBuilder stringBuilder = new StringBuilder(aString);
        stringBuilder.insert(4, " ");
        aString = new String(stringBuilder);
        System.out.println(aString);

    }
}
