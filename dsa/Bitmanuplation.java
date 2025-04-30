import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bitmanuplation {

    public static int binaryToDecimal(String s) {

        int len = s.length();
        int num = 0;
        int p2 = 1;
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                num += p2;
            }
            p2 *= 2;
        }

        return num;
    }

    public static String decimaltoBinary(int d) {

        String result = "";
        while (d > 0) {
            result += d % 2;
            // if (d % 2 == 0) {
            // result += '0';
            // } else {
            // result += '1';
            // }
            d = d / 2;
        }

        return new StringBuilder(result).reverse().toString();
    }

    // if you want to find no of set bit (means 1s) in binary no we can use n &
    // (n-1)
    // if we have a binary no x need to right shift by k then we can use this
    // formula (x/2^k) pow()

    public static int countSetBit(int n) {
        int count = 0;

        while (n != 0) {
            count++;
            n = n & (n - 1);
            // n &= (n-1);
        }
        return count;
    }

    // Function to determine if the ith bit is set in N
    public static boolean isBitSet(int n, int i) {
        return (n & (1 << i)) != 0;
    }

    // Function to set the ith bit in N
    public static int setBit(int n, int i) {
        return n | (1 << i);
    }

    // Function to clear the ith bit in N
    public static int clearBit(int n, int i) {
        return n & ~(1 << i);
    }

    // Function to toggle the ith bit in N
    public static int toggleBit(int n, int i) {
        return n ^ (1 << i);
    }

    // Function to remove the last set bit
    public static int removeLastSetBit(int n) {
        return n & (n - 1);
    }

    // Function to determine if the number is a power of 2
    public static boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }

    // Given two integers start and goal. Flip the minimum number of bits of start
    // integer to convert it into goal integer.
    // A bits flip in the number val is to choose any bit in binary representation
    // of val and flipping it from either 0 to 1 or 1 to 0.
    public int minBitsFlip(int start, int goal) {

        // if we do start XOR goal that means when we have same bit 0 and opposite bit
        // as 1 that means if we found the change bit
        // then we can find the no of 1 which are only change bit in ans then calculate
        // no of set bit in ans;

        int ans = start ^ goal;
        int count = 0;
        // count no of set bit int ans ;
        while (ans != 0) {
            count++;
            ans &= (ans - 1);
        }
        return count;
    }

    // Given an array of nums of n integers. Every integer in the array appears
    // twice except one integer.
    // Find the number that appeared once in the array.

    public int singleNumber(int[] nums) {

        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        // Step 2: Create auxiliary array of size (max + 1)
        int[] arr = new int[max + 1];

        // Step 3: Count frequency
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }

        // Step 4: Find the number which appears only once
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                return i;
            }
        }

        return -1;
    }

    public int singleNumberOptimal(int[] nums) {
        //your code goes here
        int result =0;
        for(int num:nums){
            result^=num;
        }
        return result;
    }

    public static int singleNumberUsingMap(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // First pass: count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Second pass: find element with frequency 1
        for (int num : nums) {
            if (map.get(num) == 1) {
                return num;
            }
        }

        // If no such element exists
        return -1;
    }

    public int singleNumberThrice(int[] nums) {
        //your code goes here
        HashMap<Integer,Integer> hp = new HashMap<>();

        for(int num:nums){
            hp.put(num,hp.getOrDefault(num, 0)+1);
        }
        for(int num:nums){
            if(hp.get(num)==1){
                return num;
            }
        }
        return -1;
    }


    public static int[] bubbleSort(int[] nums) {
        boolean flag = false;
        int size = nums.length;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
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

    public static int singleNumberThriceBetter(int[] nums) {
        
        Arrays.sort(nums);
        int size = nums.length;

        for(int i=1;i<nums.length;i++){
            
            if(nums[i-1]!=nums[i]){
                return nums[i-1];
            }
            i+=2;
        }
        return nums[size-1];
    }


    public int[] singleNumberTwice(int[] nums) {        
        //your code goes here
        int size = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>(size);

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Store numbers that occur exactly once
        int[] result = new int[2];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result[index++] = entry.getKey();
                if (index == 2) break;
            }
        }

        

        // Sort result in ascending order
        if (result[0] > result[1]) {
            int temp = result[0];
            result[0] = result[1];
            result[1] = temp;
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "1101";
        int num = 83;
        int[] nums = {2, 2, 2, 3};
        // System.out.println(binaryToDecimal(s));
        // System.out.println(decimaltoBinary(num));

        // System.out.println(countSetBit(num));
        System.out.println(singleNumberThriceBetter(nums));

    }

}
