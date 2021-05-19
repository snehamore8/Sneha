public class SecondMax {
    public static void main(String[] args) {
        int[] a={4,8,2,9,10,17};
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("maximum no. is "+max);
    }
}
