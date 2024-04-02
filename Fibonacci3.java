import java.util.Scanner;

public class Fibonacci3 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the Fibonacci series: ");
        int count = inputScanner.nextInt();

        System.out.print("Do you want the Fibonacci series in numbers or words? [N/n or W/w): ");
        String selection = inputScanner.next().toUpperCase();

        int[] fibonacciSeries = new int[count];
        fibonacciSeries[0] = 0;
        if (count > 1) {
            fibonacciSeries[1] = 1;
            for (int i = 2; i < count; i++) {
                fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
            }
        }

        if (selection.equals("N")) {
            System.out.println("Fibonacci Series in Numbers:");
            for (int number : fibonacciSeries) {
                System.out.print(number + " ");
            }
        } else if (selection.equals("W")) {
            NumberConverter numberConverter = new NumberConverter();
            System.out.println("Fibonacci Series in Words:");
            for (int number : fibonacciSeries) {
                System.out.print(numberConverter.convertToWords(number) + " ");
            }
        } else {
            System.out.println("Invalid choice. Please choose 'N' for numbers or 'W' for words.");
        }
    }
}
