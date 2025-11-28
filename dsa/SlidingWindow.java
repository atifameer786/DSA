import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SlidingWindow {

    public static int maxScore(int[] cardScore, int k) {

        int lSum = 0;
        int rSum = 0;
        // Calculate the initial sum of the first k cards
        for (int i = 0; i < k; i++) {
            lSum += cardScore[i];
        }

        // initialize max sum with initial left sum
        int maxSum = lSum;
        int rIndex = cardScore.length - 1;

        // remove one elemnent from front and add one element from back and compare the
        // lsum+rsum with maxsum
        for (int j = k - 1; j >= 0; j--) {

            lSum -= cardScore[j];
            rSum += cardScore[rIndex--];

            maxSum = Math.max(maxSum, lSum + rSum);
        }
        return maxSum;
    }

    public static int longestNonRepeatingSubstring(String s) {
        // your code goes here
        int maxLen = 0;
        int size = s.length();

        for (int i = 0; i < size; i++) {

            int[] hash = new int[256];
            Arrays.fill(hash, 0);
            for (int j = i; j < size; j++) {
                if (hash[s.charAt(j)] == 1) {
                    break;
                }
                hash[s.charAt(j)] = 1;

                int len = j - i + 1;
                maxLen = Math.max(maxLen, len);

            }

        }
        return maxLen;
    }

    public int longestNonRepeatingSubstringOptimal(String s) {
        Set<Character> seen = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If character already in window, shrink from the left
            while (seen.contains(currentChar)) {
                seen.remove(s.charAt(left));
                left++;
            }

            seen.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
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
        Map<Character, Integer> seen = new HashMap<>();

        for (r = 0; r < size; r++) {
            char ch = s.charAt(r);
            seen.put(ch, seen.getOrDefault(ch, 0) + 1);
            while (seen.size() > k) {
                char cl = s.charAt(l);
                seen.put(cl, seen.getOrDefault(cl, 0) - 1);
                if (seen.get(cl) == 0) {
                    seen.remove(cl);
                }

                l++;
            }
            maxlen = Math.max(maxlen, r - l + 1);

        }
        return maxlen;
    }

    public static int kDistinctCharOptimal(String s, int k) {

        Set<Character> seen = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (seen.size() > k) {
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

    public int characterReplacement(String s, int k) {

       
        int maxlen = 0;
        int size = s.length();
        int maxFreq = 0;

        for(int i=0;i<size;i++){

            int[] hash = new int[26];
            for(int j = i;j<size;j++){

                hash[s.charAt(j)-'A']++;
                maxFreq = Math.max(maxFreq,hash[s.charAt(j)-'A']);
                int changes = (j-i+1) - maxFreq;

                if(changes<=k){
                    maxlen = Math.max(maxlen,j-i+1);
                }
                else{
                    break;
                }

            }

            
        }
        return maxlen;
        
    }

    public int characterReplacementBetter(String s, int k) {

       
        int maxlen = 0;
        int size = s.length();
        int maxFreq = 0;
        int l = 0;
        HashMap<Character,Integer> hm = new HashMap<>();

        for(int r=0;r<size;r++){
            char rch = s.charAt(r);
            hm.put(rch, hm.getOrDefault(rch, 0)+1);
            maxFreq = Math.max(maxFreq,hm.get(rch));

            int changes = (r-l+1) - maxFreq;
            while(changes>k){
                char lch = s.charAt(l);
                if(hm.get(lch)==0){
                    hm.remove(lch);
                }
                l++;
                maxlen = Math.max(maxlen,r-l+1);
            }
           
            
        }
        return maxlen;
        
    }

    // public String minWindow(String s, String t) {
        
    //     //your code goes here
    // }

    public static void main(String[] args) {

        int[] nums = { 9, 10, 1, 2, 3, 5 };
        int k = 5;
        String S = "abcddabac";

        System.out.println(maxScore(nums, k));

    }

}
