

public class BinarySearch {
   public static int[] sortedArray={2,9,34,67,89,100};
   public static void main(String[] args) {
      int key=67;
     int position=binSearch(0,(sortedArray.length)-1,key);
     System.out.println("the key is in index "+position);
   }
   public static int binSearch(int start, int end, int key){
       int mid, count=sortedArray.length;
    if((count%2)==0)
    {
        mid=(count+1)/2;
    }
    else{
        mid=count/2;
    }
    if(key>sortedArray[mid]){
       return binSearch(mid+1, end, key);
    }
    else if(key<sortedArray[mid]){
        return binSearch(start, mid-1, key);
    }
    else if(key==sortedArray[mid]){
        return mid;
    }
    else{
        return -1;
    }
   }
    
}
