
import java.util.HashMap;
import java.util.Map;

public class Hp {

   public static void main(String[] args) {


    HashMap <Integer, String> map = new HashMap<>(2);

    int[]  arr = new int[7];
    arr[0]= 12;
    
    
   
    for(Map.Entry<Integer,String> e : map.entrySet()){

        System.out.println("Keys:"+" Values: "+e.getKey()+" "+e.getValue());

    }

    System.out.println(map.get(41));
    System.out.println("Size of map: "+map.size());
    // if(map.containsKey(3)){
    //     System.out.println(map.values());
    // }

   }
    
}
