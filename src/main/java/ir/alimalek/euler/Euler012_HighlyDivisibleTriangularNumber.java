package ir.alimalek.euler;

public class Euler012_HighlyDivisibleTriangularNumber {

    public static void main(String[] args) {
        int sequenceNumber = 0;
        int sequenceIndex = 1;

        boolean continueSequence = true;
        while (continueSequence) {
            sequenceNumber += sequenceIndex;
            sequenceIndex++;

            if (countDivisors(sequenceNumber) > 500) {
                continueSequence = false;
                System.out.println("sequenceNumber: " + sequenceNumber + ", sequenceIndex: " + (sequenceIndex - 1));
            }

        }

    }

    private static int countDivisors(int number) {
        if (number == 1)
            return 1;

        int count = 0;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                count++;
        }

        return count + 2; // count 1 and the number
    }

}
