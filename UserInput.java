import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=s.next();
        System.out.println("Enter your age");
        int age=s.nextInt();
        System.out.println("Enter your mobile number");
        long mob=s.nextLong();
        System.out.println("Enter your gender");
        char gender=s.next().charAt(0);

        System.out.println("Name-"+name);
        System.out.println("Age-"+age);
        System.out.println("Mobile number-"+mob);
        System.out.println("Gender-"+gender);
    }
}
