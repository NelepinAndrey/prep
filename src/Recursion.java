public class Recursion {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        System.out.println(recursion.fib(48));
    }

    private int fib(long n) {
        if (n == 1 | n == 2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }
}




