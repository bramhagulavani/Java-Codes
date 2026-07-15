import java.util.Scanner;

public class Fibo {

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int result = fib(n);

        System.out.println("Fibonacci Number = " + result);

        sc.close();
    }
}