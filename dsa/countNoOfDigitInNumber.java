public class countNoOfDigitInNumber{


public static int countdigit(int n){

    if(n==0){
        return 1;
    }
    int count =0;
    while(n!=0){
        int m = n%10;
        count++;
        n = n/10;

    }


    return count;
}



public static void main(String[] args){


    int n = 4443234;
    System.out.println(countdigit(n));
    




}



}





    
    
