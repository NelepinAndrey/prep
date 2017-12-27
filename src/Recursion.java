public class Recursion {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        System.out.println(recursion.factorial(-1));
        System.out.println(recursion.fib(48));
    }

    private long fib(long n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    private int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        return n * (factorial(n - 1));
    }
}