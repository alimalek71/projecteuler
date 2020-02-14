package ir.alimalek.exercise;

public class Euler001 {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i < 1000; i++)
            if (isMultipleBy3Or5(i))
                sum += i;

        System.out.println("Sum of all the multiples of 3 or 5 below 1000: " + sum);
    }

    private static boolean isMultipleBy3Or5(int number) {
        return number % 3 == 0 || number % 5 == 0;
    }

}
