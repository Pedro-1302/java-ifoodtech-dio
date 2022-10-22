package Metodos;

/*
    Emitir a mensagem de acordo com o horário do dia
 */

import java.util.Scanner;
public class Ex3 {
    public static void main() {
        // Criação do método Scanner = Input
        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Informe a hora atual: ");
        hora = sc.nextInt();

        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagemBomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                mensagemBoaTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 1:
            case 2:
            case 3:
            case 4:
                mensagemBoaNoite();
                break;
            default:
                System.out.println("O valor da hora está incorreto!! ");
        }
    }

    public static void mensagemBomDia() {
        System.out.println("Bom dia!! =) ");
    }
    public static void mensagemBoaTarde() {
        System.out.println("Boa Tarde!! =) ");
    }
    public static void mensagemBoaNoite() {
        System.out.println("Boa Noite!! =) ");
    }
}
