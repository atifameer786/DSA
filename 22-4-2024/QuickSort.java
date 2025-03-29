public class QuickSort {

    // Idea behind quick sort is such that students arrange them self
    // according to their hights so consider pivot as student 
    // i try to find the element greater then pivot and j try to find lesser then pivot
    // interchange until j coross i and then pivot swap with where j points

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find the pivot's correct position
            int pivotIndex = partition(arr, low, high);

            // Recursively sort the left and right sub-arrays
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low]; // Choose the first element as the pivot
        int i = low; // Left pointer
        int j = high; // Right pointer

        while (i < j) {
            // Move j to the left until finding an element smaller than the pivot
            while (i < j && arr[j] >= pivot) {
                j--;
            }

            // Move i to the right until finding an element greater than the pivot
            while (i < j && arr[i] <= pivot) {
                i++;
            }

            // Swap elements at i and j
            if (i < j) {
                swap(arr, i, j);
            }
        }

        // Place the pivot in its correct position
        swap(arr, low, j);

        return j; // Return the pivot's final position
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 50, 70, 60, 90, 40,50, 80, 10, 20,50, 30,10 };

        System.out.println("Original Array:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
