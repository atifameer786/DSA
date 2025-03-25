import java.util.Scanner;

public class SumOfEvenOdd {

    public static void sumOfEvenOdd(int n) {
        int m = 0;
        int even = 0;
        int odd = 0;
        while (n > 0) {
            m = n % 10;
            n = n / 10;
            if (m % 2 == 0) {
                even += m;
                System.out.println(even);
            } else {
                odd += m;
                System.out.println(odd);
            }
        }
        System.out.println(even + " " + odd);
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        sumOfEvenOdd(n);

    }

}
