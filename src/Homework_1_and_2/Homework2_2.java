package Homework_1_and_2;

/*
    Количество цифр в строке
 */
public class Homework2_2 {
    public static void main(String[] args) {
        String s = "123asda123";
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (Character.isDigit(s.charAt(i))){
                count++;
            }
        }

        System.out.println(count);
    }
}
