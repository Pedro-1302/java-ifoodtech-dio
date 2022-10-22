package Desafios;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int inputUsuario, resultado;

        System.out.println("");
        inputUsuario = numero.nextInt();

        resultado = somatorio(inputUsuario);
        System.out.println("" + resultado);
    }
    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}
