import java.util.Scanner;

public class Check_Armstrong {
    public static boolean solve(int n) {
        int p = n;
        int m = 0;
        int arm = 0;
        int count = 0;
        while (p > 0) {
            m = p % 10;
            p = p / 10;
            count += 1;
        }
       
        p = n;
        
        while (p > 0) {
            m = p % 10;
            p = p / 10;
            // arm = arm + m^count;
            arm += Math.pow(m, count);
           

        } 
        return arm == n;

    }

    public static void main(String[] args) {
        // Write your code here
        // Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        int n = 371;
        // solve(n);
        System.out.println(solve(n));

    }
}
