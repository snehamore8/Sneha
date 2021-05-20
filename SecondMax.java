public class SecondMax {
    public static void main(String[] args) {
    int[] a={ 1,3,17,8,4,90};
    int n=a.length;
    int max=0; int secondMax=0; int temp=0;
   
   
    for (int i=0;i<n;i++) {
    if (max < a[i]){
    temp = max;
    max = secondMax;
    secondMax = temp;
    max = a[i];
    }
    else if(secondMax < a[i]) {
    secondMax = a[i];
    }
   
    }
    System.out.println("max number is "+max);
    System.out.println("second max number is "+secondMax);
    }
   }