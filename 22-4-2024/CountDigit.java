public class CountDigit {

    public static int countDigits(int n) {
        int m;
        int count = 0;
        int num = n;
        while (num > 0) {
            m = num % 10;
            if (m != 0 && n % m == 0) {
                count += 1;
            }
            num /= 10;
        }

        return count;

    }

    public static void main(String[] args) {
        int n = 660;
        System.out.println(countDigits(n));
        // countDigits(n);

    }

}
