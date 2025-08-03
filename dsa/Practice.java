import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class Practice {

    public static boolean isPalindrome(int n) {

        int copy = n;
        int rev = 0;

        while (n != 0) {
            rev = n % 10 + rev * 10;
            n = n / 10;
        }
        return rev == copy;

    }

    public static int largestDigit(int n) {

        int large = 0;
        while (n != 0) {
            int m = n % 10;
            if (large < m) {
                large = m;
            }
            n = n / 10;
        }
        return large;

    }

    public static int[] divisors(int n) {

        int[] arr = new int[n / 2 + 1];
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr[counter++] = i;
            }
        }
        int[] ans = Arrays.copyOf(arr, counter);
        return ans;

    }

    public static int[] divisorsOptimize(int n) {
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                result.add(i);
                if (i != n / i) {
                    result.add(n / i);
                }
            }
        }

        Collections.sort(result); // optional, to return in increasing order
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static boolean isArmstrong(int n) {

        int arm = 0;
        int copy = n;

        while (n != 0) {
            int m = n % 10;
            arm += m * m * m;
            n = n / 10;
        }
        return copy == arm;

    }

    public static int GCD(int n1, int n2) {

        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else if (n2 > n1) {
                n2 = n2 - n1;
            }
        }

        return n1;

    }

    public static void reverse(int[] arr, int n) {

        int[] rev = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            rev[n - i - 1] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = rev[i];
        }

    }

    public static int mostFrequentElement(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int maxfreq = 0;
        int maxEle = 0;

        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);

            } else {
                hm.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {

            int ele = e.getKey();
            int freq = e.getValue();

            if (maxfreq < freq) {
                maxfreq = freq;
                maxEle = ele;
            } else if (maxfreq == freq) {
                maxEle = Math.min(maxEle, ele);
            }

        }
        return maxEle;

    }

    public static int secondMostFrequentElement(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int maxFreq = 0;
        int maxEle = -1;
        int secondMaxEle = -1;
        int secMaxfreq = 0;

        for (int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            int ele = e.getKey();
            int freq = e.getValue();

            if (maxFreq < freq) {
                secMaxfreq = maxFreq;
                maxFreq = freq;
                secondMaxEle = maxEle;
                maxEle = ele;
            } else if (maxFreq == freq) {
                maxEle = Math.min(maxEle, ele);
            } else if (freq > secMaxfreq) {
                secMaxfreq = freq;
                secondMaxEle = ele;
            } else if (freq == secMaxfreq) {
                secondMaxEle = Math.min(secondMaxEle, ele);
            }

        }
        return secondMaxEle;

    }

    public static int sumHighestAndLowestFrequency(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;

        for (int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            // int key = e.getKey();
            int val = e.getValue();

            if (val > maxFreq) {
                maxFreq = val;
            }
            if (val < minFreq) {
                minFreq = val;
            }

        }

        return maxFreq + minFreq;
    }

    public static void reverseString(Vector<Character> s) {

        int i = 0;
        int j = s.size() - 1;
        while (i < j) {
            Character tmp = s.get(i);
            s.set(i, s.get(j));
            s.set(j, tmp);

            i++;
            j--;
        }
    }

    public boolean palindromeCheck(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static String largeOddNum(String s) {

        int lastoddeIndex = -1;

        for (int i = s.length() - 1; i >= 0; i--) {
            if ((s.charAt(i) - '0') % 2 != 0) {
                lastoddeIndex = i;
                break;
            }
        }

        int i = 0;
        while (i <= lastoddeIndex && s.charAt(i) == '0') {
            i++;
        }
        return s.substring(i, lastoddeIndex + 1);

    }

    public static String longestCommonPrefix(String[] str) {

        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length - 1];
        String commonString = "";

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {

            if (first.charAt(i) != last.charAt(i)) {
                break;
            } else {
                commonString += first.charAt(i);
            }

        }
        return commonString;

    }

    public int NnumbersSum(int N) {

        if (N == 0) {
            return 0;
        }

        return N + NnumbersSum(N - 1);

    }

    public long factorial(int n) {

        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);

    }

    public static int arraySumHelper(int nums[], int i) {
        int size = nums.length;

        if (i >= size) {
            return 0;
        }
        return nums[i] + arraySumHelper(nums, i + 1);
    }

    public static int arraySum(int nums[]) {

        return arraySumHelper(nums, 0);
    }

    public static void reverseStringHelper(Vector<Character> s, int i, int j) {

        if (i >= j) {
            return;
        }

        char tmp = s.get(i);
        s.set(i, s.get(j));
        s.set(j, tmp);
        reverseStringHelper(s, i + 1, j - 1);

    }

    public static Vector<Character> reverseStringRecursive(Vector<Character> s) {

        int i = 0;
        int j = s.size() - 1;

        reverseStringHelper(s, i, j);
        return s;

    }

    public static boolean palindromeCheckHelper(String s, int i, int j) {

        if (i >= j) {
            return true;
        }

        if (s.charAt(i) != s.charAt(j)) {
            return false;
        }

        return palindromeCheckHelper(s, i + 1, j - 1);

    }

    public static boolean palindromeCheckRecursive(String s) {

        return palindromeCheckHelper(s, 0, s.length() - 1);

    }

    public static boolean isPrime(int num, int i) {

        // If we've checked all numbers from 2 up to √num and none divide num, then num
        // is prime.
        // Optimization: If a number num has a factor greater than √num,
        // it must also have a corresponding factor smaller than √num, so we don't need
        // to go beyond that.
        if (i > Math.sqrt(num)) {
            return true;
        }
        if (num < 2) {
            return false;
        }

        if (num % i == 0) {
            return false;
        }
        return isPrime(num, i + 1);
    }

    public static boolean checkPrime(int num) {

        return isPrime(num, 2);

    }

    public int[] reverseArrayRecursive(int[] nums, int i, int j) {

        if (i > j) {
            return nums;
        }
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;

        return reverseArrayRecursive(nums, i + 1, j - 1);

    }

    public int[] reverseArray(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        return reverseArrayRecursive(nums, i, j);

    }

    public boolean isSortedRecursive(ArrayList<Integer> nums, int i, int j) {

        if (i >= nums.size()) {
            return true;
        }
        if (nums.get(i) > nums.get(j)) {
            return false;
        }

        return isSortedRecursive(nums, i + 1, j + 1);
    }

    public boolean isSorted(ArrayList<Integer> nums) {

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static int fibRecursive(int n) {

        if (n <= 1) {
            return n;
        }

        return fibRecursive(n - 1) + fibRecursive(n - 2);

    }

    public static int fib(int n) {

        if (n <= 1) {
            return n;
        }

        int f1 = 0;
        int f2 = 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = f1 + f2;
            f1 = f2;
            f2 = sum;
        }
        return sum;
    }

    public static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void printArry(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    public static int[] bubbleSort(int[] nums) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {

                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }

        }
        return nums;
    }

    public static int[] selectionSort(int[] nums) {

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int k = i;
            for (int j = i; j < n; j++) {
                if (nums[j] < nums[i]) {
                    k = j;
                }
            }
            swap(nums, i, k);
        }
        return nums;
    }

    public static int secondLargestElement(int[] nums) {

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (max1 < nums[i]) {
                max2 = max1;
                max1 = nums[i];
            } else if (max2 < nums[i] && max1 != nums[i]) {
                max2 = nums[i];
            }
        }
        return max2;

    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int maxcount = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++;
                maxcount = Math.max(maxcount, count);
            } else {
                count = 0;
            }
        }
        return maxcount;

    }

    public static void moveZeroes(int[] nums) {

        int j = -1;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) {
            return;
        }

        for (int i = j + 1; i < n; i++) {
            System.out.println(i);
            if (nums[i] != 0) {
                swap(nums, i, j);
                j++;
            }
        }
    }

    public int removeDuplicates(int[] nums) {

        int n = nums.length;
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }

        return j + 1;

    }

    public static int missingNumber(int[] nums) {

        int sum = 0;
        int n = nums.length;
        int value = n * (n + 1) / 2;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        int l = value - sum;
        return l;

    }

    public static int[] unionArray(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] nums3 = new int[n1 + n2 + 1];
        int n3 = nums3.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n1 && j < n2) {

            if (nums1[i] < nums2[j]) {
                nums3[k++] = nums1[i++];
            } else if (nums2[j] < nums1[i]) {
                nums3[k++] = nums2[j++];
            } else {
                nums3[k++] = nums1[i++];
                j++;
            }

            while (i < n1) {
                nums3[k++] = nums1[i++];
            }
            while (j < n2) {
                nums3[k++] = nums2[j++];
            }

        }
        return nums3;
    }

    public static void intersectionArray(int[] nums1, int[] nums2, int[] nums3) {

        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n1 && j < n2) {

            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                nums3[k++] = nums1[i++];
                j++;
            }
        }

    }

    public static ArrayList<Integer> leaders(int[] nums) {

        int size = nums.length;
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = size - 1; i >= 0; i--) {
            if (nums[i] > max) {
                max = nums[i];
                al.add(nums[i]);
            }
        }
        Collections.reverse(al);
        return al;
    }

    public static int longestConsecutive(int[] nums) {
        int max = 1;
        int count = 1;
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] == nums[i - 1] + 1) {
                count++;

                max = Math.max(max, count);
            } else {

                count = 1;
            }
        }

        return max;

    }

    public static int longestSubarray(int[] nums, int k) {
        int n = nums.length;

        int len = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];

                if (sum == k) {
                    len = Math.max(len, j - i + 1);
                }

            }
        }
        return len;

    }

    public static int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {

            int mid = (l + r) / 2;

            if (target == nums[mid]) {

                return mid;
            } else if (target > nums[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }

        }

        return -1;

    }

    public int lowerBound(int[] arr, int key) {
        int l = 0;
        int h = arr.length;
        while (l < h) {
            int mid = (l + h) / 2;
            if (arr[mid] < key) {
                l = mid + 1;
            } else {
                h = mid;
            }
        }
        return l;
    }

    public int upperBound(int[] arr, int key) {
        int l = 0;
        int h = arr.length;
        while (l < h) {
            int mid = (l + h) / 2;
            if (arr[mid] <= key) {
                l = mid + 1;
            } else {
                h = mid;
            }
        }
        return l;
    }

    public static int lowerBoundOptimal(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;
        int ans = nums.length;

        while (l <= r) {

            int mid = (l + r) / 2;

            if (target <= nums[mid]) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }

        }

        return ans;
    }

    public static int upperBoundOptimal(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;
        int ans = nums.length;

        while (l <= r) {

            int mid = (l + r) / 2;

            if (nums[mid] > target) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }

        }

        return ans;

    }

    public static int floor(int[] nums, int x) {

        int l = 0;
        int r = nums.length - 1;
        int ans = -1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] <= x) {
                ans = nums[mid];
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public static int ceil(int[] nums, int x) {

        int l = 0;
        int r = nums.length - 1;
        int ans = -1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] < x) {
                ans = nums[mid];
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    // public static int[] getFloorAndCeil(int[] nums, int x) {

    // int floor = -1;
    // int ceil = -1;

    // for(int i=0;i<nums.length;i++){

    // if(nums[i]<=x){
    // floor = nums[i];
    // if(floor>x){
    // break;
    // }
    // }
    // }

    // for(int i=0;i<nums.length;i++){

    // if(nums[i]>=x){
    // ceil = nums[i];
    // if(ceil>=x){
    // break;
    // }
    // }
    // }

    // return new int[]{floor,ceil};

    // }

    public static int[] getFloorAndCeil(int[] nums, int x) {
        int floor = -1;
        int ceil = -1;

        for (int num : nums) {
            if (num <= x) {
                floor = num; // keep updating as long as num <= x
            }
            if (ceil == -1 && num >= x) {
                ceil = num;
            }
        }

        return new int[] { floor, ceil };
    }

    public static int[] searchRange(int[] nums, int target) {

        int first = -1;
        int last = -1;
        int[] result = new int[2];
        int size = nums.length;

        for (int i = 0; i < size; i++) {

            if (nums[i] == target && first == -1) {
                first = i;
            } else if (first != -1 && last == -1 && nums[i] == target) {
                last = i;
            }

            result[0] = first;
            result[1] = last;

        }

        return new int[] { first, last };

    }

    public static int firstOccurance(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                ans = mid;
                r = mid - 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return ans;

    }

    public static int lastOccurance(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;
        int ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                ans = mid;
                l = mid + 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return ans;

    }

    public static int[] searchRangeOptimal(int[] nums, int target) {

        int first = firstOccurance(nums, target);
        int last = lastOccurance(nums, target);

        if (first == -1) {
            return new int[] { -1, -1 };
        }

        return new int[] { first, last };

    }

    public static int searchInrotatedSortedArray(int[] nums, int k) {

        // we need to use binary search every time we see search ans sorted key words
        // first we need to find which side is sorted left or right side for that
        // we where k blongs is it in right side or left side
        // if nums[l]<=k && k<nums[mid] that means k is in the left side of array and we
        // elemenate the right sub array
        // if nums[mid]<nums[r] && k<=nums[r] that means k is in the right side of the
        // array and we elemenate left sub array
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (nums[mid] == k) {
                return mid;
            }

            if (nums[l] <= nums[mid]) {
                if (nums[l] <= k && k < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (nums[mid] < k && k <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }

        }

        return -1;

    }

    public static boolean searchInARotatedSortedArrayII(ArrayList<Integer> nums, int k) {
        int l = 0;
        int r = nums.size() - 1;
        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (nums.get(mid) == k) {
                return true;
            }

            if (nums.get(l).equals(nums.get(mid)) && nums.get(mid).equals(nums.get(r))) {
                l = l + 1;
                r = r - 1;
                continue;
            }

            if (nums.get(l) <= nums.get(mid)) {
                if (nums.get(l) <= k && k < nums.get(mid)) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (nums.get(mid) < k && k <= nums.get(r)) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }

        }

        return false;
    }

    public int findMin(ArrayList<Integer> arr) {

        // this problem is very simple first we need to find which array is sorted left
        // half or right half
        // if left half is sorted that means we take a[l] which is minimum in left half
        // compare with min
        // and elemenate left half using l = mid+1 because we take the min value from
        // left half
        // if right half is sorted that means a[mid] is the minimum value so we take
        // this and compare with min
        // and elemenate right half using r= mid-1;

        int min = Integer.MAX_VALUE;
        int l = 0;
        int r = arr.size() - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr.get(mid) < min) {
                min = Math.min(min, arr.get(l));
                l = mid + 1;
            } else {
                min = Math.min(min, arr.get(mid));
                r = mid - 1;

            }
        }
        return min;
    }

    // This will solve using dutch National Flag Algorithm
    // this algorithm work like from 0 to low-1 all zeros ,from low to mid-1 all
    // ones ,from mid to high we have unsorted array
    // and from hight+1 to n-1 all are twos
    // we need to have three pointers low is at 0 ,mid at 0 because from 0th
    // elements all are unsorted and hight is at n-1
    //
    public void sortZeroOneTwo(int[] nums) {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {
                swap(nums, mid, low);
                mid++;
                low++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }

    }

    public static boolean lemonadeChange(int[] bills) {

        int fivebills = 0;
        int tenbills = 0;

        for (int bill : bills) {

            if (bill == 5) {
                fivebills += 1;
            } else if (bill == 10) {
                if (fivebills > 0) {
                    fivebills--;
                    tenbills++;
                } else {
                    return false;
                }
            } else {
                if (tenbills > 0 && fivebills > 0) {
                    tenbills--;
                    fivebills--;
                } else if (fivebills >= 3) {
                    fivebills -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;

    }

    public static boolean canJump(int[] nums) {

        int len = nums.length;
        int far = 0;

        for (int i = 0; i < len; i++) {
            if (nums[i] > far) {
                far = nums[i];
                far = Math.max(far, i + nums[i]);
                if (far >= len - 1) {
                    return true;
                }
            }
        }
        return false;

    }

    public static int maxScore(int[] cardScore, int k) {

        int lsum = 0;
        int rsum = 0;

        for (int i = 0; i < k; i++) {
            lsum += cardScore[i];
        }

        int maxsum = lsum;

        int rindex = cardScore.length - 1;

        for (int j = k - 1; j >= 0; j--) {

            lsum -= cardScore[j];
            rsum += cardScore[rindex--];

            maxsum = Math.max(maxsum, lsum + rsum);
        }

        return maxsum;

    }

    public static int longestNonRepeatingSubstring(String s) {

        int[] hash = new int[256];
        int n = s.length();
        int maxlen = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                if (hash[s.charAt(j)] == 1) {

                    break;
                }

                hash[s.charAt(j)] = 1;
                int len = j - i + 1;
                maxlen = Math.max(maxlen, len);

            }
        }
        return maxlen;

    }

    public static int longestNonRepeatingSubstringOptimal(String s) {

        int n = s.length();
        int maxlen = 0;
        HashSet<Character> seen = new HashSet<>();
        int l = 0;

        for (int r = 0; r < n; r++) {

            char currentChar = s.charAt(r);

            while (seen.contains(currentChar)) {
                seen.remove(s.charAt(l));
                l++;
            }
            seen.add(currentChar);
            maxlen = Math.max(maxlen, r - l + 1);

        }
        return maxlen;

    }

    /*
     * Function to find the length of the
     * longest substring with at most k zeros
     */
    public int longestOnesBrute(int[] nums, int k) {
        // Length of the input array
        int n = nums.length;

        // Maximum length of the substring
        int maxLen = 0;

        /*
         * Variable to count the number
         * of zeros in the current window
         */
        int zeros = 0;

        /*
         * Iterate through all possible
         * starting points of the substring
         */
        for (int i = 0; i < n; i++) {
            zeros = 0;

            /*
             * Expand the window from starting
             * point i to the end of the array
             */
            for (int j = i; j < n; j++) {
                if (nums[j] == 0) {

                    /*
                     * Increment zeros count
                     * when encountering a zero
                     */
                    zeros++;
                }

                /*
                 * If zeros count is within the
                 * allowed limit (k), update maxLen
                 */
                if (zeros <= k) {

                    // Calculate the length of substring
                    int len = j - i + 1;
                    maxLen = Math.max(maxLen, len);
                } else
                    break;
            }
        }

        // Return the maximum length
        return maxLen;
    }

    /*
     * Function to find the length of the
     * longest substring with at most k zeros
     */
    public int longestOnesBetter(int[] nums, int k) {

        // Length of the input array
        int n = nums.length;

        // Pointers for sliding window approach
        int l = 0, r = 0;

        /*
         * Variables to count zeros
         * and store maximum length
         */
        int zeros = 0, maxLen = 0;

        /*
         * Iterate through the array
         * using sliding window approach
         */
        while (r < n) {
            if (nums[r] == 0) {

                /*
                 * Increment zeros count
                 * when encountering a zero
                 */
                zeros++;
            }
            while (zeros > k) {
                if (nums[l] == 0) {

                    /*
                     * Decrement zeros count
                     * when moving left pointer
                     */
                    zeros--;
                }

                /*
                 * Move left pointer to the
                 * right to shrink the window
                 */
                l++;
            }

            /*
             * Calculate the length
             * of current substring
             */
            int len = r - l + 1;

            /*
             * Update maxLen if the current
             * substring length is greater
             */
            maxLen = Math.max(maxLen, len);

            /*
             * Move right pointer
             * to expand the window
             */
            r++;
        }

        // Return the maximum length
        return maxLen;
    }

    public static void merge(int[] arr, int l, int mid, int h) {

        // In merge sort what we do is try to merge two list from single list
        // for example if we have two list then find which is smallest add into auxilary
        // list
        // in this algo from single list we divide the list into two half and then
        // merge one by one in returning time
        //
        int i = l;
        int k = l;
        int j = mid + 1;
        int[] b = new int[h - l + 1];

        while (i <= mid && j <= h) {
            if (arr[i] <= arr[j]) {
                b[k++] = arr[i++];
            } else {
                b[k++] = arr[j++];
            }

        }
        for (; i <= mid; i++) {
            b[k++] = arr[i];
        }
        for (; j <= h; j++) {
            b[k++] = arr[j];
        }

        for (i = l, k = 0; i <= h; i++, k++) {
            arr[i] = b[k];
        }
    }

    public static void imerge(int[] a, int n) {

        int lastSize = 0;
        for (int size = 1; size < n / 2; size = size * 2) {
            lastSize = size;
            for (int l = 0, h = 2 * size; h < n - 1; l = h + 1, h = l + 2 * size - 1) {
                merge(a, l, (l + h) / 2, h);
            }
        }
        if (2 * lastSize < n) {
            merge(a, 0, 2 * lastSize - 1, n - 1);
        }
    }

    public static void iterativeMergeSort(int[] arr) {
        int n = arr.length;

        // size = 1, 2, 4, 8 ...
        for (int size = 1; size < n; size *= 2) {
            for (int left = 0; left < n - size; left += 2 * size) {
                int mid = left + size - 1;
                int right = Math.min(left + 2 * size - 1, n - 1);

                merge(arr, left, mid, right);

                // Visualize after each merge
                System.out.println("Merged [" + left + ", " + right + "]: " + Arrays.toString(arr));
            }
            System.out.println("---- After pass with size = " + size + " ----");
        }
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> mpp = new HashMap<>();
        int size = nums.length;

        for (int i = 0; i < size; i++) {
            int num = nums[i];
            int moreNeeded = target - num;

            if (mpp.containsKey(moreNeeded)) {
                return new int[] { mpp.get(moreNeeded), i };
            }

            mpp.put(num, i);

        }
        return new int[] { -1, -1 };

    }

    public boolean twoSumOptimal(int[] a, int target) {

        int left = 0, right = a.length - 1;

        while (left < right) {

            int sum = a[left] + a[right];

            if (sum == target) {

                return true;

            } else if (sum < target) {

                left++; // Need a bigger sum

            } else {

                right--; // Need a smaller sum

            }
        }
        return false;
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        int size = nums.length;
        Set<List<Integer>> tripletSet = new HashSet<>();

        for (int i = 0; i < size - 2; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                for (int k = j + 1; k < size; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> tmp = new ArrayList<>();
                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(nums[k]);
                        Collections.sort(tmp);
                        tripletSet.add(tmp);
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(tripletSet);
        return ans;
    }

    public static List<List<Integer>> threeSumOptimal(int[] nums) {

        Set<List<Integer>> triplets = new HashSet<>();

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            Set<Integer> hashset = new HashSet<>();
            for (int j = i + 1; j < n; j++) {

                int third = -(nums[i] + nums[j]);

                if (hashset.contains(third)) {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[i]);
                    tmp.add(nums[j]);
                    tmp.add(third);

                    Collections.sort(tmp);
                    triplets.add(tmp);

                }
                hashset.add(nums[j]);
            }
        }

        List<List<Integer>> ans = new ArrayList<>(triplets);

        return ans;

    }

    public static List<List<Integer>> threeSumO(int[] nums) {
        // Set to store unique triplets
        Set<List<Integer>> tripletSet = new HashSet<>();

        int n = nums.length;

        // Check all possible triplets
        for (int i = 0; i < n; i++) {
            // Set to store elements seen so far in the loop
            Set<Integer> hashset = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                // Calculate the 3rd element needed to reach 0
                int third = -(nums[i] + nums[j]);

                /*
                 * Find if third element exists in
                 * hashset (complements seen so far)
                 */
                if (hashset.contains(third)) {
                    // Found a triplet that sums up to target
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(third);

                    /*
                     * Sort the triplet to ensure
                     * uniqueness when storing in set
                     */
                    Collections.sort(temp);
                    tripletSet.add(temp);
                }

                /*
                 * Insert the current element
                 * into hashset for future checks
                 */
                hashset.add(nums[j]);
            }
        }

        // Convert set to list of lists (unique triplets)
        List<List<Integer>> ans = new ArrayList<>(tripletSet);

        // Return the ans
        return ans;
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {

        int n = nums.length;
        Set<List<Integer>> quadreplits = new HashSet();

        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int k = j + 1; k < n - 1; k++) {
                    for (int l = k + 1; l < n; l++) {
                        if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
                            List<Integer> tmp = new ArrayList<>();
                            tmp.add(nums[i]);
                            tmp.add(nums[j]);
                            tmp.add(nums[k]);
                            tmp.add(nums[l]);

                            Collections.sort(tmp);
                            ;
                            quadreplits.add(tmp);

                        }
                    }
                }
            }

        }

        List<List<Integer>> ans = new ArrayList<>(quadreplits);
        ;
        return ans;

    }

    public static List<List<Integer>> fourSumOptimal(int[] nums, int target) {

        int n = nums.length;
        Set<List<Integer>> quadreplits = new HashSet();

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                Set<Integer> hashset = new HashSet<>();
                for (int k = j + 1; k < n; k++) {

                    int four = target - (nums[i] + nums[j] + nums[k]);
                    if (hashset.contains(four)) {
                        List<Integer> tmp = new ArrayList<>();
                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(nums[k]);
                        tmp.add(four);

                        Collections.sort(tmp);
                        ;
                        quadreplits.add(tmp);

                    }
                    hashset.add(nums[k]);

                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(quadreplits);
        ;
        return ans;

    }

    public static int maxSubArray(int[] nums) {

        List<List<Integer>> tmp = new ArrayList<>();

        int n = nums.length;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            List<Integer> subarray = new ArrayList<>();
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (maxsum < sum) {
                    maxsum = sum;
                }

            }
        }

        return maxsum;

    }

    public static int maxSubArrayOptimal(int[] nums) {
        // using kadane's algorithm we don't have to cary -ve sum if during itration we
        // comeup with -ve some so we make it 0;

        int n = nums.length;
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int newStart = -1;
        int end = -1;

        for (int i = 0; i < n; i++) {
            if (sum == 0) {
                start = i;
            }
            sum += nums[i];

            if (sum > maxsum) {
                newStart = start;
                end = i;
                maxsum = Math.max(sum, maxsum);
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        return maxsum;

    }

    public int majorityElement(int[] nums) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        int[] maxArray = new int[max + 1];

        for (int i = 0; i < maxArray.length; i++) {
            maxArray[nums[i]]++;
        }

        int maxFreq = Integer.MIN_VALUE;
        for (int i = 0; i < maxArray.length; i++) {

            if (maxArray[i] > maxFreq) {
                maxFreq = maxArray[i];
            }

        }
        return maxFreq;
    }

    public int majorityElementBetter(int[] nums) {

        int size = nums.length;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int num : nums) {
            int count = hm.getOrDefault(num, 0) + 1;
            hm.put(num, count);
            if (count > size / 2) {
                return num;
            }

        }
        return -1;
    }

    public int majorityElementOptimal(int[] nums) {

        int size = nums.length;

        int ele = 0;
        int cnt = 0;

        for (int i = 0; i < size; i++) {

            if (cnt == 0) {
                cnt = 1;
                ele = nums[i];
            } else if (ele == nums[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }
        return ele;

    }

    public static List<Integer> majorityElementTwo(int[] nums) {

        int n = nums.length;
        int targetsize = n / 3;

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr.size() == 0 || arr.get(0) != nums[i]) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }
                if (count > targetsize) {
                    arr.add(nums[i]);

                }
            }
            if (arr.size() == 2) {
                break;
            }

        }

        return arr;

    }

    public static List<Integer> majorityElementTwoBetter(int[] nums) {

        int n = nums.length;
        int targetsize = n / 3;

        List<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {

            hm.put(nums[i], hm.getOrDefault(hm.get(nums[i]), 0) + 1);

            if (hm.get(nums[i]) > targetsize) {
                arr.add((nums[i]));
            }
            if (arr.size() == 2) {
                break;
            }

        }
        return arr;

    }

    public static int[] findMissingRepeatingNumbers(int[] nums) {

        int n = nums.length;
        int[] arr = new int[2];
        int sum = 0;

        Arrays.sort(nums);
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] == nums[i]) {
                arr[0] = nums[i];
            }
            sum += nums[i];

        }
        sum = sum + nums[0];
        int totalSum = n * (n + 1) / 2;
        int remaining = totalSum - sum + arr[0];

        arr[1] = remaining;

        return arr;

    }

    public static int[] findMissingRepeatingNumbersOptimal(int[] nums) {

        int n = nums.length;
        int[] arr = new int[2];
        int sum = 0;
        int squareSum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            squareSum = nums[i] * nums[i];

        }

        int totalSum = (n * (n + 1)) / 2;
        int totalSquareSum = (n * (n + 1) * (2 * n + 1)) / 6;

        int val1 = sum - totalSum;
        int val2 = squareSum - totalSquareSum;

        int sumxy = val2 / val1;

        int x = (sumxy + val1) / 2;
        int y = x - val1;
        arr[0] = x;
        arr[1] = y;
        return arr;

    }

    public static int smallestDivisor(int[] nums, int limit) {

        int n = nums.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        for (int i = 1; i <= max; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum += Math.ceil((double) nums[j] / i);

            }
            // System.out.println(sum);
            if (sum <= limit) {
                return i;
            }
        }
        return -1;

    }

    public static int smallestDivisorObtimalUsingBinarySearch(int[] nums, int limit) {

        int n = nums.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        int l = 1;
        int h = max;
        int ans = -1;
        while (l <= h) {
            sum = 0;
            int mid = (l + h) / 2;
            for (int j = 0; j < n; j++) {
                sum += Math.ceil((double) nums[j] / mid);
            }

            if (sum <= limit) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }

        }

        return -1;

    }

    public static int[] nextLargerElement(int[] arr) {

        int size = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[size];

        for (int i = size - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() >= ans[i])

                if (st.isEmpty()) {
                    ans[i] = -1;
                } else {
                    ans[i] = st.peek();
                }
            st.push(arr[i]);

        }
        return ans;
    }

    public static int[] nextLargerElementTwo(int[] arr) {

        int size = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[size];

        for (int i = 2 * size - 1; i >= 0; i--) {

            int index = i % size;
            while (!st.isEmpty() && arr[index] >= st.peek()) {
                st.pop();
            }

            if (i < size) {
                ans[index] = st.isEmpty() ? -1 : st.peek();
            }
            st.push(arr[index]);

        }
        return ans;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;
        int i = 0;
        int j = 0;
        int k = 0;
        double ans = 0;
        int[] nums3 = new int[n + m];

        while (i < n && j < m) {

            if (nums1[i] > nums2[j]) {
                nums3[k++] = nums2[j++];
            } else {
                nums3[k++] = nums1[i++];
            }

        }
        while (i < n) {
            nums3[k++] = nums1[i++];
        }
        while (j < m) {
            nums3[k++] = nums2[j++];
        }
        System.out.println(Arrays.toString(nums3));

        int r = (n + m) / 2;
        if ((m + n) % 2 == 0) {

            ans = ((nums3[r - 1] + nums3[r]) / 2.0);
        } else {
            ans = nums3[r];
        }

        return ans;

    }

    public static boolean checkDivisibility(int n) {

        int copy = n;
        int sum = 0;
        int product = 1;
        while (n != 0) {

            sum += n % 10;
            product *= n % 10;
            n = n / 10;
        }
        System.out.println(product);
        System.out.println(sum);

        System.out.println(n / product);
        if (copy % (sum + product) == 0) {
            return true;
        }
        return false;

    }

    public int maxMeetings(int[] start, int[] end) {

        int len = start.length;
        int count = 0;
        int startMeetingTime = 1;
        int endMeetingTime = 0;
        for (int i = 0; i < len; i++) {

            if (startMeetingTime < endMeetingTime && startMeetingTime >= endMeetingTime + 1) {
                count++;
                endMeetingTime = end[i];
                startMeetingTime = endMeetingTime + 1;
            }
        }
        return count;
    }

    public int longestOnes(int[] nums, int k) {
        // for this prblem we need to find no of zeros as k because we can flip 0s k
        // times
        // which is same as count zeros as ones so first count zeros and then check if
        // zeros > k
        // then move l until zeros <k move l++ and then find the size of window r-l+1

        int zeros = 0;
        int maxlen = 0;
        int l = 0;
        int r = 0;

        for (r = 0; r < nums.length; r++) {

            if (nums[r] == 0) {
                zeros++;
            }

            while (zeros > k) {
                if (nums[l] == 0) {
                    zeros--;
                }
                l++;
            }
            maxlen = Math.max(maxlen, r - l + 1);

        }
        return maxlen;

    }

    public int totalFruits(int[] fruits) {

        Set<Integer> st = new HashSet<>();
        int size = fruits.length;
        int maxlen = 0;
        for (int i = 0; i < size; i++) {

            for (int j = i; j < size; j++) {
                if (st.size() <= 2) {
                    st.add(fruits[i]);
                    maxlen = Math.max(maxlen, j - i + 1);
                } else {
                    break;
                }
            }

        }
        return maxlen;
    }

    public static int totalFruitsBetter(int[] fruits) {

        Map<Integer, Integer> mpp = new HashMap<>();
        int size = fruits.length;
        int maxlen = 0;
        int l = 0;

        for (int r = 0; r < size; r++) {

            mpp.put(fruits[r], mpp.getOrDefault(fruits[r], 0) + 1);

            if (mpp.size() > 2) {
                while (mpp.size() > 2) {
                    mpp.put(fruits[l], mpp.get(fruits[l]) - 1);
                    if (mpp.get(fruits[l]) == 0) {
                        mpp.remove(fruits[l]);
                    }
                    l++;

                }

            }

            maxlen = Math.max(maxlen, r - l + 1);

        }

        return maxlen;
    }


     public static int kDistinctChar(String s, int k) {
       
        int size = s.length();
        int maxlen = 0;
        int l = 0;
        int r;
        Map<Character,Integer> seen = new HashMap<>();

        for(r =0;r<size;r++){
            char ch = s.charAt(r);
           seen.put(ch, seen.getOrDefault(ch,0)+1);
            while(seen.size()>k){
                char cl = s.charAt(l);
                seen.put(cl,seen.getOrDefault(cl,0)-1);
                if(seen.get(cl)==0){
                    seen.remove(cl);
                }
                
                l++;
            }
            maxlen = Math.max(maxlen,r-l+1);
            
        }
        return maxlen;
    }

    public static int kDistinctCharOptimal(String s, int k) {
       
        Set<Character> seen = new HashSet<>();
        int left = 0, maxLength = 0;

    for (int right = 0; right < s.length(); right++) {
        char currentChar = s.charAt(right);

        if(seen.size()>k){
            while (seen.contains(currentChar)) {
            seen.remove(s.charAt(left));
            left++;
        }

        }
        
        seen.add(currentChar);
        maxLength = Math.max(maxLength, right - left + 1);
    }

    return maxLength;
    }

    public static void main(String[] args) {
        int n = 11291237;
        int primeN = 15;
        int fibN = 6;
        String str = "0214638";
        int[] arr = { 3, 2, 1, 4 };
        int[] maxCountArr = { 0, 0, 0, 0, 0, 0, 0, 0 };
        int[] moveZerosArr = { 0, 1, 4, 0, 5, 2 };
        int[] unionArray1 = { 1, 2, 3, 4, 5 };
        int[] unionArray2 = { 1, 2, 7 };
        int[] leaderArry = { 1, 2, 5, 3, 1, 2 };
        int[] longestConsecutive = { -7, 13, 4 };
        int[] longestSubarray = { 10, 5, 2, 7, 1, 9 };
        int[] binarySearchArray = { -1, 0, 3, 5, 9, 12 };
        // int target = -1;
        int k = 15;
        int x = 5;
        int[] lowerBoundArray = { 1, 2, 2, 3 };
        int[] upperBoundArray = { 1, 2, 2, 3 };
        int[] floorCeilArray = { 3, 4, 4, 7, 8, 10 };
        int[] searchRangeArray = { 5, 7, 7, 8, 8, 10 };
        int rangeTarget = 8;
        int[] searchInrotatedSortedArrayV = { 7, 8, 1, 2, 3, 3, 3, 4, 5, 6 };
        int rotatatedTarget = 3;
        int[] bills = { 5, 5, 10, 10, 20 };
        int[] canJump = { 3, 2, 1, 0, 4 };
        int[] cardScore = { 9, 10, 1, 2, 3, 5 };
        int cardScoreK = 5;
        String s = "abcddabac";
        int[] nums1 = { 0, 0, 0, 0, 0 };
        int[] nums2 = { -1, 0, 0, 0, 0, 0, 1 };
        int[] fruits = { 1, 2, 3, 2, 2 };

        Vector<Character> v = new Vector<>();
        v.add('h');
        v.add('e');
        v.add('l');
        v.add('l');
        v.add('o');
        String[] strArr = { "lady", "lazy" };
        int[] numsTwoSum = { 1, 6, 2, 10, 3 };
        int[] numsThreeSum = { 2, -2, 0, 3, -3, 5 };
        int[] numsFourSum = { 1, -2, 3, 5, 7, 9 };
        int target = 7;
        int[] maxSubnum = { 2, 3, 5, -2, 7, -4 };
        int[] majorityElementTwo = { 1, 2, 1, 1, 3, 2, 2 };
        int[] missingAndReapeting = { 6, 5, 7, 1, 8, 6, 4, 3, 2 };
        int[] smallestDivisor = { 8, 4, 2, 3 };
        String distictChar = "aababbcaacc";       // System.out.println(isPalindrome(n));
        // System.out.println(largestDigit(n));
        // System.out.println(Arrays.toString(divisors(6)));
        // System.out.println(divisorsOptimize(6));
        // System.out.println(isArmstrong(370));
        // System.out.println(GCD(9, 8));
        // System.out.println(mostFrequentElement(arr));
        // System.out.println(secondMostFrequentElement(arr));
        // System.out.println(sumHighestAndLowestFrequency(arr));
        // reverseString(v);

        // for(int i=0;i<v.size();i++){
        // System.out.print(v.get(i)+", ");
        // }
        // System.out.println();
        // System.out.println(largeOddNum(str));
        // System.out.println(longestCommonPrefix(strArr));

        // System.out.println(arraySum(arr));
        // System.out.println(reverseStringRecursive(v));
        // System.out.println(checkPrime(primeN));

        // System.out.println(fibRecursive(fibN));
        // System.out.println(fib(fibN));
        // selectionSort(arr);
        // printArry(arr,3 );

        // System.out.println(secondLargestElement(arr));
        // System.out.println(findMaxConsecutiveOnes(maxCountArr));
        // moveZeroes(moveZerosArr);
        // printArry(moveZerosArr, moveZerosArr.length);
        // System.out.println(Arrays.toString(unionArray(unionArray1, unionArray2)));
        // System.out.println(leaders(leaderArry));
        // System.out.println(longestConsecutive(longestConsecutive));
        // System.out.println(longestSubarray(longestSubarray, k));
        // System.out.println(search(binarySearchArray, target));

        // System.out.println(upperBoundOptimal(upperBoundArray, x));
        // System.out.println(lowerBoundOptimal(lowerBoundArray, x));
        // System.out.println(Arrays.toString(getFloorAndCeil(floorCeilArray, x)));
        // System.out.println(Arrays.toString(searchRangeOptimal(searchRangeArray,
        // rangeTarget)));
        // System.out.println(searchInrotatedSortedArray(searchInrotatedSortedArrayV,
        // rotatatedTarget));
        // System.out.println(lemonadeChange(bills));
        // System.out.println(canJump(canJump));
        // System.out.println(maxScore(cardScore,cardScoreK));
        // System.out.println(longestNonRepeatingSubstring(s));
        // System.out.println(Arrays.toString(twoSum(numsTwoSum, target)));
        // System.out.println(threeSum(numsThreeSum));
        // System.out.println(threeSumOptimal(numsThreeSum));
        // System.out.println(fourSum(numsFourSum, target));
        // System.out.println(fourSumOptimal(numsFourSum,target));

        // System.out.println(maxSubArrayOptimal(maxSubnum));

        // System.out.println(majorityElementTwo(majorityElementTwo));
        // System.out.println(Arrays.toString(findMissingRepeatingNumbers(missingAndReapeting)));
        // System.out.println(smallestDivisor(smallestDivisor,4));

        // System.out.println(findMedianSortedArrays(nums1,nums2));

        // System.out.println(checkDivisibility(99));
        System.out.println(totalFruitsBetter(fruits));
        System.out.println(kDistinctCharOptimal(distictChar, 2));

    }

}
