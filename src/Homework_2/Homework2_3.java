package Homework_2;

import java.util.Scanner;

/*
Вводится строка из букв и цифр, построить новую только из цифр
 */
public class Homework2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inString = sc.nextLine();
        String outString = "";

        for (int i = 0; i < inString.length(); i++){
            if (Character.isDigit(inString.charAt(i))){
                outString += inString.charAt(i);
            }
        }
        System.out.println(outString);
    }
}
