package stack_Queue;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElements1 {

    public static int[] nextGreaterElements(int[] arr) {

        int size = arr.length;
        int[] result = new int[size];
        Stack<Integer> st = new Stack<>();

        Arrays.fill(result, -1);

        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size+i; j++) {
                int index = j % size;
                if (arr[index] > arr[i]) {
                    result[i] = arr[index];
                    break;
                }

            }
        }

        return result;

    }

    public static void main(String[] args) {

        int[] arr = {3, 10, 4, 2, 1, 2, 6, 1, 7, 2, 9};
        

       int[] result = nextGreaterElements(arr);

       
        System.out.println(Arrays.toString(result));

    }

}
