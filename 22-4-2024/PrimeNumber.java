public class PrimeNumber {

    public static void isPrime(int n){
        boolean flag = false;
        if(n ==1){
            System.out.println(n+": Is not a prime Number");
            flag = true;
        }
        
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                System.out.println(n+": is not a prime number");
                flag = true;
                break;
            }
        }

        if(flag==false){
            System.out.println(n+": it is a prime nummer");
        }

    }




    public static void main(String[] args) {
        int n = 19;

        isPrime(n);

        
    }
    
}
