
public class Reverse {
    public static void main(String[] args) {
        int number=32,b=number, rev=0,x, count=String.valueOf(number).length(); //String name="Okay";
        for (int i=0;i<count;i++){
            x=number%10;
            rev=(rev*10) + x;
            number=number/10;
            // to reverse a string ->
            //for(int i=count-1;i>=0;i--)
            //{ rev=rev+name.chatAt(i);}
        }
        System.out.println("The reverse of " + b+" is "+rev);
    }
}