package main;

public class FibonacciRecursive {
    public static void main(String[] args) {
        int num = 3;

        System.out.println(fib(9));
    }

    public static int fib(int n){

        if(n < 2) return n;

        return fib(n-1) + fib(n-2);

    }
}
