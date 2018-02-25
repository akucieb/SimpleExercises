public class Fibonacci {

    public static int fibonacciRecursive(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Number must be greater than 0");
        if (n <= 1)
            return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacci(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Number must be greater than 0");

        if (n <= 1)
            return n;

        int temp;
        int fiboPrevious = 1;
        int fiboCurrent = 1;

        for (int i = 2; i < n; i++) {
            temp = fiboCurrent;
            fiboCurrent += fiboPrevious;
            fiboPrevious = temp;
        }
        return fiboCurrent;
    }
}
