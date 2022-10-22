package Loop;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja invalido
e continue pedindo ate que o usuario informe
um valor valido
 */

import javax.script.ScriptContext;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota;

            System.out.println("Informe uma nota");
            nota = sc.nextInt();

            while (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Digite novamente: ");
                nota = sc.nextInt();
            }

            System.out.println("Deu!!");
    }
}
