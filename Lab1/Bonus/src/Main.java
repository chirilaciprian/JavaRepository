import java.util.*;
public class Main {
    public static void main(String[] args) {
        int n = 5; // numarul de noduri
        int[][] A = new int[n][n];
        // Cream matricea de adiacenta
        for (int i = 0; i < n; i++) {
            A[i][(i + 1) % n] = 1;
            A[(i + 1) % n][i] = 1;
        }
        print(A);
        int [][] An = new int [n][n];
        An=A;
        for(int i=1;i<n;i++)
        {
            An = matrixMultiplication(An,A);
            System.out.println("A ^" +(i+1) + ":");
            print(An);
        }

    }
    public static void print ( int[][] A){
        for (int i = 0; i < A.length; i++) {
            System.out.println(Arrays.toString(A[i]));
        }
    }
    public static int[][] matrixMultiplication(int[][] A, int[][] B) {
        int m = A.length;
        int n = A[0].length;
        int p = B[0].length;
        int[][] C = new int[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }
}