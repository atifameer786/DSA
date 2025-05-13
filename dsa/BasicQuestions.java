import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class BasicQuestions {

    // You are given an integer n. You need to return the number of digits in the number.
    public static int countDigit(int n) {

        int count = 0;

        while (n != 0) {
            // int m = n % 10;
            count += 1;
            n = n / 10;
        }
        return count;

    }

    // You are given an integer n. Return the integer formed by placing the digits of n in reverse order.
    public static int reverseNumber(int n) {

        if (n < 10) {
            return n;
        }

        int rev = 0;

        while (n != 0) {
            // int m = n % 10;
            rev = n % 10 + rev * 10;
            n = n / 10;

        }
        return rev;

    }

    // You are given an integer n. You need to check whether the number is a palindrome number or not.
    // Return true if it's a palindrome number, otherwise return false.
    public static boolean isPalindrome(int n) {

        int copy = n;
        int rev = 0;

        while (n != 0) {
            int m = n % 10;
            rev = m + rev * 10;
            n = n / 10;

        }
        return rev == copy;

    }

    public static int factorial(int n) {

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;

    }

    public static boolean isArmstrong(int n) {

        // An armstrong number is a number which is equal to the sum of the digits of
        // the number, raised to the power of the number of digits.
        // This is only for three digit number .
        int copy = n;
        int arms = 0;
        while (n != 0) {
            int m = n % 10;
            arms += m * m * m;
            n = n / 10;
        }

        return arms == copy;

    }

    public static boolean isArmstrongOptimal(int n) {
        int numDigits = String.valueOf(n).length();
        int sum = 0;
        int copy = n;


    
        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, numDigits);
            n /= 10;
        }
    
        return sum == copy;
    }

    public static boolean isPerfect(int n) {

        // A perfect number is a number whose proper divisors add up to the number
        // itself.

        int copy = n;
        int isper = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                isper += i;
            }
        }
        return copy == isper;

    }

    public static boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static int primeUptoN(int n) {

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                count += 1;
            }
        }
        return count;

    }

    public static int min(int x, int y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }

    public static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static int GCD(int n1, int n2) {

        int min = min(n1, n2);
        int gcd = 1;
        for (int i = 2; i <= min; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }

        }
        return gcd;

    }

    // Using Euclidean Algorithm (Recursive)
    public static int gcdRecursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdRecursive(b, a % b);
    }

    public int gcd(int n1, int n2) {

        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else if (n2 > n1) {
                n2 = n2 - n1;
            }
        }
        return n1;

    }

    public static int[] divisors(int n) {

        int[] arr = new int[n];
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr[counter++] = i;
            }
        }
        int[] ans = Arrays.copyOf(arr, counter);
        return ans;
    }

    public static int sum(int arr[], int n) {

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;

    }

    public static void reverse(int[] arr, int n) {

        int[] reverseArray = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            reverseArray[n - i - 1] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = reverseArray[i];
        }

    }

    public static void printArry(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    public static boolean arraySortedOrNot(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;

    }

    public static int countOdd(int[] arr, int n) {

        int oddCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount;
    }

    public static void hashtable() {
        Hashtable<Integer, String> hm = new Hashtable<>();
        hm.put(1, "ameer");
        hm.put(3, "tazeem");
        System.out.println(hm);
    }

    public static void frequencyOfArray(int arr[], int n) {

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            Integer c = hm.get(arr[i]);

            if (hm.get(arr[i]) == null) {
                hm.put(arr[i], 1);
            } else {
                hm.put(arr[i], ++c);
            }
        }
        System.out.println(hm);
    }

    static void createHashMap(int arr[]) {
        // Creates an empty HashMap
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        // Traverse through the given array
        for (int i = 0; i < arr.length; i++) {

            // Get if the element is present
            Integer c = hmap.get(arr[i]);

            // If this is first occurrence of element
            // Insert the element
            if (hmap.get(arr[i]) == null) {
                hmap.put(arr[i], 1);
            }

            // If elements already exists in hash map
            // Increment the count of element by 1
            else {
                hmap.put(arr[i], ++c);
            }
        }

        // Print HashMap
        System.out.println(hmap);
    }

    public static int sumHighestAndLowestFrequency(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int frequency = entry.getValue();
            if (frequency < min) {
                min = frequency;
            }
            if (frequency > max) {
                max = frequency;
            }
        }

        return min + max;
    }

    public static int mostFrequentElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        int maxele = 0;
        int maxfreq = 0;

        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int ele = entry.getKey();
            int freq = entry.getValue();
            if (freq > maxfreq) {
                maxfreq = freq;
                maxele = ele;
            } else if (freq == maxfreq) {
                maxele = Math.min(maxele, ele);
            }

        }
        return maxele;

    }

    public static int secondMostFrequentElement(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        int maxfreq = 0;
        int maxele = 0;

        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], i);
            }
        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int freq = entry.getKey();
            int ele = entry.getValue();

            if (freq > maxfreq) {
                maxfreq = freq;
            }
            if (ele > maxele) {
                maxele = Math.min(ele, maxele);
            }
        }
        return maxele;

    }

    public static void reverseString(Vector<Character> s) {

        int first = 0;
        int last = s.size() - 1;

        while (first < last) {
            char tmp = s.get(first);
            s.set(first, s.get(last));
            s.set(last, tmp);
            first++;
            last--;
        }

    }

    public static void swap(String s) {
        char tmp = s.charAt(0);
    }

    public static boolean palindromeCheck(String s) {
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

    public static boolean isStringPalindrome(String s) {
        String rev = "";
        String copy = s;
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        if (rev.equals(copy)) {
            return true;
        } else {
            return false;
        }
    }

    public static String largeOddNum(String s) {

        int lastOddIndex = -1;

        for (int i = s.length() - 1; i >= 0; i--) {
            // this loop iterates from right to left to find the rightmost odd digit.
            if ((s.charAt(i) - '0') % 2 != 0) {
                lastOddIndex = i;
                break;
            }
        }

        if (lastOddIndex == -1) {
            return "";
        }

        int i = 0;
        while (i <= lastOddIndex && s.charAt(i) == '0') {
            i++;
        }
        return s.substring(i, lastOddIndex + 1);

    }

    public static String longestCommonPrefix(String[] str) {
        String commonString = "";

        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length - 1];

        for (int i = 0; i < Math.min(first.length() - 1, last.length() - 1); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                break;

            } else {
                commonString += first.charAt(i);
            }

        }
        return commonString;

    }

    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String doubleString = s + s;
        if (doubleString.contains(goal)) {
            return true;
        }
        return false;

    }

    public static boolean anagramStrings(String s, String t) {
        String commanString = s + t;

        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < commanString.length(); i++) {
            if (hm.containsKey(commanString.charAt(i))) {
                hm.put(commanString.charAt(i), hm.get(commanString.charAt(i)) + 1);
            } else {
                hm.put(commanString.charAt(i), 1);
            }
        }
        System.out.println(hm);

        for (Map.Entry<Character, Integer> e : hm.entrySet()) {
            Integer i = e.getValue();
            if (e.getValue() % 2 != 0) {
                return false;
            }

        }
        return true;
    }

    public boolean anagramStringsOptimal(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }
        for (int i : count) {
            if (i != 0) {
                return false;
            }

        }
        return true;
    }   

    public static int numbersSum(int N) {

        if (N == 0) {
            return 0;
        }
        return numbersSum(N - 1) + N;
    }

    public static long recursiveFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return recursiveFactorial(n - 1) * n;
    }

    public static int arraySumHelper(int[] nums, int i) {
        int size = nums.length;

        if (i >= size) {
            return 0;
        }
        return nums[i] + arraySumHelper(nums, i + 1);

    }

    public static int arraySum(int[] nums) {

        return arraySumHelper(nums, 0);

    }

    public static void reverseStringHelper(Vector<Character> s, int left, int right) {
        if (left >= right) {
            return;
        }
        char tmp = s.get(left);
        s.set(left, s.get(right));
        s.set(right, tmp);
        reverseStringHelper(s, left + 1, right - 1);
    }

    // In the cases of recursion we need to write one helper funciton
    public static Vector<Character> reverseStringRecursion(Vector<Character> s) {

        int left = 0;
        int right = s.size() - 1;
        reverseStringHelper(s, left, right);
        return s;

    }

    public static boolean palindromeCheckHelper(String s, int left, int right) {

        if (left >= right) {
            return true;
        }
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return palindromeCheckHelper(s, left + 1, right - 1);

    }

    public static boolean palindromeCheckRecursion(String s) {

        return palindromeCheckHelper(s, 0, s.length() - 1);
    }

    public static boolean checkPrimeHelper(int num, int i) {

        if (num <= 1) {
            return false;
        }
        if (i * i > num) {
            return true;
        }
        if (num % i == 0) {
            return false;
        }

        return checkPrimeHelper(num, i + 1);
    }

    public static boolean checkPrime(int num) {

        return checkPrimeHelper(num, 2);

    }

    public static void reverseArrayHelper(int[] nums, int l, int r) {

        /**
         * when try to do riverse then always thing two pointer approch
         */
        if (l >= r) {
            return;
        }
        int tmp = nums[l];
        nums[l] = nums[r];
        nums[r] = tmp;
        reverseArrayHelper(nums, l + 1, r - 1);
    }

    public static int[] reverseArray(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        reverseArrayHelper(nums, l, r);
        return nums;

    }

    public static boolean isSortedHelper(ArrayList<Integer> nums, int i, int j) {

        /**
         * most important part in recursion is base case if j > size that means we reach
         * the last element means all elements are sorted
         */
        int size = nums.size();
        if (j >= size) {
            return true;
        }
        if (nums.get(i) > nums.get(j)) {
            return false;
        }
        return isSortedHelper(nums, i + 1, j + 1);
    }

    public static boolean isSorted(ArrayList<Integer> nums) {
        int size = nums.size() - 1;
        int i = 0;
        int j = i + 1;
        return isSortedHelper(nums, i, j);
    }

    public static int addDigitsRecursive(int num) {
        if (num < 10) {
            return num;
        }
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return addDigitsRecursive(sum);

    }
    public int addDigits(int num) {
        
        while(num>=10){
            int sum = 0;
            
            while (num>0) {
            sum += num%10;
            num = num/10;
                
            }
            num = sum;
            
        }
        return num;
    }

    public static int addDigit(int num) {

        /**
         * this is mathmatical formula it will give you the result untile it became 1
         * single digit thats why we mod num by 9
         */

        if (num == 0) {
            return 0;
        }

        int remainder = num % 9;

        if (remainder == 0) {
            return 9;
        } else {
            return remainder;
        }

    }

    public static int fib(int n) {

        /**
         * in fabonacii series most important is base condition n<=1 because series is
         * like this 0,1,1,2,3,5,8,13
         * 
         */
        if (n <= 1) {
            return 1;
        }
        int f1 = 0;
        int f2 = 1;
        int sum = 0;

        for (int i = 2; i <= n; i++) {
            sum = f1 + f2;
            f1 = f2;
            f2 = sum;
        }
        return f2;

    }

    public static int fibRecursive(int n) {
        /**
         * in fabonacii series most important is base condition n<=1 because series is
         * like this 0,1,1,2,3,5,8,13
         * recursive is very easy because what we need is privious two terms to get the
         * next term so we can get by f(n-2)+f(n-1)
         */

        if (n <= 1) {
            return 1;
        }

        return fib(n - 2) + fib(n - 1);

    }

    public static int fun(int n) {
        if (n <= 0) {
            return 0;
        }
        return fun(n - 1) + n;
    }

    public static int[] bubbleSort(int[] arr) {

        /**
         * Bubble Sort operates on the principle that, like a stone sinking in water,
         * heavier elements "sink" to the end of the array while lighter elements
         * "bubble up."
         * In each pass, the largest unsorted element moves to its correct position at
         * the end.
         * By reducing the comparison range with `n-1-i` in each inner loop, we avoid
         * re-checking sorted elements.
         * The `flag` variable optimizes the process by stopping early if no swaps are
         * needed, indicating
         * the list is already sorted.
         */

        boolean flag = false;
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = true;
                }
            }
            if (flag == false) {
                return arr;
            }

        }
        return arr;
    }

    public static int[] selectionSort(int[] arr) {

        // In selection sort we select the postion not element
        // and try to find out the element for that postion
        // and find the smallest element from the array
        // in selection sort we sort elements from small to large
        // but in bubble sort we sort elements from large to small
        // put all pointers i,j,k at same postion and then move j by one position and
        // check
        // with k if a[j]<a[k] then bring k to the position of j;
        // after finding the smalles element we can swap with i with k // int i=0;
        // j=0;
        // k=0;
        int size = arr.length;
        int i, j, k;
        for (i = 0; i < size; i++) {
            k = i;
            for (j = i; j < size; j++) {
                if (arr[j] < arr[k]) {
                    k = j;
                }
            }
            swap(arr, i, k);
            // int tmp = arr[i];
            // arr[i] = arr[k];
            // arr[k] = tmp;
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        int i;
        for (i = 1; i < arr.length - 1; i++) {
            int j = i - 1;
            int tmp = arr[i];

            while (arr[j] > tmp && j > -1) {
                arr[j + 1] = arr[j];
                j--;

            }
            arr[j + 1] = tmp;
        }
        return arr;

    }

    public static void merge(int[] arr, int l, int mid, int h) {

        // In merge sort what we do is try to merge tow list from single list
        // for example if we have two list then find which is smallest add into auxilary
        // list
        // in this algo from single list we divide the list into two half and then
        // merge one by one in returning time
        //
        int i = l;
        int k = 0;
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

    public static void mergeSort(int[] arr, int l, int h) {

        int mid = (l + h) / 2;
        if (l >= h) {
            return;
        }

        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, h);
        merge(arr, l, mid, h);
    }

    public static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static int partition(int[] arr, int l, int h) {

        // in quick sort we use pivot and partition process
        // find the pivot from left side 0th element
        // from first while loop try to find the number which is smaller then pivot
        // becasue loop will continue until it find the number which is smaller then
        // pivoit form right side
        // second while loop is try to find the number which is greater then pivoit in
        // left side and
        // while loop continue untile it find the number small then pivot

        int i = l;
        int j = h;
        int pivot = arr[l];

        while (i < j) {

            while (i < j && pivot <= arr[j]) {
                j--;
            }
            while (i < j && pivot >= arr[i]) {
                i++;
            }
            if (i < j) {
                swap(arr, i, j);
            }

        }
        // put the pivot element in its correct postion
        swap(arr, l, j);
        return j;
    }

    public static void quickSort(int[] arr, int l, int h) {

        if (l < h) {
            int pivotIndex = partition(arr, l, h);
            quickSort(arr, l, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, h);

        }

    }

    public static int secondLargestElementWithDuplicates(int[] nums) {
        // in first step copy max1 into max2 for tracking purpose and in second step
        // check if the number is not max1 and also nums[i]>max2;

        int size = nums.length;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < size - 1; i++) {
            if (nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] > max2 && nums[i] != max1) {
                max2 = nums[i];
            }
        }

        return max2 == Integer.MIN_VALUE ? -1 : max2;

    }

    // if there are no duplicates in the array then we can use bubble sort to find
    // 2nd largets element from the array
    public static int secondLargestElement(int[] nums) {

        int size = nums.length;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
        }

        return nums[size - 2];

    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                count++;
                maxCount = max(count, maxCount);
            } else {
                count = 0;
            }
        }

        return maxCount;

    }

    public static void rotateArrayByOne(int[] nums) {

        int size = nums.length - 1;
        int tmp = nums[0];
        for (int i = 0; i < size; i++) {
            nums[i] = nums[i + 1];
        }
        nums[size] = tmp;

    }

    public static void moveZeroes(int[] nums) {

        int j = -1;
        int size = nums.length;
        // find the position of first 0 so that put j where the firs 0 is found and then
        // start comparing from non zero elementes
        for (int i = 0; i < size; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        // move i and j if it found non zero element but before moving j swap j with i
        // j start form j+1 because we only need to move zeros so we don't need to check
        // thos element which are before first zero
        for (int i = j + 1; i < size; i++) {

            if (nums[i] != 0) {
                swap(nums, i, j);
                j++;

            }
        }

    }

    public static int removeDuplicates(int[] nums) {

        Set<Integer> s = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            s.add(nums[i]);
        }
        return s.size();
    }

    public static int removeDuplicatesOptimal(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }
        int j = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }

    public static int missingNumber(int[] nums) {

        // find the sum of first n natural numbers and then subtract the sum of elements
        // of array
        int sum = 0;
        int n = nums.length;
        int value = n * (n + 1) / 2;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        int l = value - sum;
        return l;

    }

    public static void unionArray(int[] nums1, int[] nums2, int[] nums3) {

        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n1 && j < n2) {

            if (nums1[i] < nums2[j]) {
                nums3[k++] = nums1[i++];
            } else if (nums1[i] > nums2[j]) {
                nums3[k++] = nums2[j++];
            } else {
                nums3[k++] = nums1[i++];
                j++;
            }
        }
        while (i < n1) {
            nums3[k++] = nums1[i++];
        }
        while (j < n2) {
            nums3[k++] = nums2[j++];
        }

        // return nums3;

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

        ArrayList<Integer> al = new ArrayList<>();
        int size = nums.length;

        // leader should be the one where each element to the right of that must be
        // smaller to that
        // for example this [1, 2, 5, 3, 1, 2] 5,3,2 are leaders because no element on
        // their right are greater then them
        // we can check from left if we found any single element greater to the right
        // side then we can not add to the list

        for (int i = 0; i < size; i++) {
            boolean leader = true;
            for (int j = i + 1; j < size; j++) {
                if (nums[j] >= nums[i]) {
                    leader = false;
                    break;
                }

            }
            if (leader) {
                al.add(nums[i]);
            }
        }

        return al;

    }

    public static ArrayList<Integer> leadersOptimal(int[] nums) {

        // leader should be the one where each element to the right of that must be
        // smaller to that
        // for example this [1, 2, 5, 3, 1, 2] 5,3,2 are leaders because no element on
        // their right are greater then them
        // in this approch we need to check from right side if any element a[i] > max
        // then this must be leader

        ArrayList<Integer> al = new ArrayList<>();
        int size = nums.length;

        int max = Integer.MIN_VALUE;
        for (int i = size - 2; i >= 0; i--) {
            if (nums[i] > max) {
                max = nums[i];
                al.add(nums[i]);
            }
        }

        return al;

    }

    public static int dominantIndex(int[] nums) {

        int max = Integer.MIN_VALUE;
        int index = -1;
        boolean flag = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (max < nums[j] * 2) {
                flag = true;
            }

        }
        if (flag) {
            return -1;
        }
        return index;

    }

    public static int[] rearrangeArray(int[] nums) {

        int size = nums.length;
        int[] nums1 = new int[size / 2];
        int[] nums2 = new int[size / 2];
        int j = 0;
        int k = 0;

        for (int i = 0; i < size; i++) {
            if (nums[i] > 0) {
                nums2[j++] = nums[i];

            } else {
                nums1[k++] = nums[i];

            }
        }

        for (int i = 0; i < size / 2; i++) {
            nums[2 * i] = nums2[i];
            nums[2 * i + 1] = nums1[i];
        }

        return nums;

    }

    public static int[] rearrangeArrayOptimal(int[] nums) {

        int size = nums.length;
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            if (nums[i] > 0) {
                arr[2 * i] = nums[i];
            } else {
                arr[2 * i + 1] = nums[i];
            }
        }

        return arr;
    }

    public static int minElement(int[] arr) {

        int min = Integer.MAX_VALUE;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;

    }

    public static int maxElement(int[] arr) {

        int max = Integer.MIN_VALUE;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;

    }

    public static int average(int a, int b) {

        int averageNumber = (a + b) / 2;
        return averageNumber;

    }

    // public static int[] removeMinMax(int[] a,int[] b,int max,int min){

    // int size = a.length;

    // for(int i=0;i<size;i++){
    // if(a[i]!=min && a[i]!=max){
    // b[i] = a[i];
    // }
    // }

    // }

    public static int[] addAverage(int[] a, int[] b) {

        for (int i = 0; i < a.length; i++) {
            int av = average(minElement(a), maxElement(a));
            if (av != minElement(a) && av != maxElement(a))
                ;
            b[i] = av;

        }

        return b;
    }

    public static int minAverage(int[] arr) {

        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }

        Collections.sort(list);

        int i = 0;
        int j = list.size() - 1;
        List<Integer> averageList = new ArrayList<>();

        while (i < j) {
            int min = Collections.min(list);
            int max = Collections.max(list);
            int av = (min + max) / 2;
            averageList.add(av);

            list.remove(i);
            list.remove(j);
            i++;
            j--;
        }

        return Collections.min(averageList);
    }

    // public static int[] ave(int[] arr){

    // int size = arr.length;

    // int[] a = new int[size];
    // int i=0;

    // return a;

    // }

    // public int[] twoSum(int[] nums, int target) {

    // int sum = 0;
    // int size = nums.length;
    // for(int i=0;i<size;i++){

    // }

    // }

    public static int nCr(int c, int r) {

        if (r > c - r) {
            r = c - r;
        }
        if (c == 1 || r == 1) {
            return 1;
        }

        int result = 1;
        for (int i = 0; i < r; i++) {

            result *= (c - 1);
            result /= (i + 1);
        }

        return result;
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> mpp = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            int num = nums[i];
            int moreNeeded = target - num;

            if (mpp.containsKey(moreNeeded)) {
                return new int[] { mpp.get(moreNeeded), i };
            }
            mpp.put(num, i);
        }
        return new int[] { -1, -1 };
    }

    public static int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (nums[mid] == target) {
                return nums[mid];
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }

        }
        return -1;

    }

    public static int searchInsert(int[] nums, int target) {

        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return size;

    }

    public static int[] getFloorAndCeil(int[] nums, int x) {

        int ceil = -1;
        int floor = -1;
        int size = nums.length;

        for (int i = 0; i < size; i++) {

            if (nums[i] <= x) {
                floor = nums[i];
                if (floor > x) {
                    break;
                }
            }

            if (nums[i] >= x) {
                ceil = nums[i];
                if (ceil >= x) {
                    break;
                }
            }
        }
        // ll.add(floor);
        // ll.add(ceil);
        // System.out.println(ll.get(0));
        // System.out.println(ll.get(1));
        System.out.println(floor + "floor");
        System.out.println(ceil + "ceil");

        return new int[] { floor, ceil };

    }

    /**
     * Given an array of integers nums sorted in non-decreasing order, find the
     * starting and ending position of a given target value.
     * If the target is not found in the array, return [-1, -1].
     * nput: nums = [5, 7, 7, 8, 8, 10], target = 8
     * Output: [3, 4]
     * Explanation:The target is 8, and it appears in the array at indices 3 and 4,
     * so the output is [3,4]
     */

    public int[] searchRange(int[] nums, int target) {

        int size = nums.length;
        int first = -1;
        int last = -1;
        int[] arr = new int[2];
        for (int i = 0; i < size; i++) {
            if (nums[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        arr[0] = first;
        arr[1] = last;

        return new int[] { first, last };

    }


    // public List<String> generateParenthesis(int n) {
        
    //     for(int i=0;i<n;i++){
            
    //     }
    // }

    // public List<List<Integer>> powerSet(int[] nums) {
        
    // }

    class ListNode {
        int val; 
        ListNode next; 
        ListNode(int data1) {
            val = data1;
            next = null;
        }
    
        ListNode(int data1, ListNode next1) {
            val = data1;
            next = next1;
        }
    }

    public List<Integer> LLTraversal(ListNode head) {

        ListNode tmp = head;
        List<Integer> ans = new ArrayList<>();

        while(tmp!=null){
            ans.add(tmp.val);
            tmp = tmp.next;
        }

        return ans;

    }

    static boolean isBalanced(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        int size = s.length();
        for(int i=0;i<size;i++){
            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }
            else{
                char top = st.pop();
                if(s.charAt(i)=='}' && top !='{' || s.charAt(i)==']' && top !='[' || s.charAt(i)==')' && top !='('){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    

    public static void main(String[] args) {

        int n = 4;
        int r = 2;
        int m = 12345;
        int[] arr = { 2, 4, 6, 8, 10, 12, 14 };
        int[] resultArray = getFloorAndCeil(arr, 1);
        System.out.println(resultArray[0] + "            " + resultArray[1]);
        int ln = arr.length;
        int[] nums1 = { 1, 2, 3, 5, 17 };
        int[] nums2 = { 7, 8, 3, 4, 15, 13, 4, 1 };
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] arr3 = new int[n2];
        int[] nums3 = new int[n1 + n2];

        int[] nums = { 2, 4, 5, -1, -3, -4 };

        // int n2 = nums2.length;
        // int n1 = nums1.length - n2;

        Vector v = new Vector<>(Arrays.asList('a', 'b', 'c', 'd', 'e'));
        String s = "dog";
        String goal = "cat";
        String num = "0214638";
        String[] str = { "flowers", "flow", "fly", "flight" };
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(11);
        l.add(10);
        // v.add('a');
        // v.add('b');
        // v.add('c');

        // System.out.println(countDigit(n));
        // System.out.println(reverseNumber(n));
        // System.out.println(isPalindrome(n));
        // System.out.println(factorial(n));
        // System.out.println(isArmstrong(n));
        // System.out.println(isPerfect(n));
        // System.out.println(isPrime(n));
        // System.out.println(primeUptoN(n));
        // System.out.println(GCD(n, m));
        // System.out.println(Arrays.toString(divisors(n)));
        // System.out.println(sum(arr, n));
        // reverse(arr, n);
        // printArry(arr, n);
        // hashtable();
        // frequencyOfArray(arr, n);
        // createHashMap(arr);
        // System.out.println(mostFrequentElement(arr));
        // reverseString(v);
        // System.out.println(v);
        // System.out.println(palindromeCheck(s));
        // System.out.println(isStringPalindrome(s));
        // System.out.println(largeOddNum(num));
        // System.out.println(longestCommonPrefix(str));
        // System.out.println(rotateString(s, goal));
        // System.out.println(anagramStrings(s, goal));
        // System.out.println(numbersSum(n));
        // System.out.println(recursiveFactorial(n));
        // System.out.println(arraySum(arr));
        // System.out.println(reverseStringRecursion(v));
        // System.out.println(checkPrime(m));
        // System.out.println(Arrays.toString(reverseArray(arr)));
        // System.out.println(isSorted(l));
        // System.out.println(addDigitsRecursive(m));
        // System.out.println(addDigit(m));
        // System.out.println(fib(n));
        // System.out.println(fun(5));
        // bubbleSort(arr);
        // printArry(arr, n);
        // selectionSort(arr);
        // insertionSort(arr);
        // mergeSort(arr, 0, arr.length - 1);
        // printArry(arr, n);

        // System.out.println(secondLargestElement(nums2));
        // System.out.println(findMaxConsecutiveOnes(nums));
        // printArry(nums3, nums3.length);
        // rotateArrayByOne(nums);
        // moveZeroes(arr);
        // printArry(arr, ln);
        // System.out.println(removeDuplicates(nums));
        // unionArray(nums1, nums2,nums3);
        // intersectionArray(nums1, nums2, nums3);
        // leaders(nums);

        // printArry(nums3, nums3.length);

        // System.out.println(dominantIndex(nums));
        // System.out.println(Arrays.toString(rearrangeArrayOptimal(nums)));

        // minAverage(nums2);

        // System.out.println(Arrays.toString(nums2));

        // System.out.println(maxElement(arr3));
        // System.out.println(minElement(nums2));

        // System.out.println(nCr(n-1, r-1));

    }

}
