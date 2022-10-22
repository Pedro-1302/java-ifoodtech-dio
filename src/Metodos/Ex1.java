package Metodos;

/*
    Criar uma calculadora que execute soma, subtração, multiplicação e divisão, utilizando métodos.
*/

import java.util.Scanner;

public class Ex1 {
    public static void main() {
        // Criação do método Scanner = Input
        Scanner sc = new Scanner(System.in);

        // Definição de Varíaveis de Apoio
        int primeiroNumero;
        int segundoNumero;
        int escolhaOperacao;

        // Entrada de Dados
        System.out.println("Número 1: ");
        primeiroNumero = sc.nextInt();
        System.out.println("Número 2: ");
        segundoNumero = sc.nextInt();

        // Escolha da Operação
        System.out.println("\tOperações");
        System.out.println("[ 1 ] Soma");
        System.out.println("[ 2 ] Subtração");
        System.out.println("[ 3 ] Multiplicação");
        System.out.println("[ 4 ] Divisão");
        System.out.println("\nQual operação deseja executar?");
        escolhaOperacao = sc.nextInt();

        // Verificação dos Valores
        while (escolhaOperacao < 1 || escolhaOperacao > 4){
            System.out.println("\nQual operação deseja executar?");
            escolhaOperacao = sc.nextInt();
        }

        switch (escolhaOperacao) {
            case 1:
                somarNumeros(primeiroNumero, segundoNumero);
                break;
            case 2:
                subtrairNumeros(primeiroNumero, segundoNumero);
                break;
            case 3:
                multiplicarNumeros(primeiroNumero, segundoNumero);
                break;
            case 4:
                dividirNumeros(primeiroNumero, segundoNumero);
                break;
            default:
                System.out.println("Ocorreu um erro");
                break;
        }
    }

    private static void somarNumeros(int primeiroNumero, int segundoNumero) {
        int resultadoOperacao;

        resultadoOperacao = primeiroNumero + segundoNumero;

        System.out.println(primeiroNumero + " + " + segundoNumero + " = " + resultadoOperacao);
    }

    private static void subtrairNumeros(int primeiroNumero, int segundoNumero) {
        int resultadoOperacao;

        resultadoOperacao = primeiroNumero - segundoNumero;

        System.out.println(primeiroNumero + " - " + segundoNumero + " = " + resultadoOperacao);
    }

    private static void multiplicarNumeros(int primeiroNumero, int segundoNumero) {
        int resultadoOperacao;

        resultadoOperacao = primeiroNumero * segundoNumero;

        System.out.println(primeiroNumero + " * " + segundoNumero + " = " + resultadoOperacao);
    }

    private static void dividirNumeros(int primeiroNumero, int segundoNumero) {
        int resultadoOperacao;

        resultadoOperacao = primeiroNumero / segundoNumero;

        System.out.println(primeiroNumero + " / " + segundoNumero + " = " + resultadoOperacao);
    }

}
