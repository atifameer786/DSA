import java.util.*;
public class RecursionQuestions {

    public boolean isSorted(ArrayList<Integer> nums) {
        //your code goes here
        int size = nums.size();

        for(int i=0;i<size-1;i++){
            if(nums.get(i)>nums.get(i+1)){
                return false;
            }
            
        }
        return true;
    }

    public int[] reverseArray(int[] nums) {
        int size = nums.length;
        int left=0;
        int right=size-1;

        while(left<right){
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] =tmp;
            left++;
            right--;

        }
        return nums;
        
        
    }

    public boolean checkPrimeUsingRecursion(int n,int x){
        if(x>Math.sqrt(n)){
            return true;
        }
        if(n%x==0){
            return false;
        }
        return checkPrimeUsingRecursion(n,x+1);
    }

    public boolean checkPrime(int num) {
        if(num<2){
            return false;
        }
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public void reverseStringUsingRecursion(Vector<Character> s,int left,int right) {
        int size = s.size();
        Vector<Character> t = new Vector<>(size);
        if(left>=right){
            return;
        }
        char tmp = s.get(left);
        s.set(left, s.get(right));
        s.set(right,tmp);
        reverseStringUsingRecursion(s, left+1, right-1);
        
        
    }

    public static Vector<Character> reverseString(Vector<Character> s) {
        int size = s.size();
        Vector<Character> t = new Vector<>(size);

        for(int j=size-1;j>=0;j--){
            t.add(s.get(j));
        }
       for(int i=0;i<size;i++){
            s.set(i,t.get(i));
       }
       return s;
    }

    public boolean palindromeCheck(String s) {
        
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
     }

    public int sumOfNaturalNumbers(int n) {
        if (n > 0) {
            return 0;
        }
        return n + sumOfNaturalNumbers(n - 1);
    }

    public int pow(int m, int n) {
        if (n == 0) {
            return 1;
        } else {
            return pow(m, n - 1) * m;
        }
    }

    public int powOptimize(int m, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return pow(m * m, pow(m, n / 2));
        } else {
            return pow(m * m, (n - 1) / 2) * m;
        }
    }

    public int arraySum(int[] nums) {

        if (nums.length > 0) {
            return arraySum(nums);
        }

        return 1;
        // your code goes here
    }

    public int addDigits(int num) {
        // add the sum of digists until it become single digint number
        if (num < 10) {
            return num;
        }
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return addDigits(sum);
    }

    public static void main(String[] args) {


        RecursionQuestions rq = new RecursionQuestions();
        int[] arr = {1,2,3,4,5};
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(11);
        al.add(6);
        al.add(10);
       System.out.println(rq.isSorted(al));

        // System.out.println("Original array: " + Arrays.toString(arr));
        
        // rq.reverseArray(arr);
        // System.out.println("Reversed array: " + Arrays.toString(arr));
        // Vector<Character> s = new Vector<>();
        // s.add('h');
        // s.add('e');
        // s.add('l');
        // s.add('l');
        // s.add('o');
        // System.out.println("Original vector: " + s);
        // reverseString(s);
        // System.out.println("Reversed vector: " + s);

        // System.out.println(rq.checkPrime(6));
        
        // System.out.println(rq.reverseString(s));
        // System.out.println(rq.palindromeCheck("atif"));
        // System.out.println(rq.sumOfNaturalNumbers(4));
        // rq.sumOfNaturalNumbers(3);
        // System.out.println(rq.pow(2, 5));
        // System.out.println(rq.powOptimize(2, 5));

    }

}
