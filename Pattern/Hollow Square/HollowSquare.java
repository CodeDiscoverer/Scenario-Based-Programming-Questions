import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square (number of rows and columns): ");
        int n = scanner.nextInt();

        // Check if the size is at least 2
        if (n < 2) {
            System.out.println("Invalid size. Please enter a positive integer greater than or equal to 2.");
        } else {
            generateSquarePattern(n);
        }

        scanner.close();
    }

    // Function to generate and print the square pattern
    public static void generateSquarePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print stars for the corners and spaces for the interior
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
