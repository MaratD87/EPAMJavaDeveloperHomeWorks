package Homework_2;
/*
Четные и нечетные символы разделить по разным строкам
 */


public class Homework2_1 {
    public static void main(String[] args) {
        String string = "0123456";
        String odd = "";
        String even = "";

        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) % 2 != 0){
                odd = odd + string.charAt(i);
            } else {
                even = even + string.charAt(i);
            }
        }

        System.out.println(odd);
        System.out.println(even);

    }
}
