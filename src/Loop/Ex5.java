package Loop;

/*
Fazer a tabuada do numero que o usuario informar
Tabuada de 1 a 10
 */

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroUsuario;
        int i;

        System.out.println("Informe um número: ");
        numeroUsuario = sc.nextInt();

        for (i = 0; i <= 10; i++) {
            System.out.println(numeroUsuario + " X " + i + " = " + (numeroUsuario * i));
        }
    }
}
