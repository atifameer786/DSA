import java.util.Scanner;

public class nth_fabonacchi_number {

    

    public static int fib(int n) {
        int a1 = 1;
        int a2 = 1;
        int fib = 0;
        if (n == 1 || n == 2) {
            return 1;
        }
        for (int i = 3; i <= n; i++) {
            fib = a1 + a2;
            a1 = a2;
            a2 = fib;

        }
        return fib;

    }

    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Nth term");
        n = sc.nextInt();
        System.out.println(fib(n));
    }

}
