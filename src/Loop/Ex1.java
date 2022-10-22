package Loop;

/* 
Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome e o segundo a idade
(Pare inserindo o valor 0 no campo do nome) 
 */

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int i = 0;
        int idade;

        while (true) {
            System.out.println("Informe o nome: ");
            nome = sc.next();

            if (nome.equals("0")) break;

            System.out.println("Informe o idade: ");
            idade = sc.nextInt();
        }

        System.out.println("Parou");
    }
}
