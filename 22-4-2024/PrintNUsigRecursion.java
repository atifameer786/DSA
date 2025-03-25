public class PrintNUsigRecursion {
    // static int x =0;
    public static int recursion(int n) {
        // int x =0;
        if (n > 0) {
                // x++;
            // System.out.println(n+"first");
            System.out.println(n);
            return recursion(n - 1);
        }
        return 0;
    }

    public static void main(String[] args) {

        int n = 5;
        // recursion(n);
        System.out.println(recursion(n));

    }

}
