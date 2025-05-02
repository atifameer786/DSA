import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
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

    public static void main(String[] args) {

        int[] nums = { 9, 10, 1, 2, 3, 5 };
        int k = 5;
        String S = "abcddabac";

        System.out.println(maxScore(nums, k));

    }

}
