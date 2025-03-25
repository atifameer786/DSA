public class MergeSort {

    public void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

   private static void merge(int A[], int low, int mid, int high){
        int i = low;
        int j = mid+1;
        int k = low;
        int[] B = new int[high-low+1];
        while (i <= mid && j <= high){
            if (A[i] < A[j]){
                B[k++] = A[i++];
            } else {
                B[k++] = A[j++];
            }
        }
        while (i <= mid){
            B[k++] = A[i++];
        }
        while (j <= high){
            B[k++] = A[j++];
        }
        for (i=low; i<=high; i++){
            A[i] = B[i];
        }
    }
     

    private static void mergeSort(int[] a,int n){
        int p,i,l,mid,h;
        for(p =2;p<=n;p=p*2){

            for(i=0;i+p-1<n;i=i+p){
                l = i;
                h = i+p-1;
                mid = (l+h)/2;
                merge(a,l,mid,h);
            }
        }
        if (p/2 < n){
            merge(a, 0, p/2-1, n-1);
        }
    }






    public static void main(String[] args) {

        int[] arr= {2, 5, 8, 12, 3, 6, 7, 10};
        System.out.println(arr.length);
        MergeSort ms = new MergeSort();
        ms.printArray(arr);
        ms.mergeSort(arr, 8);
        ms.printArray(arr);
        
    }
    
}
