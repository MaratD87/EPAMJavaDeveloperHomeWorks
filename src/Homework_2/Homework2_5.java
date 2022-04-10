package Homework_2;

/*
Частота встречаемости символа в строке
 */
public class Homework2_5 {
    public static void main(String[] args) {
        String s = "Hello, Sergei!";
        char h = 'e';
        int count = 0;

        for (int i = 0; i < s.length(); i++){
            if  (h == s.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
