import java.util.ArrayList;

public class BinarySearch {

    public int recursiveBinarySearch(int[] arr, int l, int h, int key) {

        if (l < h) {
            int mid = (l + h) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                return recursiveBinarySearch(arr, l, mid - 1, key);
            } else {
                return recursiveBinarySearch(arr, mid + 1, h, key);
            }

        }
        return -1;

    }

    public static int binarySearch(int[] arr, int key) {

        int size = arr.length;
        int l = 0;
        int h = size - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] == key) {
                return mid;
            }

            else if (key > arr[mid]) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }

        }
        return -1;
    }

    public static int lowerBound(int[] arr, int key) {
        int l = 0, h = arr.length;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] < key) {
                l = mid + 1;
            } else {
                h = mid;
            }
        }
        return l; // Position where key could be inserted (first >= key)
    }

    public static int upperBound(int[] arr, int key) {
        int l = 0, h = arr.length;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] <= key) {
                l = mid + 1;
            } else {
                h = mid;
            }
        }
        return l; // Position of first element > key
    }

    public int[] getFloorAndCeilOptimal(int[] nums, int x) {

        int lb = lowerBound(nums, x);
        int ub = upperBound(nums, x);

        int floor = (lb > 0) ? nums[lb - 1] : -1;
        int ceil = (lb < nums.length) ? nums[lb] : -1;

        return new int[] { floor, ceil };

    }

    public boolean searchInARotatedSortedArrayII(ArrayList<Integer> nums, int k) {

        int n = nums.size();
        for (int i = 0; i < n; i++) {
            if (nums.get(i) == k) {
                return true;
            }
        }
        return false;

    }

    public int findMin(ArrayList<Integer> arr) {

        int min = Integer.MAX_VALUE;
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }
        return min;

    }

    public int findMinOptimal(ArrayList<Integer> arr) {

        int min = Integer.MAX_VALUE;
        int n = arr.size();
        int l = 0;
        int h = n - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (arr.get(l) <= arr.get(mid)) {
                // left part is remove from searching portion
                min = Math.min(min, arr.get(l));
                l = mid + 1;
            } else {
                // right part is remove from searching portion
                min = Math.min(min, arr.get(mid));
                h = mid - 1;
            }
        }
        return min;

    }

    public int findKRotation(ArrayList<Integer> nums) {
        int n = nums.size();
        int index = -1;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums.get(i) < ans) {
                ans = nums.get(i);
                index = i;
            }
        }
        return index;
    }

    public int findKRotationOptimal(ArrayList<Integer> nums) {
        // just find the index of min value in the entire array
        int ans = Integer.MAX_VALUE;
        int n = nums.size();
        int l = 0;
        int h = n - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums.get(l) <= nums.get(h)) {
                ans = Math.min(ans, nums.get(l));
                break;
            }
            if (nums.get(l) <= nums.get(mid)) {
                ans = Math.min(ans, nums.get(l));
                l = mid + 1;
            } else {
                ans = Math.min(ans, nums.get(mid));
                h = mid - 1;
            }
        }
        return nums.indexOf(ans);
    }

    public int singleNonDuplicate(int[] nums) {

        int n = nums.length;
        int count = -1;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                count = nums[i];
                return nums[i];
            }
        }

        return count;

    }

    public static double myPow(double x, int n) {

        double pow = 1;
        if (n == 0 || x == 1.0)
            return 1;
        for (int i = 0; i < n; i++) {
            pow *= x;
        }
        return pow;

    }

    public static double myPowRecursive(double x, int n) {

        double pow = 1;
        if (n == 0 || x == 1.0)
            return 1;

        return myPow(x, n - 1) * x;

    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();

        // int[] arr = { 3, 5, 7, 8, 9, 10, 19, 23, 45, 56, 67, 78, 89, 90 };
        // int size = arr.length-1;

        // System.out.println(bs.recursiveBinarySearch(arr, 0, size, 45));
        // System.out.println(bs.binarySearch(arr, 45));
        // System.out.println(arr[bs.binarySearch(arr, 45)]);

        int[] arr = { 1, 2, 2, 2, 3, 4, 5 };

        int key = 2;

        System.out.println("Binary Search: " + binarySearch(arr, key));
        System.out.println("Lower Bound: " + lowerBound(arr, key));
        System.out.println("Upper Bound: " + upperBound(arr, key));

        int x = 2;
        int n = 10;
        System.out.println(myPowRecursive(x, n));

    }

}
