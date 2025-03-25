import java.util.*;

public class LargestCommanPrifix {

    public String longestCommonPrefix(String[] str) {
        String[] copy = str;
        String lcp = "";

        Arrays.sort(copy);
        String first = copy[0];
        String last = copy[copy.length - 1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {

            if (first.charAt(i) != last.charAt(i)) {
                return lcp;
            }
            lcp += first.charAt(i);
        }
        return lcp;
    }

    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }
        // Try all possible rotations of s
        for (int i = 0; i < s.length(); i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            System.out.println(s.substring(i) + s.substring(0, i));
            if (rotated.equals(goal)) {
                return true; // Return true if a match is found
            }
        }
        return false;

    }

    public boolean anagramStrings(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();

        Arrays.sort(charS);
        Arrays.sort(charT);

        return Arrays.equals(charS, charT);

    }

    public boolean anagramStringsOptimal(String s, String t) {
        // your code goes here
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

    public List<Character> frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        List<Character> sortedKeys = new ArrayList<>(hm.keySet());
        Collections.sort(sortedKeys);
        List<Integer> sortedValues = new ArrayList<>(hm.values());
        sortedValues.sort(Collections.reverseOrder());

        return sortedKeys;

    }

    public static void main(String[] args) {

        LargestCommanPrifix lcpt = new LargestCommanPrifix();
        System.out.println(lcpt.frequencySort("bbccddaaa"));
        // System.out.println(lcpt.anagramStrings("abcde", "cdeab"));
        // System.out.println(lcpt.rotateString("abcde", "abced"));

        // String[] input = {"flower", "flow", "flight"};
        // System.out.println(lcpt.longestCommonPrefix(input));

    }

}
