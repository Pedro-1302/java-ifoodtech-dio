package AulasIniciais;

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean condicaoUm = false;
        boolean condicaoDois = false;

        if (condicaoUm && condicaoDois) {
            System.out.println("As duas condições são verdadeiras");
        } else {
            System.out.println("As duas condições não são verdadeiras");
        }

        if (condicaoUm || condicaoDois) {
            System.out.println("Uma das condições é verdadeira");
        } else {
            System.out.println("Nenhuma das condições é verdadeira");
        }
    }
}
