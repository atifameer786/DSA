public class GcdOfTwoNumber {

    public static int solve(int n,int m){
        int min = Integer.min(n, m);
        int max = Integer.max(n, m);
        int gcd = 0;
        if(n==m){
            return n;
        }
       for(int i=1;i<=min;i++){
        if(min%i==0 && max%i==0){
            gcd = i;

        }
       }
        return gcd;
    }


    public static int gcd(int a,int b){

        // int min = Integer.min(a, b);
        // int max = Integer.max(a, b);

        while (a!=b){

            if(a>b){
                a = a-b;
            }
            else{
                b = b-a;
            }
        }
        return a;
    }



    public static void main(String[] args) {
        int n = 2;
        int m = 5;
        System.out.println(gcd(n, m));
        // System.out.println(solve(n, m));
        
    }
    
}
