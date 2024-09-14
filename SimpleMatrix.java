import java.util.Scanner;

public class SimpleMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix size and elements
        int rows = 3;
        int cols = 3;
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Swap first and last columns
        for (int i = 0; i < rows; i++) {
            int temp = matrix[i][0];  // Store first column
            matrix[i][0] = matrix[i][cols - 1];  // Swap with last column
            matrix[i][cols - 1] = temp;  // Place first column in last
        }

        // Print the matrix after swapping
        System.out.println("Matrix after swapping first and last columns:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

