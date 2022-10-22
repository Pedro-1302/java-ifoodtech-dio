package Loop;

/*
Faça um programa que calcule o fatorial de um numero fornecedio pelo usuario
Ex.: 5! = 120 (5 * 4 * 3 * 2 * 1)
 */

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fatorial;
        int multiplicacao = 1;
        int i;

        System.out.println("Informe um número: ");
        fatorial = sc.nextInt();

        for (i = fatorial; i >= 1 ; i--) {
            multiplicacao *= i;
        }

        System.out.println(fatorial + "! = " + multiplicacao);
    }
}
