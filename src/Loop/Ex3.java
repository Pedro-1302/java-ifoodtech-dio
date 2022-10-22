package Loop;

/*
Ler 5 numeros e informar o maior, a soma e a média dos mesmos
 */

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int i;
        int soma = 0;
        int maior = 0;
        float media;

        for (i = 0; i < 5; i++) {
            System.out.println("Informe um numero: ");
            numero = sc.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            soma += numero;
        }

        media = (float) soma / 5;

        System.out.println("A Soma dos numeros é: " + soma);
        System.out.println("A Média dos numeros é: " + media);
        System.out.println("O maior numero é: " + maior);

    }
}
