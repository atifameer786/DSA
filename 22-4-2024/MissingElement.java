public class MissingElement {



    public static void main(String[] args) {
        int[] a = {6,7,8,9,10,11,13,14,15,16,17};
        int n = a.length;
        int diff = a[0];
        int h = a[n-1];
    
        for(int i=0;i<n;i++){
            if(a[i]-i !=diff ){
                System.out.println(i+diff);
                break;
            }
        }
        
    }
    
}
