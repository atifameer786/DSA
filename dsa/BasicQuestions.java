import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

import java.util.Map;
import java.util.Vector;

public class BasicQuestions {

    public static int countDigit(int n) {

        int count = 0;

        while (n != 0) {
            // int m = n % 10;
            count += 1;
            n = n / 10;
        }
        return count;

    }

    public static int reverseNumber(int n) {

        if (n < 10) {
            return n;
        }

        int rev = 0;

        while (n != 0) {
            // int m = n % 10;
            rev = n%10 + rev * 10;
            n = n / 10;

        }
        return rev;

    }

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

        // An armstrong number is a number which is equal to the sum of the digits of the number, raised to the power of the number of digits.
        int copy = n;
        int arms = 0;
        while (n != 0) {
            int m = n % 10;
            arms += m * m * m;
            n = n / 10;
        }

        return arms == copy;

    }

    public static boolean isPerfect(int n) {

        // A perfect number is a number whose proper divisors add up to the number itself.

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
            // this loop removes leading zeros.
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
 * most important part in recursion is base case if j > size that means we reach the last element means all elements are sorted 
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
    public static int addDigit(int num){

          /**
 * this is mathmatical formula it will give you the result untile it became 1 single digit thats why we mod num by 9 
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
 * in fabonacii series most important is base condition n<=1 because series is like this 0,1,1,2,3,5,8,13
 * 
 */
        if(n<=1){
            return 1;
        }
        int f1 = 0;
        int f2 = 1;
        int sum =0;

        for(int i=2;i<=n;i++){
            sum = f1+f2;
            f1 = f2;
            f2 =sum;
        }
        return f2;

    }

    public static int fibRecursive(int n) {
          /**
 * in fabonacii series most important is base condition n<=1 because series is like this 0,1,1,2,3,5,8,13
 * recursive is very easy because what we need is privious two terms to get the next term so we can get by f(n-2)+f(n-1)
 */

        if(n<=1){
            return 1;
        }


        return fib(n-2)+fib(n-1);
        
        
    }

    public static int fun(int n){
        if(n<=0){
            return 0;
        }
        return fun(n-1)+n;
    }

    public static int[] bubbleSort(int[] arr){

         /**
 * Bubble Sort operates on the principle that, like a stone sinking in water,
 * heavier elements "sink" to the end of the array while lighter elements "bubble up."
 * In each pass, the largest unsorted element moves to its correct position at the end.
 * By reducing the comparison range with `n-1-i` in each inner loop, we avoid re-checking sorted elements.
 * The `flag` variable optimizes the process by stopping early if no swaps are needed, indicating 
 * the list is already sorted.
 */

        boolean flag = false;
        int size = arr.length;

        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=tmp;
                    flag=true;
                }
            }
            if(flag==false){
                return arr;
            }

        }
        return arr;
    }

    public static int[] selectionSort(int[] arr){

         // In selection sort we select the postion not element
        // and try to find out the element for that postion 
        // and find the smallest element from the array
        // in selection sort we sort elements from small to large 
        // but in bubble sort we sort elements from large to small
        // put all pointers all same postion and then move j by one position and check with k if a[j]<a[k] then bring k to the position of j;
        // after finding the smalles element we can swap with i with k 
        int size = arr.length;
        int i,j,k;
        for(i=0;i<size;i++){
            k = i;
            for(j=i;j<size;j++){
                if(arr[j]<arr[k]){
                    k = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[k];
            arr[k] =tmp;
        }
        return arr;
    }


    public static int[] insertionSort(int[] arr){
        int i;
        for(i=1;i<arr.length-1;i++){
            int j = i-1;
            int tmp = arr[i];

            while(arr[j]>tmp && j>-1){
                arr[j+1]=arr[j];
               j--;

            }
            arr[j+1] = tmp ;
        }
        return arr;
        
    }

    public static void merge(int[] arr,int l,int mid, int h){
        int i =l;
        int k = 0;
        int j = mid+1;
        int[] b= new int[h-l+1];


        while(i<=mid && j<=h){
            if(arr[i]<=arr[j]){
                b[k++] = arr[i++];
            }
            else{
                b[k++] = arr[j++];
            }

        }
        for(;i<=mid;i++){
            b[k++] = arr[i];
        }
        for(;j<=h;j++){
            b[k++] = arr[j];
        }

        for(i=l,k=0;i<=h;i++,k++){
            arr[i] = b[k];
        }
    }


    public static void mergeSort(int[] arr,int l,int h){
        
        int mid = (l+h)/2;
        if(l>=h){
            return;
        }

        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, h);
        merge(arr, l, mid, h);
    }

    


    public static void main(String[] args) {

        int n = 4;
        int m = 12345;
        int[] arr = { 4, 8, 7, 5 };
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
        mergeSort(arr, 0,arr.length-1);
        printArry(arr, n);

        
    }

}
