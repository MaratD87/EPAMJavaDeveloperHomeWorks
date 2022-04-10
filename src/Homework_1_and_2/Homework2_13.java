package Homework_1_and_2;

/*
Является ли строка палиндром?
 */
public class Homework2_13 {
    public static void main(String args[]) {
        String aString = "Nauan";

        aString.toLowerCase();

        if (isPalindrome(aString) == true){
            System.out.println(aString + " is a palindrome");
        } else{
            System.out.println(aString + " is not a palindrome");
        }
    }
    static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
