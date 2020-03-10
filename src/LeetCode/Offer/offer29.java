package LeetCode.Offer;

public class offer29 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        Circleprint(matrix);
    }

    private static void Circleprint(int[][] matrix) {
        int i = 0;
        int j = 0;
        int l = matrix.length;
        int mid = l / 2;
        for (int m = l; m >= mid; m--) {
                while (j < m) {
                    System.out.println(matrix[i][j]);
                    j++;
                }
                j--;
                i++;
                while (i < m) {
                    System.out.println(matrix[i][j]);
                    i++;
                }
                i--;
                j--;
                while (j >= l-m) {
                    System.out.println(matrix[i][j]);
                    j--;
                }
                j++;
                i--;
                while (i > l-m) {
                    System.out.println(matrix[i][j]);
                    i--;
                }
                i++;
                j++;
        }
    }
}
