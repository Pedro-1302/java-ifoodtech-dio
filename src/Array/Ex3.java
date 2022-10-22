package Array;

import java.util.Random;
import java.util.Scanner;

/*
Faça um programa que leia 20 numeros inteiros aleatorios (entre 0 e 100) e armazene em um vetor.
Depois mostrar os numeros e seus sucessores.
 */
public class Ex3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int[] numerosAleatorios = new int[20];
        int i;

        // Gera os numeros aleatorios
        for (i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("\nNúmeros Aleatórios: ");
        for (int numero: numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.println("\nSucessores Números Aleatórios: ");
        for (int numero: numerosAleatorios) {
            System.out.print(numero + 1 + " ");
        }

        System.out.println("\nAntecessores Números Aleatórios: ");
        for (int numero: numerosAleatorios) {
            System.out.print(numero - 1 + " ");
        }

    }
}
