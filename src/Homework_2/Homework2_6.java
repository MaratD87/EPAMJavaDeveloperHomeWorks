package Homework_2;

/*
Переворот строки
 */
public class Homework2_6 {
    public static void main(String[] args) {
        String hi = "Hello, Sergei!";
        StringBuilder stringBuilder = new StringBuilder(hi);
        stringBuilder.reverse();
        hi = stringBuilder.toString();
        System.out.println(hi);
    }
}
