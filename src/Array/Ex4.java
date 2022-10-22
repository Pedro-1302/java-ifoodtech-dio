package Array;

/*
gere e imprima uma matriz M 4x4 com valores aleatorios entre 0-9
 */

import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        int i;
        int y;

        for (i = 0; i < M.length; i++) {
            for (y = 0; y < M[i].length; y++) {
                M[i][y] = random.nextInt(9);
            }
        }

        System.out.println("\nMatriz: ");
        for (i = 0; i < M.length; i++) {
            for (y = 0; y < M[i].length; y++) {
                System.out.print(M[i][y] + " ");
            }
            System.out.print("\n");
        }

        // Ou como a Camilinha fez
        System.out.println("\nMatriz: ");
        for (int[] linha : M) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.print("\n");
        }
    }
}
