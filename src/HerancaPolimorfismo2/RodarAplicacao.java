package HerancaPolimorfismo2;

public class RodarAplicacao {
    public static void main(String[] args) {
        // Vetor da classe mãe que recebe 3 objetos
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        // Percorreu os tres objetos e chamou o método 1 de cada um deles
        // Ocorreu um polimorfismo com os objetos ClasseFilha1 e ClassFilha2
        // Polimorfismo ocorrendo em objetos diferentes
        for (ClasseMae classe: classes) {
            classe.metodo1();
        }

        System.out.println("");

        // Nao ocorre polimorfismo no primeiro objeto
        // Ocorre polimorfismo no segundo objeto
        // O ultimo é a propria classe
        for (ClasseMae classe: classes) {
            classe.metodo2();
        }

        System.out.println("");

        // Sobrescrita
        // Chamar método dentro de um objeto
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}
