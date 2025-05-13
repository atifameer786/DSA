import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

public class StringProblmes {

    public static void reverseString(Vector<Character> s) {

        int l = 0;
        int r = s.size() - 1;
        while (l < r) {
            char tmp = s.get(l);
            s.set(l++, s.get(r));
            s.set(r--, tmp);
        }

    }

    public static void reverseStringOptimal(Vector<Character> s) {

        int l = 0;
        int r = s.size() - 1;
        Stack<Character> st = new Stack<>();
        Vector<Character> v = new Vector<>();

        for (char c : s) {
            st.push(c);
        }
        int i = 0;
        while (!st.isEmpty()) {
            s.set(i++, st.pop()); // update original vector in-place
        }

    }

    public static String largeOddNum(String s) {

        int size = s.length() - 1;
        int lastIndex = -1;
        for (int i = size; i >= 0; i--) {
            if (s.charAt(size) - '0' % 2 != 0) {
                lastIndex = i;
                break;
            }
        }
        int i = 0;
        if (lastIndex == -1) {
            return "";
        }
        while (s.charAt(i) == '0' && i <= lastIndex) {
            i++;
        }

        return s.substring(i, lastIndex + 1);

    }

    public String longestCommonPrefix(String[] str) {

        int size = str.length - 1;
        Arrays.sort(str);
        String first = str[0];
        String last = str[size];
        String commonString = "";

        for (int i = 0; i < Math.min(first.length() - 1, last.length() - 1); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                break;
            } else {
                commonString += first.charAt(i);
            }
        }
        return commonString;
    }

    public boolean rotateString(String s, String goal) {

        String commanString = s + s;
        if (s.length() != goal.length()) {
            return false;
        }
        if (commanString.contains(goal)) {
            return true;
        }
        return false;
    }

    public boolean anagramStrings(String s, String t) {

        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> hm = new HashMap<>();

        String str = s + t;

        for (char c : str.toCharArray()) {

            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {

            int val = entry.getValue();
            if (val % 2 != 0) {
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

    public List<Character> frequencySort(String s) {

        HashMap<Character,Integer> hm = new HashMap<>();

        for(char c:s.toCharArray()){
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }
        
    }

    public static void main(String[] args) {

        Vector<Character> str = new Vector<>(Arrays.asList('h', 'e', 'l', 'l', 'o'));
        String string = "0032579";
        System.out.println(largeOddNum(string));
        // reverseString(str);
        // reverseStringOptimal(str);
        // for (char c : str) {
        // System.out.print(c + ",");
        // }
        // System.out.println();
    }

}
