public class reverseNumber {


    public static boolean isPalindrom(int n){


        int ispal =0;
        while(n>0){
            int m = n%10;
            ispal = m +ispal*10;
            n = n/10;
        
    }
    return ;



    public static int reversedigit(int n){

        if  (n<10){
            return n;
        }

        int rev =0;
        while(n>0){
            
            int m = n%10;
            rev= m + rev*10;
            n = n/10;
        }

        return rev;
        
    }



    public static void main(String[] args){

        int n = 1234;
        System.out.println(reversedigit(n));




    }
    
}
