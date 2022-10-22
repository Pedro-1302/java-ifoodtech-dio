package IfSwitch;

public class ControleDeFluxo {
    public static void main(String[] args) {
        // Operador Ternario = condição ? exp (true) : exp2 (false);
        // Outro exemplo = condição ? true : null;


        // Exercicio

        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifMenor();

        switchSemana();
        switchNumero();
        switchFerias();
    }

    // Jeito errado
    private static void ifFlecha() {
        int mes = 4;

        if (mes == 1) {
            System.out.println("Janeiro");
        } else {
            if (mes == 2) {
                System.out.println("Fevereiro");
            } else {
                if (mes == 3) {
                    System.out.println("Março");
                } else {
                    if (mes == 4) {
                        System.out.println("Abril");
                    } else {
                        if (mes == 5) {
                            System.out.println("Maio");
                        }
                    }
                }
            }
        }
    }

    // If certo - boas praticas
    private static void ifSemFlecha() {
        int mes = 3;
        if (mes == 1) {
            System.out.println("Janeiro");
        }
        else if (mes == 2){
                System.out.println("Fevereiro");
        }
        else if (mes == 3){
            System.out.println("Março");
        }
        else if (mes == 4){
            System.out.println("Abril");
        }
        else if (mes == 5){
            System.out.println("Maio");
        }

    }

    //Jeito errado
    private static void ifFerias() {
        String mes = "julho";

        if (mes == "julho" || mes == "dezembro" || mes == "janeiro") {
            System.out.println("Ferias");
        }
    }

    private static void ifMenor()
    {
        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;
        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
            System.out.println("Funcionario deve receber auxilio");
        }

        boolean salariobaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        if ((salariobaixo) && (muitosDependentes)) {
            System.out.println("Funcionario deve receber auxilio");
        }

        boolean recebeAuxilio = (salariobaixo) && (muitosDependentes);

        if (recebeAuxilio) {
            System.out.println("Funcionario deve receber auxilio");
        } else {
            System.out.println("Funcionario não deve receber auxilio");
        }
    }

    private static void switchSemana() {
        String dia = "Terça";

        switch (dia) {
            case "Segunda" :
                System.out.println((2));
                break;
            case "Terça" :
                System.out.println((3));
                break;
            case "Quarta" :
                System.out.println((4));
                break;
            case "Quinta" :
                System.out.println((5));
                break;
            case "Sexta" :
                System.out.println((6));
                break;
            case "Sabado" :
                System.out.println((7));
                break;
            case "Domingo" :
                System.out.println((1));
                break;
            default:
                System.out.println("Valor Indefinido");
                break;
        }
    }

    private static void switchNumero() {
        int numero = 4;

        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor Indefinido");
                break;
        }
    }

    private static void switchFerias() {
        String mes = "dezembro";
        switch (mes) {
            case "dezembro":
            case "julho":
            case "janeiro":
                System.out.println("Férias");
                break;
            default:
                System.out.println("Mês Indefinido");
                break;
        }
    }
}
