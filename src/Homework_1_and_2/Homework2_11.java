package Homework_1_and_2;

/*
Подсчет количества слов в строке
 */
public class Homework2_11 {
    public static void main(String[] args) {
        String aString = "someword and another word";
        String[] array = aString.split(" ");

        System.out.println(array.length);
    }
}
