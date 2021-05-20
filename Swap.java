public class Swap {
    
    public static void main(String[] args) {
        int a=10, b=20;
        int temp;
        System.out.println("Before swap a="+a+ " b="+b);
        //with temp var
        temp=a;
        a=b;
        b=temp; 
        System.out.println("After swap a="+a+ " b="+b);
        //without temp variable
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap a="+a+ " b="+b);
    }
}
