package ir.alimalek.euler;

public class Euler002_EvenFibonacciNumbers {

    public static void main(String[] args) {

        long fib1 = 1;
        long fib2 = 1;
        long next;
        long sum = 0;
        int counter = 1;

        do {
            next = fib1 + fib2;
            fib1 = fib2;
            fib2 = next;
            System.out.println((counter++) + ". fib1: " + fib1 + ", fib2: " + fib2);
            if (next % 2 == 0)
                sum += next;
        } while (next < 4_000_000);

        System.out.println("Sum of the even-valued terms: " + sum);
    }

}
