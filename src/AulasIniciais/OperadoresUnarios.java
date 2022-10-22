package AulasIniciais;



public class OperadoresUnarios {
    public static void main(String[] args) {
        // Troca de Sinais
        int numero = 5;

        System.out.println("Numero: " + (numero - 1));

        numero = - numero;

        System.out.println("Numero Negativo: " + numero);

        numero = + numero * -1;

        System.out.println("Numero Positivo: " + numero);


        //Incremento e Decremento

        int i = 0;

        System.out.println("Incrementar");
        for (i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("Decrementar");
        for (i = 10; i > 0; i--) {
            System.out.println(i);
        }


        // Trocar booleano

        boolean variavel = true;

        System.out.println(!variavel);

        variavel = !variavel;

        System.out.println(!variavel);
    }
}
