package Desafios;

/*
            Rascunho Desafio
        5 x 1 = 5
        5 x 2 = 10
        5 x 3 = 15
        5 x 4 = 20

        3 x 1 = 1
        3 x 2 = 6
        3 x 3 = 9
        3 x 4 = 12
        3 x 5 = 15
        3 x 6 = 18
*/

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A, N, i, valores, somaValores;
        valores = somaValores = 0;

        A = input.nextInt();
        N = input.nextInt();

        for (i = 0; valores < N; i++) {
            valores = A * i;
            somaValores += valores;

            if (valores == N) System.out.println("" + somaValores);
        }

        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
    }
}
