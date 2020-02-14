package ir.alimalek.euler;

public class Euler007_10001stPrime {

    public static void main(String[] args) {
        int primeCounter = 0;
        long lastPrime = 2;
        long number = 2;
        while (primeCounter != 10001) {
            if (isPrime(number)) {
                primeCounter++;
                lastPrime = number;
            }
            number++;
        }
        System.out.println(lastPrime);
    }

    private static boolean isPrime(double number) {
        for (long i = 2; i <= Math.sqrt(number); i++)
            if (number % i == 0) return false;
        return true;
    }
}
