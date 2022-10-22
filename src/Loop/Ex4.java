package Loop;

/*
Faça um programa que peã N numeros inteiros,
calcule e mostre a quantidade de numeros pares
e a quantidade de numeros pares e impares
 */

import java.util.Date;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nNumeros = 0;
        int numero = 0;
        int resultadoOperação;
        int pares = 0;
        int impares = 0;
        int i = 0;



        System.out.println("Informe a quantidade de numeros que deseja gerenciar: ");
        nNumeros = sc.nextInt();

        for (i = 0; i < nNumeros; i++) {
            System.out.println("Informe um numero");
            numero = sc.nextInt();

            resultadoOperação = numero % 2;

            if (resultadoOperação == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("A quantidade de numeros pares é: " + pares);
        System.out.println("A quantidade de numeros impares é: " + impares);
    }
}
