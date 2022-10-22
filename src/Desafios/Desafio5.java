package Desafios;

import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        int numero;
        int auxilioContador = 0;

        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.

        System.out.println("");
        numero = leitor.nextInt();

        for (int i = 0; i < 10; i++) {
            if (numero == elementos[i]) {
                System.out.println("Achei " + numero + " na posicao " + i);
            } else {
                auxilioContador++;
            }
            if (auxilioContador == 10) {
                System.out.println("Numero " + numero + " nao encontrado! ");
            }
        }
    }
}
