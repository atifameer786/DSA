import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Nomisho {



    public static void findAnagrams(String[] words){

        Map<String,List<String>> mp = new HashMap<>();

        for(String word:words){
            char[] chars = word.toLowerCase().toCharArray();
            Arrays.sort(chars);

        }


        for(List<String> gp: mp.values()){
            if(gp.size()>1){
                System.out.println(gp);
            }
        }

    }








    public static void main(String[] args) {

        String[] words = {"PAN", "NAP", "EAT", "ATE"};
        findAnagrams(words);
        
    }
    
}
