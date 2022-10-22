package AulasIniciais;



public class OperadoresRelacionais {
    public static void main(String[] args) {
        // == Igualdade
        // != Diferença
        // > Maior
        // < Menor
        String nomeUm = "Pedrao";
        String nomeDois = "Pedrao";

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm diferente que numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm maior que numeroDois? " + simNao);

        simNao = numero1 < numero2;

        System.out.println("numeroUm menor que numeroDois? " + simNao);

        simNao = nomeUm == nomeDois;

        System.out.println("Nome um igual a nome dois? " + simNao);
    }
}
