package oops;

public class Prime {



    public static boolean isPrime(int n){

        if(n<=1){
            return false;
        }

        for(int i=0;i<Math.sqrt(n);i++){
            if(i%n==0){
                return false;
            }
        }
        return true;
    }


    
    
}
