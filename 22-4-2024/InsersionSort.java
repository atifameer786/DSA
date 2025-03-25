public class InsersionSort {


    public void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
    }

    public int[] insertionSort(int[] nums) {

/**
 * Insertion Sort works by gradually building a sorted portion of the array.
 * Like inserting an element in an array, we don’t need to find an exact position in advance;
 * instead, we shift elements until we find the correct sorted position for each element.
 * 
 * In a linked list, insertion requires locating the position first, whereas
 * in an array, we directly shift elements to create space. This is why
 * insertion sort is often considered well-suited for linked lists.
 * 
 * We start the outer loop from index 1, as we consider the first element already sorted.
 * Each iteration inserts the current element (`nums[i]`) into its proper position in the sorted portion.
 */

        int size = nums.length;
        for(int i=1;i<size;i++){
            int x = nums[i];
            int j = i-1;
            while (j> -1 && nums[j]>x) {
                nums[j+1] = nums[j];
                j--;  
            }
            nums[j+1] =x;
        }

        return nums;

    }





    public static void main(String[] args) {

        InsersionSort is = new InsersionSort();
        int[] arr = { 7, 4, 1, 5, 3 };
        is.insertionSort(arr);
        is.printArray(arr);
        
    }
    
}
