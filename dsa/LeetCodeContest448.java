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


    public static void main(String[] args) {

        int n = 22;
        System.out.println(maxProduct(n));
        
    }
    
}
