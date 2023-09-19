import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square (number of rows and columns): ");
        int size = scanner.nextInt();

        // Check if the size is at least 1
        if (size < 1) {
            System.out.println("Invalid size. Please enter a positive integer.");
        } else {
            generateSquarePattern(size);
        }

        scanner.close();
    }

    // Function to generate and print the square pattern
    public static void generateSquarePattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("***"); // Change the characters here if needed
            }
            System.out.println();
        }
    }
}
