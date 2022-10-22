package AulasIniciais;

public class OperadoresTernarios {
    public static void main(String[] args) {
        // É um IF reduzido representado por ?

        int a, b;

        a = b = 3;

        String resultado = "";

        // Forma Natural

        if (a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);

        // Forma Ternaria

        resultado = a==b ? "verdadeiro" : "falso";

        System.out.println(resultado);
    }
}

