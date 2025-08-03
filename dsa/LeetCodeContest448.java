public class LeetCodeContest448 {


    public static int maxProduct(int n) {

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        while(n>0){
            int m = n%10;

            if(max1<m){
                max1 = m;
            }
            else if(max2<m && max1!=m){
                max2 = m;
            }
            n = n/10;

        }
        System.out.println(max1);
        System.out.println(max2);
        return max1*max2;
        
    }

    public static int sumOfGoodNumbers(int[] nums, int k) {

        int n = nums.length;
        int sum =0;
        for(int i=0;i<n;i++){
            if((nums[i]>nums[i+k] || i+k>=n) && (nums[i]>nums[i-k] || i-k<0 )){
                sum+=nums[i];
            }
            
        }
        return sum;
        
    }
    public static int minElement(int[] nums) {

        int min = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            int m =0;
             while(n!=0){
                int d = n%10;
                m +=d;
                n = n/10;
             }
             if(min>m){
                    min = m;
                }

        }

        }
        return min;
       
        
    }


    public static void main(String[] args) {

        int n = 22;
        int[] arr = {1,3,2,1,5,4};
        int k = 1;
        System.out.println(sumOfGoodNumbers(arr,k));
        // System.out.println(maxProduct(n));
        
    }
    
}
