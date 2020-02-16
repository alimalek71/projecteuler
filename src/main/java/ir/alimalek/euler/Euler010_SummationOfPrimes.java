package ir.alimalek.euler;

public class Euler010_SummationOfPrimes {

    private static final int MAX_NUMBER = 2_000_000;

    public static void main(String[] args) {

        long sum = 0;

        for (int i = 2; i < MAX_NUMBER; i++)
            if (isPrime(i))
                sum += i;

        System.out.println("Summation of Prime below " + MAX_NUMBER + ": " + sum);
    }

    private static boolean isPrime(double number) {
        for (long i = 2; i <= Math.sqrt(number); i++)
            if (number % i == 0) return false;
        return true;
    }
}
