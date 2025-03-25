public class PrintDivisors {

    public static int[] printDivsiors(int n , int [] size){

        int[] divisor = new int[n];
        
        int count = 0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                divisor[count++] =i;
            }
        }
        size[0] = 0;
        return divisor;

    }

    public static void printDivsiors(int n){
        double r = Math.sqrt(n);
        System.out.println(r);
        for(int i=1;i<=Math.sqrt(n);i++){
            
            if(n%i==0){
                System.out.print(i+" ");

            }
            if(i!=n/i){
                System.out.print(n/i+" ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 12;
        printDivsiors(n);
       
    
    }
    
}
