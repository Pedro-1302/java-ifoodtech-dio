package Metodos;

import java.util.Scanner;

public class Ex2 {
    public static void main() {
        // Criação do método Scanner = Input
        Scanner sc = new Scanner(System.in);

        double preco;
        int parcelas;

        System.out.println("Informe o preço: ");
        preco = sc.nextDouble();

        System.out.println("Informe a quantidade de parcelas: ");
        parcelas = sc.nextInt();

        verificarSituacao(preco, parcelas);
    }

    public static void verificarSituacao(double preco, int parcelas) {
        if (parcelas == 2) {
            calcularDuasParcelas(preco);
        } else if (parcelas == 3) {
            calcularTresParcelas(preco);
        }
    }

    public static void calcularDuasParcelas(double preco) {
        double precoAJustado = preco + (preco * 0.30);

        // Formatar valor final
        String resultado = String.format("%.2f", precoAJustado);

        System.out.println("Ajuste final com duas parcelas em (R$): " + resultado);
    }

    public static void calcularTresParcelas(double preco) {
        double precoAJustado = preco + (preco * 0.45);

        // Formatar valor final
        String resultado = String.format("%.2f", precoAJustado);

        System.out.println("Ajuste final com tres parcelas em (R$): " + resultado);
    }
}
