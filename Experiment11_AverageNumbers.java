import java.util.Scanner;

public class Experiment11_AverageNumbers {

    private double[] numbers;

    Experiment11_AverageNumbers(double[] numbers) {
        this.numbers = numbers;
    }

    double calculateAverage() {

        double sum = 0;

        for (double number : numbers) {
            sum = sum + number;
        }

        return sum / numbers.length;
    }

    int countAboveAverage(double average) {

        int count = 0;

        for (double number : numbers) {

            if (number > average) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextDouble();
        }

        Experiment11_AverageNumbers obj =
                new Experiment11_AverageNumbers(numbers);

        double average = obj.calculateAverage();

        int count = obj.countAboveAverage(average);

        System.out.println("Average = " + average);
        System.out.println("Numbers above average = " + count);

        sc.close();
    }
}