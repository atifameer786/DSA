public class Solution {
    public static int[] printNos(int x) {
        // Declaring empty integer array
        int[] ans = new int[x];

        // Calling recursive function
        recursiveFunction(x, ans);

        return ans;
    }

    public static void recursiveFunction(int x, int[] ans) {
        if (x == 0) {
            return;
        }

        // Call recursive function
        recursiveFunction(x - 1, ans);

        // Insert element in the array
        ans[x - 1] = x;
    }

    public static void main(String[] args) {
        int x = 3;
        // System.out.println(printNos(x));
        printNos(x);
    }

}