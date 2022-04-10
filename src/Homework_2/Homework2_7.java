package Homework_2;

/*
Количество вхождений подстроки в строку
 */
public class Homework2_7 {
    public static void main(String[] args) {
        String substr = "привет";
        String string = "привет привет привет!";
        System.out.println((string + "\0").split(substr).length - 1);
    }

}
