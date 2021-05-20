
import java.util.*;
public class KeyValue {
 public static void main(String[] args) {
 int[] array={2,5,1,10,9,7,90,1,90}; 
 int n=array.length; int i=0;
 Map<Integer,Integer> map = new HashMap<>();
 while(i<n){
     if(map.containsKey(array[i])){
        map.put(array[i],map.get(array[i])+1);
         System.out.println("Found "+ array[i]);
         System.out.println(map);
         return;
     }
     else{
         map.put(array[i],1);
     }
    i++;
 }
 }
}
