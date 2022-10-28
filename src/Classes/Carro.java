package Classes;

// Classe
public class Carro {

    // Atributos
    String cor;
    String modelo;
    int capacidadeTanque;

    //Construtor

    Carro() {

    }

    Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    // Get e Set

    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    // Get e Set encher tanque

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    // Método encher tanque
    double valorTotalTanque(){
        return capacidadeTanque * 4.29;
    }

    public static void main(String[] args) {
        // Objeto
        Carro carro = new Carro("Amarelo", "Camaro", 20);

        // Mensagem = carro.<método>
        System.out.println("O " + carro.getModelo() + " " + carro.getCor() + " possui capacidade de " + carro.getCapacidadeTanque() + " litros e precisa de R$ " + carro.valorTotalTanque() + " para encher o tanque");
    }
}
