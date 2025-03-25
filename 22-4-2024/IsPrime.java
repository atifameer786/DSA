public class IsPrime {

    public static String isPrime(int num){

        if(num<2){
            return "NO";
        }
        for(int i=2;i<num;i++){
            System.out.println(i);
            if(num%i==0){
                return "NO";
            }
            else{
                return "Yes";
            }
        }
        return "Yes";
    }
    


    public static void main(String[] args) {
        int num = 12;
        System.out.println(isPrime(num));
        
    }
}
