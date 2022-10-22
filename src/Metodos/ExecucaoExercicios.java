package Metodos;

import java.util.Scanner;

public class ExecucaoExercicios {
    public static void main(String[] args) {
        // Criação do método Scanner = Input
        Scanner sc = new Scanner(System.in);

        int escolhaExercicio;

        System.out.println("\tExercicios ");
        System.out.println("[ 1 ] Calculadora");
        System.out.println("[ 2 ] Emprestimo");
        System.out.println("[ 3 ] Mensagem");
        System.out.println("Que exercicio deseja executar?");
        escolhaExercicio = sc.nextInt();

        while (escolhaExercicio < 1 || escolhaExercicio > 3) {
            System.out.println("\n\t*ERRO*\n");
            System.out.println("\tExercicios ");
            System.out.println("[ 1 ] Calculadora");
            System.out.println("[ 2 ] Emprestimo");
            System.out.println("[ 3 ] Mensagem");
            System.out.println("Que exercicio deseja executar?");
            escolhaExercicio = sc.nextInt();
        }

        switch (escolhaExercicio) {
            case 1:
                Ex1.main();
                break;
            case 2:
                Ex2.main();
                break;
            case 3:
                Ex3.main();
                break;
            default:
                System.out.println("\nAlgo de errado aconteceu =(");
                break;
        }
    }
}
