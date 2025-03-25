public class RiverseArray {

    public static void reverseArray (int[] a){

        int n = a.length;
        int[] b = new int[n];

        for (int i=0;i<n;i++){
            b[i] = a[n-i-1];   
        }

        for(int i=0;i<n;i++){
            a[i] = b[i];
        }

    }




    public static void main(String[] args) {

        int[] a= {1,2,3,4,5,6};
       

        reverseArray(a);

        for(int i=0;i<6;i++){
            System.out.print(a[i]+", ");
        }

        
    }
    
}
