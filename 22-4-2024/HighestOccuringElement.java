import java.util.*;
import java.util.Map.Entry;

public class HighestOccuringElement {

    public  static int sumHighestAndLowestFrequency(int[] nums) {


        HashMap<Integer,Integer> hm = new HashMap<>();
    int min = Integer.MAX_VALUE;
    int max = 0;

    for(int i=0;i<nums.length;i++){
        if(hm.containsKey(nums[i])){
            hm.put(nums[i],hm.get(nums[i])+1);
        }
        else{
            hm.put(nums[i],1);
        }
    }

    for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
        int frequency = entry.getValue();
        if (frequency < min) {
            min = frequency;
        }
        if (frequency > max) {
            max = frequency;
        }
    }
   
    
    return min+max;
}

    public static void main(String[] args) {

      int[] arr = {1,1,1,1,2,2,2,2,5,5,5,5};
        int sum = sumHighestAndLowestFrequency(arr);
        System.out.println(sum);
      

    }

}
