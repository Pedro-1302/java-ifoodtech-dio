package AulasIniciais;

public class MetodosParametros {
    public static void main(String[] args) {
        String primeiroNome = "Pedro";
        String segundoNome = "Franco";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do Método" + primeiroNome.concat(" ").concat(segundoNome);
    }
}
