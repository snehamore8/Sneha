package Sneha;
public class Palindrome {
    public static void main(String[] args) {
        String str="madafadam"; int count=str.length(); boolean isPalindrome=true;
        System.out.println(count);
        for (int i=0; i<=count/2;i++){
            System.out.println(i);
           if (str.charAt(i)!=str.charAt((count-1)-i)){
            isPalindrome=false;
            break;
           }
        }
        if(isPalindrome){
System.out.println("palindrome");
        } else{
            System.out.println("not palindrome");
        }
    }
}


