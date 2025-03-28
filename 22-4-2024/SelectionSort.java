import java.util.*;


public class SelectionSort {

    public void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public int[] selectionSort(int[] nums) {

        // In selection sort we select the postion not element
        // and try to find out the element for that postion 
        // and find the smallest element from the array
        // in selection sort we sort elements from small to large 
        // but in bubble sort we sort elements from large to small
        // 

        int size = nums.length;
        int i, j, k;

        for (i = 0; i < size; i++) {
            k = i;
            for (j = i; j < size; j++) {
                System.out.println(i+"    "+j+"   "+k);
                if (nums[j] < nums[k]) {
                    k = j;
                }

            }
            int tmp = nums[i];
            nums[i] = nums[k];
            nums[k] = tmp;

        }

        return nums;

    }

    public static void main(String[] args) {

        SelectionSort ss = new SelectionSort();
        int[] arr = { 7, 4, 1, 5, 3 };
        int[] arr1 = ss.selectionSort(arr);

        System.out.println(Arrays.toString(arr1));
        // ss.printArray(arr);

    }

}
