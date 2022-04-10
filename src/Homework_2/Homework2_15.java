package Homework_2;

/*
Расстояние между подстроками
 */
public class Homework2_15 {
    public static void main(String[] args) {
        String string = "Java is god of coding";
        String firstSubstring = "god";
        int length = firstSubstring.length();
        String secondSubstring = "coding";

        int one = string.indexOf(firstSubstring);
        int two = string.indexOf(secondSubstring);

        System.out.println(two - (one + length));
    }
}
