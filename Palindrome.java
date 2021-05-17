package Sneha;
public class Palindrome {
    public static void main(String[] args) {
        String str="madam"; int count=str.length();
        System.out.println(count);
        for (int i=0; i<count/2;i++){
           if (str.charAt(i)==str.charAt(count-1)){
               System.out.println("Palindrome");
               System.out.println("change");
           }
        }
    }
}