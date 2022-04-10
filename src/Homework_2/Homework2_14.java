package Homework_2;

/*
Замена подстроки в строке
 */
public class Homework2_14 {
    public static void main(String[] args) {
        String aString = "Marat is Java newbie";
        System.out.println("before: " + aString);
        String[] array = aString.split(" ");

        for (int i = 0; i < array.length; i++){
            if(array[i].equals("newbie")){
                array[i] = "master";
            }
        }
        StringBuilder builder = new StringBuilder();
        for (String s : array) {
            builder.append(s);
            builder.append(" ");
        }
        aString = builder.toString();
        System.out.println("after: " + aString);
    }
}
