
//using recursion -----------------------------
public class Factorial {int fact=1;
    public static void main(String[] args) {
        int no=6; 
        Factorial f=new Factorial();
        int res=f.cal(no);
        System.out.println(res);
    }
    int cal(int num){
        if(num>1){
               fact=fact*num;
               cal(num-1);
        }return fact;
    }
}



/* public static void main(String[] args) {
    int n=5; int fact=1;
    for(int i=1;i<=n;i++){
       
        fact= fact*i;
        
    }System.out.println("Factorial of "+n+" is = "+fact);
} */