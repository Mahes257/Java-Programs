import java.util.Scanner;

public class SpiralMatrixAlt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter matrix size (n x n): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        // Directions: right, down, left, up
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int dir = 0; // starting direction: right
        int x = 0, y = 0;

        for (int i = 1; i <= n * n; i++) {
            matrix[x][y] = i;

            // Compute next position
            int nextX = x + dx[dir];
            int nextY = y + dy[dir];

            // Check bounds and if cell is already filled
            if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= n || matrix[nextX][nextY] != 0) {
                dir = (dir + 1) % 4; // change direction
                nextX = x + dx[dir];
                nextY = y + dy[dir];
            }

            x = nextX;
            y = nextY;
        }

        // Print the matrix
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%3d ", val);
            }
            System.out.println();
        }

        scanner.close();
    }
}

