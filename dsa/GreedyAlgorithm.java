import java.util.Arrays;

public class GreedyAlgorithm {


    public static int findMaximumCookieStudents(int[] Student, int[] Cookie) {
        
        Arrays.sort(Student);
        Arrays.sort(Cookie);
        int sSize = Student.length;
        int cSize = Cookie.length;
        int l = 0;
        int r =0;

        while(r<cSize){

            if(Cookie[r]>=Student[l]){
                l++;
            }
            r++;

        }
        return l;
    }


    public static boolean lemonadeChange(int[] bills) {
        //your code goes here

        int fiveBill =0;
        int tenBill = 0;
        
        for(int bill:bills){

            if(bill==5){
                fiveBill++;
                
            }
            else if(bill==10){
                if(fiveBill>0){
                    fiveBill--;
                    tenBill ++;
                }
                else{
                    return false;
                }
            }
            else{

                if(tenBill>0 && fiveBill>0){
                    tenBill--;
                    fiveBill--;
                }
                else if(fiveBill>=3){
                    fiveBill-=3;
                }
                else{
                    return false;
                }
                
            }
        }
        return true;


    }







    public static void main(String[] args) {

        int[] nums = {5, 5, 10, 5, 20};
        int[] Student = {1,2,3};
        int[] Cookie = {1,1};


        System.out.println(findMaximumCookieStudents(Student, Cookie));

        System.out.println(lemonadeChange(nums));


        
    }
    
}
