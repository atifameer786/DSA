import java.util.*;
public class ArrayProblems {

    public static void secondLargestElement(int[] arr) {

        int max1 = arr[0];
        int max2 = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            } else if (arr[i] < max1 && arr[i] < max2) {
                System.out.println("else");
                max2 = arr[i];
            }
        }
        System.out.println(max2);
        System.out.println(max1);

    }

    public static void insertElementInArray(int[] a, int index, int key) {
        int[] arr = new int[a.length+1];
        for (int i = arr.length-1; i >= index; i--) {
            a[i] = a[i - 1];
        }
        a[index] = key;
    }

    public static void insertAtGivenIndex() {
        int A[] = new int[10];
        A[0] = 3;
        A[1] = 9;
        A[2] = 7;
        A[3] = 8;
        A[4] = 12;
        A[5] = 6;

        int n = 6;

        for (int i = 0; i < n; i++)
            System.out.print(A[i] + ",");
        System.out.println("");

        int x = 20;
        int index = 2;

        for (int i = n; i > index; i--)
            A[i] = A[i - 1];
        A[index] = x;

        for (int i = 0; i <= n; i++)
            System.out.print(A[i] + ",");
        System.out.println("");
    }

    public static void deleteElementFromArray(int[] a, int index) {
        int n = 5;
        int tmp = a[index];
        for (int i = index; i < n-1; i++) {
            a[i] = a[i + 1];
        }

    }

    public static void copyElementsOfArray(int[] a, int[] b, int n) {

        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }
    }

    public static void increaseSizeOfArray(int[] a) {

        int[] b = new int[2 * a.length];
        System.out.println("Size of a:" + a.length);
        System.out.println("Size of b:" + b.length);
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        a = b;
        b = null;
        for (int i : a) {
            System.out.println(i);

        }
        // for (int i : b) {
        // System.out.println(i);

        // }
    }

    public static void main(String[] args) {

        int[] arr = new int[10];
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0, 3);
        al.add(1, 5);
        Collections.swap(al, 0, 1);
        
        // int[] b = new int[2*arr.length];
        // b = arr;
        // System.out.println(arr.length);
        // System.out.println(b.length);

        // int key = 18;
        // int index = 2;
        // for (int i = 0; i < arr.length; i++)
        //     System.out.print(arr[i] + ",");
        // System.out.println("");

        // // deleteElementFromArray(arr, index);

        // insertElementInArray(b, index, key);
        // // copyElementsOfArray(arr, b, 4);
        // // increaseSizeOfArray(arr);

        // for (int i = 0; i < b.length; i++)
        //     System.out.print(b[i] + ",");
        // System.out.println("");

        insertAtGivenIndex();

    }

}
