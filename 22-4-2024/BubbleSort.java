public class BubbleSort {

    public int[] bubbleSort(int[] nums) {
       /**
 * Bubble Sort operates on the principle that, like a stone sinking in water,
 * heavier elements "sink" to the end of the array while lighter elements "bubble up."
 * In each pass, the largest unsorted element moves to its correct position at the end.
 * By reducing the comparison range with `n-1-i` in each inner loop, we avoid re-checking sorted elements.
 * The `flag` variable optimizes the process by stopping early if no swaps are needed, indicating 
 * the list is already sorted.
 */

        int size = nums.length;
        boolean flag;

        for (int i = 0; i < size - 1; i++) {
            flag = false;
            for (int j = 0; j < size - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                    flag = true;
                }
            }

            if (flag == false) {
                return nums;
            }

        }

        return nums;

    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] arr = { 7, 4, 1, 5, 3 };

        bs.bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

}
