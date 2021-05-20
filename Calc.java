import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number"); int num1=s.nextInt();
        System.out.println("Enter the second number"); int num2=s.nextInt();
        int res;
        System.out.println("Enter the operation from - +,-,/,*"); String op=s.next();
        switch(op){
            case "+": res=num1+num2;
            System.out.println("Addition of "+num1+" and "+num2+ " gives "+res);
            break;

            case "-": res=num1-num2;
            System.out.println("Subtraction of "+num1+" and "+num2+ " gives "+res);
            break;

            case "/": res=num1/num2;
            System.out.println("Division of "+num1+" and "+num2+ " gives "+res);
            break;

            case "*": res=num1*num2;
            System.out.println("Multiplication of "+num1+" and "+num2+ " gives "+res);
            break;
        }

    }
    
}
