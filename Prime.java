public class Prime {
    public static void main(String[] args) {
     /*    int n=7,count=0;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                count=count+1;
            }
        }
        if(count==0){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not Prime number");
        } */ 
        //-- to print all primes between 1 to100
for(int no=1;no<=100;no++){ int temp=0;
    for(int i=2;i<=no-1;i++){
        if(no%i==0){
            temp=temp+1;
        }
    } if(temp==0){
        System.out.println(no);
    }else{
        temp=0;
    }
}

    }
}
