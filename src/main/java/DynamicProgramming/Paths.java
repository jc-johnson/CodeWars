package src.main.java.DynamicProgramming;

/**
 * Created by Jordan on 6/12/2017.
 */
public class Paths {

    // memoization
    public static int countPaths(boolean[][] grid, int row, int col, int[][] paths) {

        if (!validSquare(grid, row, col)) return 0;
        if (isAtEnd(grid, row, col)) return 1;
        if (paths[row][col] == 0) {
            paths[row][col] = countPaths(grid, row+1, col) + countPaths(grid, row, col+1);
        }
        return paths[row][col];
    }

    // non memoization
    public static int countPaths(boolean[][] grid, int row, int col) {

        if (!validSquare(grid, row, col)) return 0;
        if (isAtEnd(grid, row, col)) return 1;
        return countPaths(grid, row + 1, col) + countPaths(grid, row, col+1);
    }

    public static boolean validSquare(boolean[][] grid, int row, int col) {
        return grid[row][col];
    }

    public static boolean isAtEnd(boolean[][] grid, int row, int col) {
        if (row == grid.length && col == grid[grid.length].length) return true;
        return false;
    }
}
