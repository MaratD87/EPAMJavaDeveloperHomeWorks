package Homework_1_and_2;

import java.util.Scanner;

/*
Удаление одинаковых символов
 */
public class Homework2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String anyString = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder(anyString);
        for (int i = 0; i < stringBuilder.length()-1; i++){
            for (int j = i+1; j <stringBuilder.length(); j++) {
                if (stringBuilder.charAt(i) == stringBuilder.charAt(i + 1)) {
                    stringBuilder.deleteCharAt(i + 1);
                }
            }
        }
        System.out.println(stringBuilder);
    }
}
