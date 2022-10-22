package Array;

/*
Faça um programa que leia um vetor de 6 caracteres, e diga quantas consoantes
foram lidas. Imprima as consoantes.
 */

import javax.script.ScriptContext;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        String[] vogais = new String[6];
        int quantidadeConsoantes = 0;
        int quantidadeVogais = 0;
        int a = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if ( !(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) )  {
                consoantes[count] = letra;
                quantidadeConsoantes++;
            } else {
                quantidadeVogais++;
                vogais[count] = letra;
                a++;
            }

            count++;

        } while(count < consoantes.length);

        System.out.println("");
        System.out.print("Consoantes: ");
        for ( String consoante  :  consoantes ) {
            if ( consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("");
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);

        System.out.println("");
        System.out.print("Vogais: ");
        for ( String vogal  :  vogais ) {
            if ( vogal != null)
                System.out.print(vogal + " ");
        }
        System.out.println("");
        System.out.println("Quantidade de vogais: " + quantidadeVogais);
    }

}
