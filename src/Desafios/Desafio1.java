package Desafios;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //TODO: Imprima se os valores numéricos passados são iguais ou não.

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        System.out.println((numero1 == numero2) ? "Sao iguais!" : "Nao sao iguais!");
    }
}
