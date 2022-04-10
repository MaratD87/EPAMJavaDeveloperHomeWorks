package Homework_2;

import java.util.Arrays;

/*
Сортировка массива строк по алфавиту
 */
public class Homework2_9 {
    public static void main(String[] args) {
        String[] array = {"Marat", "Sergei", "Java"};
        System.out.println("array before sorting: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("array after sorting " + Arrays.toString(array));
    }
}
