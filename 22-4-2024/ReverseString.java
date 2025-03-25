public class ReverseString {

    public boolean palindromeCheck(String s) {
        String str = s;
        int i = 0;
        int j = s.length()-1;
        String rev = "";
        while(i>j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            
            i++;
            j--;

        }

        return true; 
        
    }



    public static void main(String[] args) {
        
    }
    
}
