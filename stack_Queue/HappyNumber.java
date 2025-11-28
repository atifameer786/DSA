package stack_Queue;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static int getHappy(int n){
        int sum = 0;
        while(n>0){
            int m = n%10;
            sum+=m*m;
            n = n/10;
        }
        return sum;
    }

     public static boolean isHappy(int n) {
        if (n <= 0) return false;
        Set<Integer> seen = new HashSet<>();

        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            n  = getHappy(n);
        }
        return n==1;
     }



     public static void main(String[] args) {

        int n = 19;

        System.out.println(isHappy(2));
        
     }
    
}
