public class BubbleSort {

    public static void bubbleSort(int[] a, int size) {

        boolean swap = false;

        for (int i = 0; i < size - 1; i++) {

            for (int j = 0; j < size - i - 1; j++) {
                // swap = false;
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    swap = true;

                }

            }

            if (swap == false) {
                break;
            }

        }

    }

    public static void findDuplicate(int[] a,int size){

        boolean tmp = false;

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(a[i]==a[j]){
                    System.out.println("Duplicate Number is : "+a[i]);
                    tmp = true;
                }
            }
        }
        if(tmp ==false){
            System.out.println("Duplicate is not available");
        }
    }

    static void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + ",");
            
        }
        System.out.println();
    }


    static void countNoOfOccurence(int[] a,int key){
        
    }

    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90,90 };
        int n = arr.length;
        // System.out.print("Unsorted array: ");
        // printArray(arr, n);
        // bubbleSort(arr, n);
        // System.out.print("Sorted array: ");
        // printArray(arr, n);
        findDuplicate(arr, n);

    }

}
