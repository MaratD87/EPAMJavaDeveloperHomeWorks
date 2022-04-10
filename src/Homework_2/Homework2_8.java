package Homework_2;

import java.util.Arrays;
import java.util.Comparator;

/*
Вывести слова строки в обратном порядке
 */
public class Homework2_8 {
    public static void main(String[] args) {
        String s = "Hello my Java";
        System.out.println("before: " + s);
        String[] array = s.split(" ");
        Arrays.sort(array, Comparator.reverseOrder());
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++){
            builder.append(array[i]);
            builder.append(" ");
        }
        s = builder.toString();
        System.out.println("after: " + s);

    }
}
