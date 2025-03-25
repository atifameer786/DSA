public class ReverseNumber {
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {

            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        // Write your code here
        int n = -123;
        System.out.println(reverse(n));

    }
}
