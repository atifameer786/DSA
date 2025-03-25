public class MergingOfArraysInSortedArray {

    private int[] merge(int[] A,int low,int mid,int high){
        int i= low;
        int j = mid+1;
        int k= low;
        int[] B = new int[A.length];
        while (i<=mid && j<=high) {
            if(A[i]<A[j]){
                B[k++] = A[i++];
            }
            else{
                B[k++] = A[j++];
            }
            
        }
        for(;i<=mid;i++){
            B[k++]=A[i];
        }
        for(;j<=high;j++){
            B[k++]=A[j];
        }
        for(i=low;i<high;i++){
            A[i] = B[i];
        }
        return A;
    }

    private int[] merge(int[] A,int[] B,int n,int m){

        int[] C=new int[n+m+1];
        int i=0,j=0,k=0;

        while(i<n && j<m){
            if(A[i]<B[j]){
                C[k++] = A[i++];
            }
            else{
                C[k++] = B[j++];
            }
        }
        for(;i<n;i++){
            C[k++]=A[i];
        }
        for(;j<m;j++){
            C[k++]=B[j];
        }
        return C;
    }

    public static void main(String[] args) {
        
        MergingOfArraysInSortedArray mergeing = new MergingOfArraysInSortedArray();
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = {10,20,30,40,50,60,70,80,90};
       int[] arr3 = mergeing.merge(arr1, arr2, arr1.length, arr2.length);

       for(int i=0;i<arr3.length;i++){
        System.out.print(arr3[i]+" ");
       }
       System.out.println();
    }
    
}
