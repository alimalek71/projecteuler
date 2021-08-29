package ir.alimalek.euler;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Euler013_LargeSum {

    public static void main(String[] args) {

        List<BigDecimal> numbers = readInput("src/main/resources/Euler013_Input.txt");

        var s = numbers.stream().reduce(new BigDecimal(0), BigDecimal::add).toString();

        System.out.println(s.substring(0, 10));

    }

    private static List<BigDecimal> readInput(String fileName) {
        List<BigDecimal> numbers = new ArrayList<>();
        try {
            File file = new File(fileName);
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                numbers.add(new BigDecimal(data));
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return numbers;
    }

}
