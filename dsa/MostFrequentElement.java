import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MostFrequentElement {



    public int mostFrequentElement(int[] nums) {

        HashMap<Integer,Integer> hm = new HashMap<>();
        int maxFreq = 0;
        int maxEle = 0;

        for(int i: nums){
            hm.put(i,hm.getOrDefault(i, 0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            int freq = entry.getKey();
            int ele = entry.getValue();

            if(freq>maxFreq){
                maxFreq= freq;
                maxEle = ele;
            }
            else if(freq == maxFreq){
                maxEle = Math.min(maxEle,ele);
            }

        }
        return maxEle;  


    }


    public static int secondMostFrequentElement(int[] nums) {

        int maxFreq = 0;
        int maxEle = -1;
        int secondMaxEle = -1;
        int secMaxfreq = 0;

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i: nums){
            hm.put(i,hm.getOrDefault(i, 0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            int freq = entry.getValue();
            int ele = entry.getKey();

            if(freq>maxFreq){
                secMaxfreq=maxFreq;
                maxFreq = freq;
                secondMaxEle = maxEle;
                maxEle = ele;
            }
            else if(freq==maxFreq){
                maxEle = Math.min(maxEle,ele);
            }
            else if (freq>secMaxfreq){
                secMaxfreq = freq;
                secondMaxEle = ele;
            }
            else if (freq == secMaxfreq){
                secondMaxEle = Math.min(secondMaxEle, ele);
            }
        }
        return secondMaxEle;
    }

    public static int sumHighestAndLowestFrequency(int[] nums) {


        int maxFreq =0;
        int minFreq = Integer.MAX_VALUE;
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i:nums){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){

            int freq = entry.getValue();
            if(freq>maxFreq){
                maxFreq = freq;
            }
            if(freq<minFreq){
                minFreq = freq;
            }
        }
        return minFreq+maxFreq;
      
    }





    public static void main(String[] args) {

        int[] arr = {10, 9, 7, 7, 8, 8, 8};
        System.out.println(sumHighestAndLowestFrequency(arr));
        
        
    }
    
}
