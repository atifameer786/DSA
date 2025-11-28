public class LeetCode {



    public static boolean isPalindrome(String s){
        int r = s.length()-1;
        int l = 0;

        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static String longestPalindrome(String s) {

        if(s==null || s.length()<1){
            return "";
        }
        int size = s.length();
        String longest = "";


        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                String sub = s.substring(i, j+1);
                if(isPalindrome(sub) && sub.length()>longest.length()){
                    longest = sub;
                }
            }
        }
        return longest;

        
    }

    public static long maximumProduct(int[] nums, int m) {

        long max = Long.MIN_VALUE;
        if(m==1){
            for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;

        }

        long ans = Long.MIN_VALUE;
        // j-i+1 = m;

        for(int i=0;i<nums.length;i++){
            int minJ = m+i-1;

        }
        

        
        
    }


    public static void main(String[] args) {

        String s = "cbbd";
        System.out.println(longestPalindrome(s));

        int[] nums =  {-1,-9,2,3,-2,-3,1};
        int m = 1;

        System.out.println(maximumProduct(nums, m));

        
        
    }
    
}
