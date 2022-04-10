package Homework_1_and_2;

import java.util.Arrays;

/*
Определить длину самого короткого слова в строке
 */
public class Homework2_10 {
    public static void main(String[] args) {
        String aString = "One Two Three Four Five";
        String[] array = aString.split(" ");
        System.out.println(Arrays.toString(array));
        String smallest = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i].length() < smallest.length()){
                smallest = array[i];
            }
        }
        System.out.println(smallest);
    }
}
