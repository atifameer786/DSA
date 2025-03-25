import java.util.*;

public class Collection {

    public static void chaining(int n){
        Hashtable<Integer, LinkedList<Integer>> hashtable = new Hashtable<>(n);
        for(int i=0;i<n;i++){
            

            

        }

    }

    public int mostFrequentElement(int[] nums) {
        HashMap<Integer,Integer> hp = new HashMap<>();
        for(int i=1;i<=nums.length;i++){
            hp.put(i, nums[i]);
        }
        



        return 1;
     
    }

    public static boolean arraySortedOrNot(int[] arr, int n) {

        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
       
    }


    public static void reverse(int[] arr, int n) {
        int[] reverseArray = new int[n];

        for(int i=0,j=n-1;i<n && j>=0;i++,j--){
            reverseArray[i] = arr[j];
        }
        // arr =null;
        
        for(int i=0,j=n-1;i<n && j>=0;i++,j--){
            arr[i] = reverseArray[j];
        }
       for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
       }
        

   
    }


    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        arraySortedOrNot(arr, 5);
        // reverse(arr, 5);
        
        // System.out.println(reverse(arr,5));
        // ArrayList<Integer> al1 = new ArrayList<>(20);
        // ArrayList<Integer> al2 = new ArrayList<>(List.of(1,2,3,4,5));
        // LinkedList<Integer> ll = new LinkedList<>();
        // Stack<Integer> st = new Stack<>();
        // st.add(9);
        // st.add(9);
        // st.add(9);
        // System.out.println(st);
        HashMap<Integer,Integer> hp = new HashMap<>();
       
        
        // al1.add(10);
        // al1.add(0, 9);
        // // al1.addAll(al2);
        // for(int i=0;i<al2.size();i++){
        //     System.out.print(al2.get(i)+" ");
        // }
        // System.out.println();
        // System.out.println(al1);
        // System.out.println(al2);


    }
    
}
