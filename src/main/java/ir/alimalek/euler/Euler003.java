package ir.alimalek.euler;

public class Euler003 {

    public static void main(String[] args) {
        long number = 600_851_475_143L;
        long sqrtNumber = (long) Math.sqrt((double) number);

        Long largestPrimeFactors = null;

        for (long i = 2; i <= sqrtNumber; i++) {
            if (number % i == 0) {
                if (isPrime(i)) {
                    System.out.println("New prime factor for " + number + " is " + i);
                    largestPrimeFactors = i;
                } else {
                    System.out.println("New factor for " + number + " is " + i);
                }
            }
        }

        System.out.println("Largest prime factor is: " + largestPrimeFactors);
    }

    private static boolean isPrime(double number) {
        for (long i = 2; i < Math.sqrt(number); i++)
            if (number % i == 0) return false;
        return true;
    }

}
